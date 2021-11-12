/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped

public class ComunicacaoTeste3Bean implements Serializable{
    private String nome;
    private String sobrenome;
    
    public void init(){
        System.out.println("Criou comunicação 3");
        System.out.println(nome);
        System.out.println(sobrenome);
    }
    
    
    public String save(){
        System.out.println("Salvando...");
        return "resultado?faces-redirect=true&amp;includeViewParams=true";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
