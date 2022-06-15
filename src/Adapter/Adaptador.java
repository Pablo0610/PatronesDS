/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class Adaptador implements IAdaptador
{
     CajaEuros cajaEuros = new CajaEuros();
    // ------------------
    public Adaptador() {
    }
    // ------------------
    public double getSaldo()
    {
         return this.cajaEuros.getTotalEuros();
    }
    // ------------------
    @Override
     public void sacarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         cajaEuros.sacarEuros( euros );
    }
    // ------------------
    @Override
     public void ingresarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         cajaEuros.ingresarEuros( euros );
    }
}