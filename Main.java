/**
 * Clase principal que demuestra el funcionamiento del sistema de flota.
 * Crea vehículos, realiza operaciones CRUD y prueba las consultas con Streams.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * Registra vehículos, los lista, modifica uno, elimina otro
     * y muestra los resultados de las consultas con Streams.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        CentroControl centro = new CentroControl();

        // ── Crear vehículos ──────────────────────────────────────
        // Taxi implementa IConectable → aparecerá en filtrarConectables()
        centro.crearVehiculo(new Taxi(1, "Juan", "Amarillo", "2020", "Toyota", "Nafta", "Taxi"));
        // CamionRepartidor NO implementa IConectable
        centro.crearVehiculo(new CamionRepartidor(2, "Ana", "Blanco", "2019", "Ford", "Diesel", "Camion"));

        // ── CRUD ─────────────────────────────────────────────────
        centro.listarVehiculos();                                         // Muestra ambos vehículos
        centro.modificarVehiculo(1, "Carlos", "Rojo", "2021", "Toyota", "Nafta"); // Modifica el Taxi
        centro.eliminarVehiculo(2);                                       // Elimina el Camion

        // ── Streams y Lambdas ─────────────────────────────────────
        System.out.println(centro.filtrarConectables()); // Solo el Taxi (implementa IConectable)
        System.out.println(centro.ordenarPorId());       // Lista ordenada por ID
    }
}