/**
 * Representa un Camión Repartidor dentro del sistema de flota.
 * Extiende {@link Vehiculo} y define su propio patrón de movimiento:
 * recorre destinos entregando mercadería.
 *
 * <p>A diferencia del {@link Taxi}, el camión NO implementa {@link IConectable},
 * por lo que no aparecerá en los resultados de {@code filtrarConectables()}.</p>
 */
public class CamionRepartidor extends Vehiculo {

    /**
     * Crea un nuevo CamionRepartidor con todos sus atributos.
     *
     * @param id          Identificador único del camión.
     * @param duenio      Nombre del dueño.
     * @param color       Color del camión.
     * @param modelo      Modelo del camión.
     * @param marca       Marca del camión.
     * @param combustible Tipo de combustible.
     * @param tipo        Categoría del vehículo (debería ser "Camion").
     */
    public CamionRepartidor(int id, String duenio, String color, String modelo, String marca, String combustible, String tipo) {
        super(id, duenio, color, modelo, marca, combustible, tipo);
    }

    /**
     * Define el patrón de movimiento del camión repartidor:
     * recorre una lista de destinos dejando mercadería en cada uno.
     */
    @Override
    public void patronMovimiento() {
        System.out.println("El camión recorre los destinos y deja mercaderia en cada uno de ellos");
    }
}