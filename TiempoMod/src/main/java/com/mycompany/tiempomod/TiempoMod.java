/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiempomod;
import java.util.Scanner;
/**
 *
 * @author pato4
 */
public class TiempoMod {

    private int segundos;
    private int minutos;
    private int horas;
    private volatile boolean detenerHilos; // Volatile para garantizar la visibilidad entre hilos
    private Thread hiloIncremento;
    private Thread hiloDecremento;

    public TiempoMod() {
        segundos = 0;
        minutos = 0;
        horas = 0;
        detenerHilos = false;
        hiloIncremento = null;
        hiloDecremento = null;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int s) {
        this.segundos = s;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int m) {
        this.minutos = m;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int h) {
        this.horas = h;
    }

    public synchronized void setDetenerHilos(boolean detener) {
        this.detenerHilos = detener;
    }

    public synchronized boolean isDetenerHilos() {
        return detenerHilos;
    }

    public void seg(long seg2) {
        horas = (int) (seg2 / 3600);
        seg2 %= 3600;
        minutos = (int) (seg2 / 60);
        seg2 %= 60;
        segundos = (int) seg2;
    }

    public void modificar(int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;
    }

    public void mostrarTiempo() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void incrementar() {
        while (!isDetenerHilos()) {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }
            mostrarTiempo();
            esperarSegundos(1);
        }
    }

    public void decrementar() {
        while (!isDetenerHilos()) {
            segundos--;
            if (segundos == -1) {
                segundos = 59;
                minutos--;
                if (minutos == -1) {
                    minutos = 59;
                    horas--;
                    if (horas == -1) {
                        horas = 23;
                    }
                }
            }
            mostrarTiempo();
            esperarSegundos(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiempoMod t = new TiempoMod();
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Definir tiempo");
            System.out.println("2. Modificar tiempo");
            System.out.println("3. Incrementar tiempo");
            System.out.println("4. Decrementar tiempo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            detenerHilos(t); // Detener los hilos antes de cada acción del menú

            switch (opcion) {
                case 1:
                    ingresarTiempo(scanner, t);
                    break;
                case 2:
                    modificarTiempo(scanner, t);
                    break;
                case 3:
                    ejecutarIncremento(t);
                    break;
                case 4:
                    ejecutarDecremento(t);
                    break;
                case 5:
                    detenerHilos(t); // Detener los hilos antes de salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

            System.out.println("\nPresione Enter para continuar...");
            limpiarBuffer(scanner);
            esperarTeclaEnter();
        } while (opcion != 5);

        scanner.close();
    }

    public static void ejecutarIncremento(TiempoMod t) {
        t.setDetenerHilos(false);
        t.hiloIncremento = new Thread(() -> {
            t.incrementar();
        });
        t.hiloIncremento.start();
    }

    public static void ejecutarDecremento(TiempoMod t) {
        t.setDetenerHilos(false);
        t.hiloDecremento = new Thread(() -> {
            t.decrementar();
        });
        t.hiloDecremento.start();
    }

    public static void detenerHilos(TiempoMod t) {
        t.setDetenerHilos(true);
        if (t.hiloIncremento != null && t.hiloIncremento.isAlive()) {
            try {
                t.hiloIncremento.join();
            } catch (InterruptedException e) {
                System.out.println("Error al detener el hilo de incremento: " + e.getMessage());
            }
        }
        if (t.hiloDecremento != null && t.hiloDecremento.isAlive()) {
            try {
                t.hiloDecremento.join();
            } catch (InterruptedException e) {
                System.out.println("Error al detener el hilo de decremento: " + e.getMessage());
            }
        }
    }

    public static void ingresarTiempo(Scanner scanner, TiempoMod t) {
        System.out.print("Ingrese la hora: ");
        int h = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese los segundos: ");
        int s = scanner.nextInt();
        t.modificar(h, m, s);
        t.mostrarTiempo();
    }

    public static void modificarTiempo(Scanner scanner, TiempoMod t) {
        System.out.print("Ingrese la nueva hora: ");
        int h = scanner.nextInt();
        System.out.print("Ingrese los nuevos minutos: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese los nuevos segundos: ");
        int s = scanner.nextInt();
        t.modificar(h, m, s);
        t.mostrarTiempo();
    }

    public static void esperarTeclaEnter() {
        System.out.println("Presione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println("Error al esperar tecla Enter: " + e.getMessage());
        }
    }

    public static void esperarSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido: " + e.getMessage());
        }
    }

    public static void limpiarBuffer(Scanner scanner) {
        scanner.nextLine();
    }
}
