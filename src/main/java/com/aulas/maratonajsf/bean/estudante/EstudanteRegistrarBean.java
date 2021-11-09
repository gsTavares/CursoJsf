/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.estudante;

import com.aulas.maratonajsf.model.Estudante;
import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */

@Named
public class EstudanteRegistrarBean implements Serializable{
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    
}
