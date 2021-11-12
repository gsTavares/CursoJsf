/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.session;

import com.aulas.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@SessionScoped // O bean e todos os seus atributos ficarão ativos durante toda a sessão
// Utilização --> quando um atributo específico precisa ficar disponível durante todo o sistema

public class TesteSessionBean implements Serializable{
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private Estudante estudante;
    
    @PostConstruct // Realizar o método abaixo após os atributos e construtores forem criados
    public void init(){
        System.out.println("Entrou no PostConstruct do SessionScoped");
        personagens = Arrays.asList("Goku", "Vegeta", "Gohan");
        logar();
    }
    
    public void logar(){
        // Fez consulta no banco, verificou se está ok
        estudante = new Estudante();
    }
    
    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3); // Gera um número aleatório de 0 a 3
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }
    
    // Finalizando sessão
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
