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

public class Creador extends CreadorAbstracto
{
    public void Creador() {
    }
    // -------------------------------------------
    @Override
     public IArchivo crear(int tipo)
    {
        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}