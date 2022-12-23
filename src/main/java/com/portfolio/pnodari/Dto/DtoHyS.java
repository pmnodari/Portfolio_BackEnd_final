/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.pnodari.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author pmnod
 */
public class DtoHyS {
    
    @NotBlank
    private String nombreHS;
    
     @NotBlank
    private int porcentajeHS;

    public DtoHyS() { }

    public DtoHyS(String nombreHS, int porcentajeHS) {
        this.nombreHS = nombreHS;
        this.porcentajeHS = porcentajeHS;
    }

    public String getNombreHS() {
        return nombreHS;
    }

    public void setNombreHS(String nombreHS) {
        this.nombreHS = nombreHS;
    }

    public int getPorcentajeHS() {
        return porcentajeHS;
    }

    public void setPorcentajeHS(int porcentajeHS) {
        this.porcentajeHS = porcentajeHS;
    }
    
    

    
    
    
     
    
    
}
