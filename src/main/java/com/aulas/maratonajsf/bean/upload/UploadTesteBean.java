/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajsf.bean.upload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author Marketing
 */

@Named
@ViewScoped
public class UploadTesteBean implements Serializable{
    private Part file;
    
    public void upload(){
        
        if(file == null){
            return;
        }
        
        try (InputStream is = file.getInputStream()){
            
            String fileName = file.getSubmittedFileName();
            System.out.println(file.getName());
            System.out.println(fileName);
            System.out.println(file.getSize());
            System.out.println(file.getContentType());
            System.out.println(file.getHeader("Content-Disposition"));
            System.out.println(file.getHeader("Content-Type"));
            
            Files.copy(is, 
                    new File("C:\\Users\\Marketing\\Documents\\NetBeansProjects\\CursoJsf\\arquivo", fileName).toPath());
            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Arquivo enviado com sucesso", "");
            FacesContext.getCurrentInstance().addMessage(null, message);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
    
}
