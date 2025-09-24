/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMexBank;

/**
 *
 * @author rox_g  Roxana Guadalupe Hernández Poceros
 */
// Extender clase TarjetaCredito de CuentaBase
public class TarjetaAhorro extends CuentaBase {
    //Agregar constructor
    TarjetaAhorro(double apertura){
        // Iniciar con apertura como saldo inicial
        super(apertura);
    }
    
    //Método invertir sumará 10% del montoActual al montoActual
    public double invertir(double deposito){
        double saldoActual = getMontoActual();
        double saldoConDeposito = getMontoActual() + deposito;
        double interes10 = saldoConDeposito * 0.10;
        double nuevoSaldo = saldoConDeposito + interes10;
        //Actualizar el saldo con el nuevoSaldo
        setMontoActual(nuevoSaldo);
        //devuelve el interés 
        return interes10;
    }
    
  
}
