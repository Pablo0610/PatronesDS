/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class Verduras implements IElaborar
{
    public Verduras() {
    }
    // --------------------------
    @Override
     public void procesar()
    {
        // Operaciones necesarias
        // ...
        System.out.println("\tlasgana de verduras elaborada");
    }
}