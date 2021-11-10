/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ApplicationScoped // É executado uma única vez e mantém o bean vivo enquanto o servidor permanecer rodando
// Qualquer bean pode acessar os atributos de um bean @ApplicationScoped

public class TesteApplicationBean implements Serializable{
    private List<String> categoriaList;
    
    @PostConstruct
    public void init(){
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror");
    }
    
    public void mudarLista(){
        categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror", "Drama");
    }

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
    
    
}
