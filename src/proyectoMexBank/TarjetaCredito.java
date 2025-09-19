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
public class TarjetaCredito extends CuentaBase {
    
    //Agregar constructor
    TarjetaCredito(double apertura){
        // Con super llama al constructor de CuentaBase
        // Asigna saldo negativo
        super(-apertura);
    }
    
    // Método sumaIntereses para sumar un 15% de interés a la deuda actual
    public void sumaIntereses(){
        double deudaActual = getMontoActual();
        double interes = deudaActual * 0.15;
        double nuevaDeuda = deudaActual + interes;
        setMontoActual(nuevaDeuda);
    }
    
}

