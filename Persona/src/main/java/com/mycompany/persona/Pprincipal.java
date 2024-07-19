/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Paulina García Calderón
 */
public class Pprincipal{
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Persona> personas = new ArrayList<>();
       
       int opcion;
       
       do{
           
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Registrar un nuevo manager");
            System.out.println("2. Registrar un nuevo manager ejecutivo");
            System.out.println("3. Registrar una nueva secretaria");
            System.out.println("4. Registrar un nuevo programador");
            System.out.println("5. Mostrar información de todos los empleados");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    registrarManager(personas, scanner);
                    break;
                case 2:
                    registrarManagerEjecutivo(personas, scanner);
                    break;
                case 3:
                    registrarSecretaria(personas, scanner);
                    break;
                case 4:
                    registrarProgramador(personas, scanner);
                    break;
                case 5:
                    mostrarInformacion(personas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

        }while(opcion != 6);
       
        scanner.close();
    }
    
    private static void registrarManager(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("\n----- Registro de Nuevo Manager -----");
        Manager manager = new Manager();
        personas.add(manager);
    }

    private static void registrarManagerEjecutivo(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("\n----- Registro de Nuevo Manager Ejecutivo -----");
        ManagerEjecutivo managerEjecutivo = new ManagerEjecutivo();
        personas.add(managerEjecutivo);
    }

    private static void registrarSecretaria(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("\n----- Registro de Nueva Secretaria -----");
        Secretaria secretaria = new Secretaria();
        personas.add(secretaria);
        System.out.println("Secretaria registrada exitosamente.");
    }

    private static void registrarProgramador(ArrayList<Persona> personas, Scanner scanner) {
        System.out.println("\n----- Registro de Nuevo Programador -----");
        Programador programador = new Programador();
        personas.add(programador);
        System.out.println("Programador registrado exitosamente.");
    }
    private static void mostrarInformacion(ArrayList<Persona> personas) {
        System.out.println("\n--- Información de todos los empleados ---");
        for (Persona persona : personas) {
            if (persona instanceof Manager) {
                 System.out.println("\n--- Información de Manager ---");
                ((Manager) persona).mostrarInfoManager();
            } else if (persona instanceof ManagerEjecutivo) {
                 System.out.println("\n--- Información de Manager ejecutivo ---");
                ((ManagerEjecutivo) persona).mostrarInfoManagerEjecutivo();
            } else if (persona instanceof Secretaria) {
                 System.out.println("\n--- Información de Secretaria ---");
                ((Secretaria) persona).mostrarInfoS();
            } else if (persona instanceof Programador) {
                 System.out.println("\n--- Información de programador ---");
                ((Programador) persona).mostrarInfoProg();
            } else {
                persona.mostrarInfoPersona(); // Por si hay otras subclases de Persona no mencionadas
            }
            System.out.println("---------------------------------------");
        }
    }
}
