/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.validators;

import com.aulas.maratonajsf.bean.login.LoginBean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Marketing
 */

@Named
@RequestScoped
public class Validators implements Serializable{
    private List<String> emailsList = Arrays.asList("gustavo.tavares@gmail.com", "contato@devdojo.com.br");
    @Inject
    private LoginBean loginBean;
    
    public void validateDuplicatedEmail(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        String email = (String) t;
        if(emailsList.contains(email)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email já existe cadastrado", "");
            
            throw new ValidatorException(message);
        }
    }
}
