/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class Ejecutable {

    public static void main(String[] args) {
        Computadora portatil = new Computadora("Intel - x19", 6.1 + 4.2);
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n",
                portatil.obtenerTipoProcesador(),
                portatil.obtenerMemoria());
    }
}
