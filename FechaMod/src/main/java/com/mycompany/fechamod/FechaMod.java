/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fechamod;

import java.util.Scanner;

/**
 *
 * @author pato4
 */
public class FechaMod {
    
    private int dia;
    private int mes;
    private int anio;
    private int nomDia;
    private int nSemanas;
    private int op;
    
    
    public void Info(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Llenado de formulario\n");
        System.out.println("Día: ");
        this.dia = scanner.nextInt();
        while(dia<1 || dia >31){
             System.out.println("El dia no es valido");
             this.dia = scanner.nextInt();
        }
        
        System.out.println("Mes: ");
        this.mes = scanner.nextInt();
        while(mes<1 || dia >12){
             System.out.println("El mes no es valido");
             this.mes = scanner.nextInt();
        } 
        System.out.println("Año: ");
        this.anio = scanner.nextInt();
        
        System.out.println("Nombre del dia: ");
        this.nomDia = scanner.nextInt();
        while(nomDia<1 || nomDia>7){
             System.out.println("Numero de semana no valido");
             this.dia = scanner.nextInt();
        }
        
        System.out.println("Numero de semana: ");
        this.nSemanas = scanner.nextInt();
        while(nSemanas<1 || nSemanas>4){
             System.out.println("El numero de semana no concuerda");
             this.nSemanas = scanner.nextInt();
        }
    }
    
    public void avanzarDia(){
        if(dia<31){
		dia++;
	}else{
		dia=1;
		if(mes<12){
			mes++;
		}else{
			mes = 1;
			anio++;
		}
	}
    }
    
    public void retrocederDia(){
        if(dia>1){
		dia--;
	}else{
		if(mes>1){
			mes--;
		}else{
			mes = 12;
			dia = 31;
			anio--;
		}
	}
    }
    
    public void calcularEstacion(){
        String estacion;
        System.out.println("\n");
        
        switch(mes){
		case 1:
		case 2:
		case 3:
			estacion = "Invierno";
			break;
		case 4:
		case 5:
		case 6:
			estacion = "Primavera";
			break;
		case 7:
		case 8:
		case 9:
			estacion = "Verano";
			break;
		case 10:
		case 11:
		case 12:
			estacion = "Otoño";
			break;	
		default: 
			estacion = "Mes no valido";
			break;
	}
	System.out.println("La estación en la que te encuetras es: "+estacion+"\n");
    }
    
    public void mostrarInfo() {
        System.out.println("\n--- Información actualizada ---");
        System.out.println("Día: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Año: " + anio);
        System.out.println("Nombre del día: " + nomDia);
        System.out.println("Número de semana: " + nSemanas);
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int op;
       char opc = 0;
       
        FechaMod Fecha = new FechaMod();
        Fecha.Info();
        
        do{
            System.out.println("\tBienvenido, al menu de opciones \n\n");
            System.out.println("1)Avanzar Día");
            System.out.println("2)Retroceder Día"); 
            System.out.println("3)Calcular Estacion");
            System.out.println("4)Mostrar información");
            System.out.println("5)Salir del programa");
            System.out.println("Elige una opción: ");
            op = scanner.nextInt();
            
            switch(op){
			case 1: 
			Fecha.avanzarDia();
    			Fecha.mostrarInfo();
			break;
			case 2:
			Fecha.retrocederDia();
    			Fecha.mostrarInfo();  
			break;
			case 3:
			Fecha.calcularEstacion();
			case 4: 
			Fecha.mostrarInfo();
			break;
			default: System.out.println("Tu eleccion no se encuentra adentro del menú");
		}
            System.out.println("\n¿Quieres elegir otra opción del menú S/N? "); 
            opc = scanner.next().charAt(opc);
        }while(opc =='S' || opc=='s');
    }
}