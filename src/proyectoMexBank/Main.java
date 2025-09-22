/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMexBank;

/**
 *
 * Universidad Virtual del Estado de Guanajuato
 * Ingeniería en Desarrollo de Software
 * Programación orientada a objetos v1
 * R4. Herencia de clases y paso de parámetros
 * @author rox_g  Roxana Guadalupe Hernández Poceros
 * Matrícula: 24013162
 * Asesor: Claudia Patricia Rojano Hernández
 * Martes 19 de septiembre del 2025
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido(a)***");
        System.out.println();
        System.out.println("A continuación presentamos el salto de tus 3 tarjetas;");
        System.out.println();
        // Crear objeto para cada tipo de cuenta
        TarjetaCredito tcredito = new TarjetaCredito(5000);
        tcredito.depositar(1000);
        tcredito.sumaIntereses();
        System.out.println("Saldo en tarjeta de crédito " + tcredito.getMontoActual());
        System.out.println();
        
        TarjetaDebito tdebito = new TarjetaDebito(3000);
        tdebito.depositar(500);
        tdebito.restar(200);
        System.out.println("Saldo en tarjeta de debito " + tdebito.getMontoActual());
        System.out.println();
        
        TarjetaAhorro tahorro = new TarjetaAhorro(2000);
        tahorro.depositar(500);
        tahorro.invertir();
        System.out.println("Saldo en tarjeta de ahorro " + tahorro.getMontoActual());
        System.out.println();

    }
    
}

/**
 * EJEMPLO DE SALIDA 
 * 
 * *** Bienvenido(a)***

 * A continuación presentamos el salto de tus 3 tarjetas
 * Saldo en tarjeta de crédito -4600.0
 *
 * Saldo en tarjeta de debito 3300.0
 *
 * Saldo en tarjeta de ahorro 2750.0
 *  
*/