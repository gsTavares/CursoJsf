/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.login;

import com.aulas.maratonajsf.model.Estudante;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@SessionScoped

public class LoginBean implements Serializable{
    private String nome;
    private String senha;
    private Estudante estudante;
    
    
    public String logar(){
        // Faz uma busca no banco
        if(nome.equals("w") && senha.equals("1")){
            estudante = new Estudante();
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("null", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário e/ou senha inválidos", ""));
        return null;
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        estudante = null;
        return "/login?faces-rediretc=true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    
    
}
