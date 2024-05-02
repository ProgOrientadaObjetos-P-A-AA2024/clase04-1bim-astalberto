/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        String ingresoNombre = "", ingresoCiudad = "";
        int ingresoDoctores = 0, ingresoEnfermos = 0;

        System.out.println("Ingrese nombre");
        ingresoNombre = entrada.nextLine();
        System.out.println("Ingrese Ciudad");
        ingresoCiudad = entrada.nextLine();
        System.out.println("Ingrese numero de Doctores");
        ingresoDoctores = entrada.nextInt();
        System.out.println("Ingrese numero de Enfermos");
        ingresoEnfermos = entrada.nextInt();
        entrada.nextLine();

        Hospital h1 = new Hospital(ingresoNombre, ingresoCiudad,
                ingresoDoctores, ingresoEnfermos);

        h1.establecerNombre("Hospital Militar Privado");
        
        System.out.println("Ingrese nombre");
        ingresoNombre = entrada.nextLine();
        System.out.println("Ingrese Ciudad");
        ingresoCiudad = entrada.nextLine();
        System.out.println("Ingrese numero de Doctores");
        ingresoDoctores = entrada.nextInt();
        System.out.println("Ingrese numero de Enfermos");
        ingresoEnfermos = entrada.nextInt();
        
        Hospital h2 = new Hospital(ingresoNombre, ingresoCiudad,
                ingresoDoctores, ingresoEnfermos);
        System.out.println("Hospital 1");
        System.out.printf("%s\n%s\n%d\n%d\n", h1.obtenerNombre(),
                h1.obtenerCiudad(),
                h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
                System.out.println("Hospital 2");
        System.out.printf("%s\n%s\n%d\n%d\n", h2.obtenerNombre(),
                h2.obtenerCiudad(),
                h2.obtenerNumeroDoctores(),
                h2.obtenerNumeroEnfermeros());

    }
}
