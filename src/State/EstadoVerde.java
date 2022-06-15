package State;
/**
 * Trabajo de Investigacion
 * @author Pablo Noe Farinango Coyago
 * Marcos de Desarollo Curso:03
 */
public class EstadoVerde extends EstadoSemaforo
{
     public EstadoVerde( Semaforo objSemaforo ) {
         this.objSemaforo = objSemaforo;
    }
    // -------------------------------------------
    @Override
     public void mostrar() {
        System.out.println("No estamos en alerta");
    }
}