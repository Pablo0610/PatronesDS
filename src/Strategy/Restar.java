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
public class Restar implements IAritmetica
{
    public Restar() {
    }
    // -------------------------------
    @Override
     public int realizarOperacion(int a, int b)
    {
        return a - b;
    }    
}