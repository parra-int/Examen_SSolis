/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class Aplicacion {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        operacion();
    }

    public static void suma() {
        int x = 5;
        int y = 6;
        int z = x + y;
        System.out.println("La suma es: " + z);
    }

    public static void resta() {

        int x;
        int y;
        int z;
        System.out.println("Ingresa un minuendo:");
        x = leer.nextInt();
        System.out.println("Ingresa el Sustraendo:");
        y = leer.nextInt();
        z = x - y;
        System.out.println("La resta es: " + z);
    }

    public static void operacion() {
        int op;
        do {
            System.out.println("Seleccione la operacion a realizar:\n"
                    + "1.- Suma (+)\n"
                    + "2.- Resta (-)\n"
                    + "3.- Multiplicación (*)\n"
                    + "4.- División (/)\n"
                    + "5.- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    //multiplicacion
                    break;
                case 4:
                    //division
                    break;
            }
        } while (op != 5);

    }

}
