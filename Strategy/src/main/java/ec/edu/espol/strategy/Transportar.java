/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.strategy;

/**
 *
 * @author USER
 */
public class Transportar {
    private Strategy strategy= new Automotriz();
    
    public void distribuir() { 
        //delega el comportamiento a un objeto de estrategia
        strategy.distribuir();
    }
    public void setStrategy(Strategy strategy) {
        strategy = strategy;
    }
    
    public Strategy getStrategy() { 
        return strategy; 
    } 
}
