/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {
        // En esta clase Principal creamos un objeto de tipo conputadora
        // que al no tener constructor en su clase utiliza el constructor
        // por defecto para poder instancia el objeto
        Computadora computadoraTrabajo = new Computadora();

        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n",
                computadoraTrabajo.obtenerTipoProcesador(),
                computadoraTrabajo.obtenerMemoria());
    }
}
