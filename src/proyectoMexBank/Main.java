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
        System.out.println("A continuación presentamos el saldo de tus 3 tarjetas;");
        System.out.println();
        // Crear objeto para cada tipo de cuenta
                
        TarjetaCredito tcredito = new TarjetaCredito(5000);
        
        //Saldo inicial de TarjetaCredito
        System.out.println("Tarjeta de Crédito: ");
        System.out.println("Saldo inicial: " + tcredito.getApertura() );
        //Cantidad a depositar
        tcredito.depositar(1000);
        //Interés del 15%
        double interes15 = tcredito.sumaIntereses();
        System.out.println("Interés aplicado (15%) " + interes15);
        System.out.println("Saldo final en tarjeta de crédito " + tcredito.getMontoActual());
        System.out.println();
        

        //*****TarjetaDebito*****
        TarjetaDebito tdebito = new TarjetaDebito(3000);
        //Saldo inicial de TarjetaDebito
        System.out.println("Tarjeta de Débito: ");
        System.out.println("Saldo inicial: " + tdebito.getApertura());
        
        //restar devuelve la cantidad retirada
        double cantidadRetirada = tdebito.restar(200);
        System.out.println("Cantidad retirada: " + cantidadRetirada);
        tdebito.depositar(500);
        tdebito.restar(200);
        System.out.println("Saldo en tarjeta de debito " + tdebito.getMontoActual());
        System.out.println();
        
        //*****TarjetaAhorro*****
        TarjetaAhorro tahorro = new TarjetaAhorro(2000);
        //Saldo inicial de TarjetaAhorro
        System.out.println("Tarjeta de Ahorro: ");
        System.out.println("Saldo inicial: " + tahorro.getApertura());
        
        //deposito
        double deposito = 500;
        
        //Interés del 10%
        double interesAhorro = tahorro.invertir(deposito);
        
        System.out.println("Cantidad depositada: " + deposito);
        System.out.println("Interés del 10% obtenido: " + interesAhorro);
        
        System.out.println("Saldo en tarjeta de ahorro " + tahorro.getMontoActual());
        System.out.println();

    }
    
}

/**
 * EJEMPLO DE SALIDA 
 * 
 * *** Bienvenido(a)***


Tarjeta de Ahorro: 
Saldo inicial: 2000.0
Cantidad depositada: 500.0
Interés del 10% obtenido: 250.0
Saldo en tarjeta de ahorro 2750.0
 *  
*/