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
public class Manager extends Empleado {
     
    protected String departamento;
    protected float sueldo;
    protected int experienciaL;
    
    public Manager() {
        super(); 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Departamento: ");
        this.departamento = scanner.nextLine();
        
        System.out.print("Sueldo: ");
        this.sueldo = scanner.nextFloat();
        
        System.out.print("Experiencia laboral (años): ");
        this.experienciaL = scanner.nextInt();
    }
    
    public Manager(String n, String ap, String am, String curp, int e, char g, int id, String cor, int tel, String dept, float sue, int experiencia) {
        super(n, ap, am, curp, e, g, id, cor, tel); 
        this.departamento = dept;
        this.sueldo = sue;
        this.experienciaL = experiencia;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the experienciaL
     */
    public int getExperienciaL() {
        return experienciaL;
    }

    /**
     * @param experienciaL the experienciaL to set
     */
    public void setExperienciaL(int experienciaL) {
        this.experienciaL = experienciaL;
    }
    
    public void mostrarInfoManager(){
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Experiencia laboral (años): " + experienciaL);
    }
    
}
