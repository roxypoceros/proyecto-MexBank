/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMexBank;

/**
 *
 * @author rox_g
 */
public class Main {
    public static void main(String[] args) {
        // Crear objeto para cada tipo de cuenta
        TarjetaCredito tcredito = new TarjetaCredito(5000);
        tcredito.depositar(1000);
        tcredito.sumaIntereses();
        System.out.println("Saldo en tarjeta de crédito " + tcredito.getMontoActual());
    }
    
}
