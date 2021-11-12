/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.view;

import com.aulas.maratonajsf.bean.dependent.TesteDependentBean;
import com.aulas.maratonajsf.bean.session.TesteSessionBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped // Enquanto o usuário se manter na página, os valores do bean são mantidos
// Muito útil para requisições ajax (que são parciais e retornam na mesma página onde ela foi chamada)

public class TesteViewBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    // Injeção do @Dependent
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;
    
    @Inject
    public TesteViewBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }
    
    
    
    @PostConstruct // Realizar o método abaixo após os atributos e construtores forem criados
    public void init(){
        System.out.println("Entrou no PostConstruct do ViewScoped");
        personagens = Arrays.asList("Naruto", "Hinata", "Yondaime");
    }
    
    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3); // Gera um número aleatório de 0 a 3
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
        dependentBean.getPersonagemSelecionado().add(personagem);
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }

    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }
    
    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
