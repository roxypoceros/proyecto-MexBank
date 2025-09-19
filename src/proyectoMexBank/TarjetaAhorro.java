/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMexBank;

/**
 *
 * @author rox_g
 */
// Extender clase TarjetaCredito de CuentaBase
public class TarjetaAhorro extends CuentaBase {
    //Agregar constructor
    TarjetaAhorro(double apertura){
        // Iniciar con apertura como saldo inicial
        super(apertura);
    }
    
    //Método invertir sumará 10% del montoActual al montoActual
    public void invertir(){
        double saldoActual = getMontoActual();
        double interes10 = saldoActual * 0.10;
        double nuevoSaldo = saldoActual + interes10;
        //Actualizar el saldo con el nuevoSaldo
        setMontoActual(nuevoSaldo);
    }
    
  
}
