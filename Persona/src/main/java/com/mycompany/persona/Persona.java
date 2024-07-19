/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;
import java.util.Scanner;


/**
 *
 * @author pato4
 */
public abstract class Persona {

    protected String nombre;
    protected String apellidoP;
    protected String apellidoM;
    protected String CURP;
    protected int edad;
    protected char genero;
    
    public Persona(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.println("Apellido Paterno: ");
        this.apellidoP = scanner.nextLine();
        System.out.println("Apellido Materno: ");
        this.apellidoM = scanner.nextLine();
        System.out.println("CURP: ");
        this.CURP = scanner.nextLine();
        System.out.println("Edad: ");
        this.edad = scanner.nextInt();
        System.out.println("Genero: (M)asculino/(F)emenino");
        this.genero = scanner.next().charAt(0);
    }
    
    public Persona(String n, String ap, String am, String curp, int e, char g) {
        this.nombre = n;
        this.apellidoP = ap;
        this.apellidoM = am;
        this.CURP = curp;
        this.edad = e;
        this.genero = g;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the apellidoM
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * @param apellidoM the apellidoM to set
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
      
    public void mostrarInfoPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoP);
        System.out.println("Apellido Materno: " + apellidoM);
        System.out.println("CURP: "+ CURP);
        System.out.println("Edad: "+ edad);
        System.out.println("Genero: "+ genero);
    }
}