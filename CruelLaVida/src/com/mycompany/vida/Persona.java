/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vida;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private String nacionalidad; // atributo agregado
    private String sangre; // atributo agregado
    private String Holaxd; // atributo agregado
    private String colordepiel; // atributo agregado 
    private int edad;
    private char genero;

    public void nacer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce el Apellido Paterno:");
        apellidoP = sc.nextLine();
        System.out.println("Introduce el Apellido Materno:");
        apellidoM = sc.nextLine();
        edad = 0;
        System.out.println("Introduce la primer letra del genero (M)asculino (F)emenino:");
        genero = sc.next().charAt(0);
        sc.nextLine(); // Clear the buffer
        System.out.println("Hola xd:");
        Holaxd = sc.nextLine();
        System.out.println("Introduce la sangre:");
        sangre = sc.nextLine();
        System.out.println("Introduce el color de piel:");
        colordepiel = sc.nextLine();
        System.out.println("Introduce la nacionalidad:");
        nacionalidad = sc.nextLine();
    }

    public void crecer() {
        Scanner sc = new Scanner(System.in);
        int anios;
        System.out.println("¿Cuantos años quieres incrementar la edad de " + nombre + "?");
        anios = sc.nextInt();
        edad += anios;
    }

    public void hablar() {
        System.out.println(nombre + " está hablando con el Macaco y el chino...");
    } 

    public void comer() {
        System.out.println(nombre + " está comiendo como si no hubiera un mañana...");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo debajo de un puente...");
    }

    public void huir() {
        System.out.println(nombre + " está huyendo de la policía...");
    }

    public void reir() {
        System.out.println(nombre + " está riendo para no llorar...");
    }

    public void mostrarInfo() {
        System.out.println("\n.........................................");
        System.out.println("\t°Datos que fueron ingresados° \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoP);
        System.out.println("Apellido Materno: " + apellidoM);
        System.out.println("Genero: " + genero);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Sangre: " + sangre);
        System.out.println("Holaxd: " + Holaxd);
        System.out.println("Color de piel: " + colordepiel);
        System.out.println(".........................................\n");
    }
}
