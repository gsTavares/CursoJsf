/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named // Torna possível o acesso a classe para uso de expression language no front end
@RequestScoped // Escopo que vai ficar vivo durante a requisição http
// Quando a requisição acaba, todos os atributos são derrubados (estado reiniciado)
// Quando uma nova requisição chega ao servidor, todos eles são criados novamente
// Utilização --> somente para exibição de dados 
// --> forward/redirect

public class TesteRequestBean implements Serializable {

    private List<String> personagens = Arrays.asList("Yusuke", "Hiei", "Kurama");
    private List<String> personagemSelecionado = new ArrayList<>();
    
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
