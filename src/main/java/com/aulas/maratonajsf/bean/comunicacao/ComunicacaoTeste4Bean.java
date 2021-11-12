/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.comunicacao;

import com.aulas.maratonajsf.model.Estudante;
import java.io.Serializable;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable{
    private String buttonName = "Nome do botão do bean";
    private Estudante estudante = new Estudante();
    
    public void execute(ActionEvent event){
        String nome = (String) event.getComponent().getAttributes().get("nome");
        String adjetivo = (String) event.getComponent().getAttributes().get("adjetivo");
        Estudante estudante = (Estudante) event.getComponent().getAttributes().get("estudante");
        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudante.getNome());
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
    
    
}
