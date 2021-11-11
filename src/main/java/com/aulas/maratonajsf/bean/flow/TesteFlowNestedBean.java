/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.flow;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable{
    private String userName;
    private String userSurname;

    public String validarUser(){
        System.out.println("Fazendo consulta no SERASA");
        System.out.println("Fazendo consulta no SPC");
        System.out.println("Pedindo a permissão de Deus");
        System.out.println("Sacrificando um bode");
        
        if(true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Usuario não passou nas pendencias", 
                    "Detalhe útil"));
            return null;
        }
        
        return "procedToRegistration3";
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
    
    
}
