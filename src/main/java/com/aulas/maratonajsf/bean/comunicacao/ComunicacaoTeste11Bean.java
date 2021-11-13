/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.comunicacao;

import com.aulas.maratonajsf.model.Estudante;
import com.aulas.maratonajsf.util.ApplicationMapUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped
public class ComunicacaoTeste11Bean implements Serializable{
    private List<Estudante> estudanteList = Estudante.estudanteList();
    
    public String editar(Estudante estudante){
        ApplicationMapUtil.setValueInApplicationMap("estudante", estudante);
        return "comunicacao12?faces-redirect=true";
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
    
    
}
