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
public class Programador extends Empleado{
    
    private String departamento;
    private float sueldo;
    private String lenguajes;
    private int experiencia;
    private String educacion;
    private String habilidades;
    
    public Programador() {
        super(); // Llama al constructor de Empleado

        Scanner scanner = new Scanner(System.in);

        System.out.print("Departamento: ");
        this.departamento = scanner.nextLine();

        System.out.print("Sueldo: ");
        this.sueldo = scanner.nextFloat();
        scanner.nextLine(); // Consumir la nueva línea después de nextFloat()

        System.out.print("Lenguajes de programación: ");
        this.lenguajes = scanner.nextLine();

        System.out.print("Experiencia (en años): ");
        this.experiencia = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nivel de educación: ");
        this.educacion = scanner.nextLine();

        System.out.print("Habilidades específicas: ");
        this.habilidades = scanner.nextLine();
    }
    
    public Programador(String n, String ap, String am, String curp, int e, char g, int id, String cor, int tel,
                       String dep, float s, String len, int exp, String edu, String hab) {
        super(n, ap, am, curp, e, g, id, cor, tel); 
        this.departamento = dep;
        this.sueldo = s;
        this.lenguajes = len;
        this.experiencia = exp;
        this.educacion = edu;
        this.habilidades = hab;
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
     * @return the lenguajes
     */
    public String getLenguajes() {
        return lenguajes;
    }

    /**
     * @param lenguajes the lenguajes to set
     */
    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    /**
     * @return the experiencia
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return the educacion
     */
    public String getEducacion() {
        return educacion;
    }

    /**
     * @param educacion the educacion to set
     */
    public void setEducacion(String educacion) {
        this.educacion = educacion;
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
    
    public void mostrarInfoProg() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Lenguajes de programación: " + lenguajes);
        System.out.println("Experiencia (en años): " + experiencia);
        System.out.println("Nivel de educación: " + educacion);
        System.out.println("Habilidades específicas: " + habilidades);
    }
}
