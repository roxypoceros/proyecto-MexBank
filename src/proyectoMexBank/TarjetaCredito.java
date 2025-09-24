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
public class TarjetaCredito extends CuentaBase {
    
    //Agregar constructor
    public TarjetaCredito(double apertura){
        // Con super llama al constructor de CuentaBase
        // Inicia en positivo la apertura
        super(-apertura);
        // Asigna saldo negativo
        setMontoActual(-getApertura());
    }
    
    // Método sumaIntereses para sumar un 15% de interés a la deuda actual
    public double sumaIntereses(){
        double deudaActual = getMontoActual();
        double interes = deudaActual * 0.15;
        double nuevaDeuda = deudaActual + interes;
        setMontoActual(nuevaDeuda);
        //retornar el interés
        return interes;
    }
    
}

