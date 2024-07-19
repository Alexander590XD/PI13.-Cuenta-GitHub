/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;
import java.util.Scanner;

/**
 *
 * @author pato4
 */
public class ManagerEjecutivo extends Manager {
 
    private String responsa;
    private String idiomas;
    private String habilidades;
    
    public ManagerEjecutivo() {
        super(); 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Responsabilidades: ");
        this.responsa = scanner.nextLine();
        
        System.out.print("Idiomas dominados: ");
        this.idiomas = scanner.nextLine();
        
        System.out.print("Habilidades especiales: ");
        this.habilidades = scanner.nextLine();
    }
    
     public ManagerEjecutivo(String n, String ap, String am, String curp, int e, char g, int id, String cor, int tel, String dept, float sue, int experiencia, String resp, String langs, String bili) {
        super(n, ap, am, curp, e, g, id, cor, tel, dept, sue, experiencia); 
        this.responsa = resp;
        this.idiomas = langs;
        this.habilidades = bili;
    }

    /**
     * @return the responsa
     */
    public String getResponsa() {
        return responsa;
    }

    /**
     * @param responsa the responsa to set
     */
    public void setResponsa(String responsa) {
        this.responsa = responsa;
    }

    /**
     * @return the idiomas
     */
    public String getIdiomas() {
        return idiomas;
    }

    /**
     * @param idiomas the idiomas to set
     */
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * @return the habilidades
     */
    public String getHabilidades() {
        return habilidades;
    }

    /**
     * @param habilidades the habilidades to set
     */
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
     
      public void mostrarInfoManagerEjecutivo() {
        super.mostrarInfoManager();
        System.out.println("Responsabilidades: " + responsa);
        System.out.println("Idiomas dominados: " + idiomas);
        System.out.println("Habilidades especiales: " + habilidades);
    }
   
}
