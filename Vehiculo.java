/**
 * Clase abstracta que representa un Vehículo genérico en el sistema de flota.
 * Contiene los atributos comunes a todos los tipos de vehículos y define
 * el método abstracto {@code patronMovimiento()} que cada subclase debe implementar.
 */
public abstract class Vehiculo {

    /** Identificador único del vehículo. */
    private int id;

    /** Nombre del dueño del vehículo. */
    private String duenio;

    /** Color del vehículo. */
    private String color;

    /** Año o nombre del modelo del vehículo. */
    private String modelo;

    /** Marca del vehículo (ej: Toyota, Ford). */
    private String marca;

    /** Tipo de combustible que usa el vehículo (ej: Nafta, Diesel). */
    private String combustible;

    /** Categoría del vehículo (ej: Taxi, Camion). */
    private String tipo;

    /**
     * Constructor que inicializa todos los atributos del vehículo.
     *
     * @param id          Identificador único del vehículo.
     * @param duenio      Nombre del dueño.
     * @param color       Color del vehículo.
     * @param modelo      Modelo del vehículo.
     * @param marca       Marca del vehículo.
     * @param combustible Tipo de combustible.
     * @param tipo        Categoría del vehículo.
     */
    public Vehiculo(int id, String duenio, String color, String modelo, String marca, String combustible, String tipo) {
        this.id = id;
        this.duenio = duenio;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.combustible = combustible;
        this.tipo = tipo;
    }

    // ──────────────────────────────────────────────
    // Getters
    // ──────────────────────────────────────────────

    /** @return El ID del vehículo. */
    public int getId() { return id; }

    /** @return El nombre del dueño. */
    public String getDuenio() { return duenio; }

    /** @return El color del vehículo. */
    public String getColor() { return color; }

    /** @return El modelo del vehículo. */
    public String getModelo() { return modelo; }

    /** @return La marca del vehículo. */
    public String getMarca() { return marca; }

    /** @return El tipo de combustible. */
    public String getCombustible() { return combustible; }

    /** @return La categoría del vehículo. */
    public String getTipo() { return tipo; }

    // ──────────────────────────────────────────────
    // Setters
    // ──────────────────────────────────────────────

    /** @param id Nuevo ID del vehículo. */
    public void setId(int id) { this.id = id; }

    /** @param duenio Nuevo nombre del dueño. */
    public void setDuenio(String duenio) { this.duenio = duenio; }

    /** @param color Nuevo color del vehículo. */
    public void setColor(String color) { this.color = color; }

    /** @param modelo Nuevo modelo del vehículo. */
    public void setModelo(String modelo) { this.modelo = modelo; }

    /** @param marca Nueva marca del vehículo. */
    public void setMarca(String marca) { this.marca = marca; }

    /** @param combustible Nuevo tipo de combustible. */
    public void setCombustible(String combustible) { this.combustible = combustible; }

    /** @param tipo Nueva categoría del vehículo. */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * Devuelve una representación en texto del vehículo con todos sus atributos.
     *
     * @return String con los datos del vehículo.
     */
    @Override
    public String toString() {
        return "Vehículo: { ID: " + getId() + ", Dueño: " + getDuenio() +
                ", Color: " + getColor() + ", Modelo: " + getModelo() +
                ", Marca: " + getMarca() + ", Combustible: " + getCombustible() + "}";
    }

    /**
     * Método abstracto que define el patrón de movimiento del vehículo.
     * Cada subclase debe implementarlo según su comportamiento específico.
     */
    public abstract void patronMovimiento();
}
