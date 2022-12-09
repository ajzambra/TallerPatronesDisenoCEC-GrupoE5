/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espol.strategy;

/**
 *
 * @author USER
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //comportamiento por defecto
        Transportar transportar= new Transportar();
        transportar.distribuir();
        //cambia el comportamiento 
        transportar.setStrategy(new Aereo());
        transportar.distribuir();
        
    }
    
}
