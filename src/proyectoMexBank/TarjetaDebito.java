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
public class TarjetaDebito extends CuentaBase {
    //Agregar constructor
    TarjetaDebito(double apertura){
        super(apertura);
    }
    //Método retirar para restar cantidad de montoActual
    public void restar(double cantidad){
        setMontoActual(getMontoActual() - cantidad);
    }
    
}
