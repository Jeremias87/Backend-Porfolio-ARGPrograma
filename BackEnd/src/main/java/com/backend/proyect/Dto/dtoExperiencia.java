/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.proyect.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String startE;
    @NotBlank
    private String endE;
    
    
    //Const

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String startE, String endE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.startE = startE;
        this.endE = endE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getStartE() {
        return startE;
    }

    public void setStartE(String startE) {
        this.startE = startE;
    }

    public String getEndE() {
        return endE;
    }

    public void setEndE(String endE) {
        this.endE = endE;
    }

   
   
   
}
