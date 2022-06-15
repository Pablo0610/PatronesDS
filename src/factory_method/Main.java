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

public class Main
{
    public static void main(String[] args)
    {
         CreadorAbstracto creator = new Creador();
        IArchivo audio = creator.crear( Creador.AUDIO );
        audio.reproducir();
        IArchivo video = creator.crear( Creador.VIDEO );
        video.reproducir();
    }
}