/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.estudante;

import com.aulas.maratonajsf.model.Estudante;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped // Enquanto o usuário estiver nessa tela (index.xhtml),
// mantenha o estado de todos os atributos criados
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "eh", "foda"};
    private List<String> nomesList = Arrays.asList("Gustavo", "Gabriel", "Hugo", "Sandy");
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Luffy", "Naruto", "Kuririn"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas = false;
    private boolean mostrarLink = false;
    
    
    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("One piece", "O mais longo");
        nomesMap.put("Naruto", "O com mais lenga lenga");
    }
    
    public void executar(){
        System.out.println("Fazendo uma busca no banco de dados...");
        System.out.println("Processando os dados...");
        System.out.println("Exibindo os dados...");
    }
    
    public void executar(String param){
        System.out.println("Fazendo uma busca no banco de dados com o PARAMÊTRO: "+param+"...");
        System.out.println("Processando os dados com o PARÂMETRO: "+param+"...");
        System.out.println("Exibindo os dados com o PARÂMETRO: "+param+"...");
    }
    
    public String executarRetorno(String param){
        return "Quem é eh o lindão? "+param;
    }
    
    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }
    
    public void exibirNotas(){
        this.mostrarNotas = true;
    }
    
    public void esconderNotas(){
        this.mostrarNotas = false;
    }
    
    public void exibirLink(){
        this.mostrarLink = true;
    }
    
    public void esconderLink(){
        this.mostrarLink = false;
    }
    
    public void calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println(result);
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }
    
    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }
    
    
    
    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

}
