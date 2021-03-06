/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.ajax;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped

public class AjaxTesteBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private Map<String, List<String>> animePersonagensMap;
    private List<String> personagens;
    private String animeSelecionado;
    private String personagemSelecionado;
//    {
//        animePersonagensMap = new TreeMap<>();
//        animePersonagensMap.put("Hellsing", Arrays.asList("Alucard", "Seras", "Alexander"));
//        animePersonagensMap.put("Attack on Titan", Arrays.asList("Eren", "Mikasa", "Armin"));
//        animePersonagensMap.put("Berserk", Arrays.asList("Guts", "Casca", "Griffith"));
//    }

    public void init() {
        animePersonagensMap = new TreeMap<>();
        animePersonagensMap.put("Hellsing", Arrays.asList("Alucard", "Seras", "Alexander"));
        animePersonagensMap.put("Attack on Titan", Arrays.asList("Eren", "Mikasa", "Armin"));
        animePersonagensMap.put("Berserk", Arrays.asList("Guts", "Casca", "Griffith"));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, List<String>> getAnimePersonagensMap() {
        return animePersonagensMap;
    }

    public void setAnimePersonagensMap(Map<String, List<String>> animePersonagensMap) {
        this.animePersonagensMap = animePersonagensMap;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public String getAnimeSelecionado() {
        return animeSelecionado;
    }

    public void setAnimeSelecionado(String animeSelecionado) {
        this.animeSelecionado = animeSelecionado;
    }

    public String getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(String personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
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

    public void onSelectAnime() {
        if (animeSelecionado == null) {
            personagens = null;
            return;
        }
        personagens = animePersonagensMap.get(animeSelecionado);
    }

    public void toUppercase(AjaxBehaviorEvent event) {
        this.nome = this.nome.toUpperCase();
        this.sobrenome = this.sobrenome.toUpperCase();
    }

    public void toUppercaseNome() {
        this.nome = this.nome.toUpperCase();
    }
}
