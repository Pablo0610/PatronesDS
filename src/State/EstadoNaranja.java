

package State;
/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class EstadoNaranja extends EstadoSemaforo
{
     public EstadoNaranja( Semaforo objSemaforo ) {
         this.objSemaforo = objSemaforo;
    }
    // -------------------------------------------
    @Override
     public void mostrar() {
        System.out.println("Alerta naranja");
    }}