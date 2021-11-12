/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.dependent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */

@Named
@Dependent // Dependente do escopo aonde ele será injetado
public class TesteDependentBean implements Serializable{
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    
    @PostConstruct // Realizar o método abaixo após os atributos e construtores forem criados
    public void init(){
        System.out.println("Entrou no PostConstruct do @Dependent");
        personagens = Arrays.asList("Naruto", "Hinata", "Yondaime");
    }
    
    public void selecionarPersonagem(){
        int index = ThreadLocalRandom.current().nextInt(3); // Gera um número aleatório de 0 a 3
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
