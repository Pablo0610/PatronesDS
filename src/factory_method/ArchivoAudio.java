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
public class ArchivoAudio implements IArchivo
{
    public ArchivoAudio() {
    }
    // -----------------------------
    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}