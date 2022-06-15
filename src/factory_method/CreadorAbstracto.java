/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
 public abstract class CreadorAbstracto
{
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;
    // --------------------------------
     public abstract IArchivo crear(int tipo);
}
