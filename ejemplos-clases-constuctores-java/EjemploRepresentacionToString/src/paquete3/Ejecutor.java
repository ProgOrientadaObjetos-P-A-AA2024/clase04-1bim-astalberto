/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;


public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        FacturaTelefonica fac = new FacturaTelefonica();
        // se llama al método que calcula el valor de la factura
        fac.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac);
        
        FacturaTelefonica fac2 = new FacturaTelefonica("19099090",
                200, 0.2);
        // se llama al método que calcula el valor de la factura
        fac2.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac2);
    }
}
