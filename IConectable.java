/**
 * Interfaz que representa la capacidad de un vehículo de conectarse a un sistema GPS.
 * Las clases que implementen esta interfaz deben poder sincronizar su ubicación.
 *
 * <p>Ejemplo de uso:</p>
 * <pre>
 *     public class Taxi extends Vehiculo implements IConectable {
 *         {@literal @}Override
 *         public void sincronizarGPS() {
 *             System.out.println("GPS sincronizado");
 *         }
 *     }
 * </pre>
 */
public interface IConectable {

    /**
     * Sincroniza el GPS del vehículo con el sistema central.
     * Cada clase que implemente esta interfaz define cómo realiza la sincronización.
     */
    void sincronizarGPS();
}