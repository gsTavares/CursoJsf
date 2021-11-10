/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ConversationScoped // Transient --> como uma espera
// Vinculado com a sessão (se não for finalizado, ele ficará vivo até a sessão ser encerrada)

public class TesteConversationBean implements Serializable{
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    
    @Inject
    private Conversation conversation;
    
    public void init(){
        System.out.println("Entrou no PostConstruct do ConversationScoped");
        personagens = Arrays.asList("Luffy", "Zoro", "Sandy");
        if(conversation.isTransient()){
            conversation.begin();
            System.out.println("Iniciando ConversationScoped, ID ="+conversation.getId());
        }
    }
    
    public String endConversation(){
        if(!conversation.isTransient()){
            conversation.end();
        }
        
        return "conversation?faces-redirect=true";
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

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
    
    
}
