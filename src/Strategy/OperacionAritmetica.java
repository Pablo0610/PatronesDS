/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class OperacionAritmetica
{
     private IAritmetica strategy;
    // ----------------------------------
    public OperacionAritmetica(IAritmetica strategy) {
        this.strategy = strategy;
    }
    // ----------------------------------
     public int procesar(int a, int b) {
         return strategy.realizarOperacion(a, b);
    }
}