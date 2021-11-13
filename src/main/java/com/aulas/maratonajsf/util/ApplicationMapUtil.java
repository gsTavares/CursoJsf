/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author Marketing
 */
public class ApplicationMapUtil {
    public static Object getValueFromApplicationMap(String key){
        return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
    }
    
    // Colocar objetos na sessão
    public static void setValueInApplicationMap(String key, Object value){
        FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
    }
}
