/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class EjecutableDos {

    public static void main(String[] args) {

        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("R1");
        System.out.printf("%s - %.2f", personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());
    }
}
