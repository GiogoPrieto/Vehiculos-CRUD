import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class CentroControl {

    private ArrayList<Vehiculo>lista;

    public CentroControl(){
        this.lista=new ArrayList<>();
    }

    public void crearVehiculo(Vehiculo v){
        lista.add(v);
    }

    public void listarVehiculos(){
        lista.forEach(v -> System.out.println(v));
    }

    public  Vehiculo buscarVehiculo(int id){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getId()==id){
                return lista.get(i);
            }
        }
        return null;
    }

    public boolean modificarVehiculo(int id, String duenio, String color, String modelo, String marca, String combustible){

        Vehiculo v = buscarVehiculo(id);
        if(v!=null){
            v.setDuenio(duenio);
            v.setColor(color);
            v.setModelo(modelo);
            v.setMarca(marca);
            v.setCombustible(combustible);
            return true;
        }
        return false;
    }

    public boolean eliminarVehiculo(int id){
        Vehiculo v = buscarVehiculo(id);
        if(v!=null){
            lista.remove(v);
            return true;
        }
        return false;
    }

    public List<Vehiculo>  filtrarConectables(){
        return lista.stream()
                .filter(v -> v instanceof IConectable)
                .collect(Collectors.toList());
    }

    public List<Integer> obtenerIds(){
        return lista.stream()
                .map( Vehiculo :: getId)
                .collect(Collectors.toList());
    }

    public long contarVehiculos(){
        return lista.stream()
                .count();
    }

    public List<Vehiculo> buscarVehiculosPorTipos(String tipo){
        return lista.stream().
                filter(v -> v.getTipo().equals(tipo))
                .collect(Collectors.toList());
    }
    
    public List<Vehiculo> ordenarPorId(){
        return lista.stream()
                .sorted((v1, v2) -> v1.getId() - v2.getId())
                .collect(Collectors.toList());
    }



    public void ordenarPorTipo(){
        lista.stream().sorted(Comparator.comparing(Vehiculo::getTipo)).collect(Collectors.toList());

    }

    public void generarReporte() {
        System.out.println("===== REPORTE DE FLOTA =====");
        System.out.println("Total de vehículos: " + contarVehiculos());
        System.out.println("Vehículos conectables: " + filtrarConectables().size());
        System.out.println("IDs registrados: " + obtenerIds());
        System.out.println("============================");
    }

    public void mostrarEstadisticas() {
        Map<String, Long> porTipo = lista.stream()
                .collect(Collectors.groupingBy(Vehiculo::getTipo, Collectors.counting()));

        System.out.println("===== ESTADÍSTICAS =====");
        porTipo.forEach((tipo, cantidad) ->
                System.out.println("Tipo: " + tipo + " → Cantidad: " + cantidad));
        System.out.println("========================");
    }

    public Map<String, List<Vehiculo>> clasificarPorTipo() {
        return lista.stream()
                .collect(Collectors.groupingBy(Vehiculo::getTipo));
    }


    public List<Vehiculo> busquedaAvanzada(String tipo, String combustible) {
        return lista.stream()
                .filter(v -> v.getTipo().equalsIgnoreCase(tipo) &&
                        v.getCombustible().equalsIgnoreCase(combustible))
                .collect(Collectors.toList());
    }



}
