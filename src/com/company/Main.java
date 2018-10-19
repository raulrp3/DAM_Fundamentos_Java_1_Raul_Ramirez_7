package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static String comprobarNumero(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if (primerNumero > segundoNumero) {
            cadenaResultado = String.format("El número %d es mayor que el número %d.", primerNumero, segundoNumero);
        } else {
            if (segundoNumero > primerNumero) {
                cadenaResultado = String.format("El número %d es mayor que el número %d.", segundoNumero, primerNumero);
            } else {
                cadenaResultado = String.format("Los números %d y %d son iguales.", primerNumero, segundoNumero);
            }
        }
        return cadenaResultado;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a comprobar que número es mayor!");
        System.out.print("Introduce un primer número: ");
        primerNumero = (int)validador(0);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = (int)validador(0);
        sc.close();
        System.out.println(comprobarNumero(primerNumero, segundoNumero));
    }
}
