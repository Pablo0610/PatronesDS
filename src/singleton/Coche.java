/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class Coche {
    private static Coche instancia;
    // ----------------------------------------
    private Coche() {
    }
    // ----------------------------------------
     public static Coche getInstancia()
    {
         if (instancia == null) {
             instancia = new Coche();
            System.out.println("El objeto ha sido creado");
        }
        else {
            System.out.println("Ya existe el objeto");
        }
         return instancia;
    }    
}
