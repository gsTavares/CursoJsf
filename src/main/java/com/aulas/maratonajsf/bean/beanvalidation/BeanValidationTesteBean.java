/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.beanvalidation;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Marketing
 */
@Named
@ViewScoped

public class BeanValidationTesteBean implements Serializable {

    @Size(max = 10, message = "O nome tem que ter entre 3 e 10 caracteres")
    @NotNull(message = "O nome é obrigatório")
    private String nome;
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$",
            message = "Digite um email válido")
    private String email;

    @DecimalMax(value = "30.50", message = "O valor decimal não pode ser maior do que 30.50")
    @DecimalMin(value = "5.00", message = "O valor decimal não pode ser menor do que 5.00")
    private double decimal;

    @Digits(integer = 3, fraction = 2,
            message = "O valor não pode ser maior que 999 e casa decimal maior que 2 dígitos")
    private double numero;

    public void salvar() {
        System.out.println(nome);
        System.out.println(email);
        System.out.println(decimal);
        System.out.println(numero);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
