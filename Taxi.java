/**
 * Representa un Taxi dentro del sistema de flota.
 * Extiende {@link Vehiculo} e implementa {@link IConectable},
 * lo que significa que tiene GPS y puede sincronizarse con el sistema central.
 */
public class Taxi extends Vehiculo implements IConectable {

    /**
     * Crea un nuevo Taxi con todos sus atributos.
     *
     * @param id          Identificador único del taxi.
     * @param duenio      Nombre del dueño.
     * @param color       Color del taxi.
     * @param modelo      Modelo del taxi.
     * @param marca       Marca del taxi.
     * @param combustible Tipo de combustible.
     * @param tipo        Categoría del vehículo (debería ser "Taxi").
     */
    public Taxi(int id, String duenio, String color, String modelo, String marca, String combustible, String tipo) {
        super(id, duenio, color, modelo, marca, combustible, tipo);
    }

    /**
     * Define el patrón de movimiento del taxi:
     * recoge pasajeros y recorre la ciudad.
     */
    @Override
    public void patronMovimiento() {
        System.out.println("El taxi sube pasajeros y recorre la ciudad");
    }

    /**
     * Sincroniza el GPS del taxi con el sistema central de control.
     * Implementación requerida por la interfaz {@link IConectable}.
     */
    @Override
    public void sincronizarGPS() {
        System.out.println("El gps del taxi está sincronizado");
    }
}
