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
public class Empleado extends Persona {
    
    protected int idEmpleado;
    protected String correo;
    protected int numTel;
    
    public Empleado() {
        super();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID de empleado: ");
        this.idEmpleado = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Correo Electrónico: ");
        this.correo = scanner.nextLine();
        
        System.out.print("Número de teléfono: ");
        this.numTel = scanner.nextInt();
    }
    
    public Empleado(String n, String ap, String am, String curp, int e, char g, int id, String cor, int tel) {
        super(n, ap, am, curp, e, g);
        this.idEmpleado = id;
        this.correo = cor;
        this.numTel = tel;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the numTel
     */
    public int getNumTel() {
        return numTel;
    }

    /**
     * @param numTel the numTel to set
     */
    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }
    
    public void mostrarInfo() {
        super.mostrarInfoPersona();
        System.out.println("ID de empleado: " + idEmpleado);
        System.out.println("Correo: " + correo);
        System.out.println("Número de teléfono: " + numTel);
    }
}
