/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMexBank;

/**
 *
 * @author rox_g  Roxana Guadalupe Hernández Poceros
 */
// Crear CuentaBase
public class CuentaBase {
    //Agregar atributo común a todas las cuentas montoActual
    private double montoActual;
    
    // Guardar la apertura para mostrarla después
    private double apertura;
    
    //Agregar el constructor los parámetros que el constructor recibe. Apertura es el monto inicial
    CuentaBase (double apertura){
        // montoActual es el atributo privado de la clase
        // apertura,  es el valor que recibe el constructor 
        this.apertura = apertura;
        // apertura se le asigna a montoActual para que inicie cuenta con un saldo
        this.montoActual = apertura;
    }
    
    //Métodos para acceder a montoActual (get y set)
        public double getMontoActual(){
        return montoActual;
        }
        
        public void setMontoActual(double montoActual){
        this.montoActual = montoActual;
        }
        
    //Métodos para acceder a apertura (get y set)
        public double getApertura(){
        return apertura;
        }
                
     //Método depositar aumenta en 10% el monto actual
        public void depositar(double cantidad){
        this.montoActual = this.montoActual + cantidad;
        }
    }
