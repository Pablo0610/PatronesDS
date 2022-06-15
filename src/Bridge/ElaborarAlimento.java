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
public abstract class ElaborarAlimento
{
    // Referencia al Implementador
     IElaborar implementador;
    String nombre;
    // --------------------------
    public IElaborar getImplementador()
    {
        return this.implementador;
    }
    // --------------------------
    public void setImplementador( IElaborar implementador )
    {
        this.implementador = implementador;
    }
    // --------------------------
    // Método a implementar por las clases que hereden
     public abstract void obtener();
}