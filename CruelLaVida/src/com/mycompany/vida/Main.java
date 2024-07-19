/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona x = new Persona();
        char opc;
        int opcion;
        
        do {
            System.out.println("\tMENU DE OPCIONES DE VIDA CRUEL\n\n"
                    + "1) Crear una persona\n"
                    + "2) Crecer a una persona\n"
                    + "3) Hacer que la persona hable\n"
                    + "4) Hacer que la persona coma\n"
                    + "5) La persona que duerma\n"
                    + "6) Mostrar Informacion\n"
                    + "7) La persona huir\n"
                    + "8) La persona reir\n"
                    + "Elige una opcion:"); 
            opcion = sc.nextInt();
            sc.nextLine(); // Clear the buffer
            
            switch (opcion) {
                case 1:
                    x.nacer();
                    break;
                case 2:
                    x.crecer();
                    break;
                case 3:
                    x.hablar();    
                    break;
                case 4:
                    x.comer();        
                    break;
                case 5:
                    x.dormir();                
                    break;
                case 6:
                    x.mostrarInfo();
                    break;
                case 7:
                    x.huir();
                    break;
                case 8:
                    x.reir();
                    break;
                default:
                    System.out.println("Tu decision no se encuentra en el menu");
            }
            System.out.println("¿Quieres elegir otra opcion del menu S/N:");
            opc = sc.next().charAt(0);
            sc.nextLine(); // Clear the buffer
        } while (opc == 'S' || opc == 's');
    }
}

