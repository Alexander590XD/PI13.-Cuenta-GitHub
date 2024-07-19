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
public class Secretaria extends Empleado{
    
    private String departamento;
    private float sueldo;
    private String telefonoOficina;
    private String supervisor;
    private String direccionOficina;
    
    public Secretaria() {
        super(); 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Departamento: ");
        this.departamento = scanner.nextLine();

        System.out.print("Sueldo: ");
        this.sueldo = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Teléfono de oficina: ");
        this.telefonoOficina = scanner.nextLine();

        System.out.print("Supervisor: ");
        this.supervisor = scanner.nextLine();

        System.out.print("Dirección de la oficina: ");
        this.direccionOficina = scanner.nextLine();
    }
    
     public Secretaria(String n, String ap, String am, String curp, int e, char g, int id, String cor, int tel,
                       String dep, float s, String telOf, String sup, String dirOf) {
        super(n, ap, am, curp, e, g, id, cor, tel);
        this.departamento = dep;
        this.sueldo = s;
        this.telefonoOficina = telOf;
        this.supervisor = sup;
        this.direccionOficina = dirOf;
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
     * @return the telefonoOficina
     */
    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    /**
     * @param telefonoOficina the telefonoOficina to set
     */
    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the direccionOficina
     */
    public String getDireccionOficina() {
        return direccionOficina;
    }

    /**
     * @param direccionOficina the direccionOficina to set
     */
    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }
    
    public void mostrarInfoS(){
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Telefono de oficina: " + telefonoOficina);
        System.out.println("Supervisor: " + supervisor);
        System.out.println("Dirección de la Oficina: " + direccionOficina);
    }
    
}
