import java.util.HashMap;
import java.util.Map;

public class Aeropuerto {
    private String nombre;
    private CodigoInternacional codigoInternacional;
    private String direccion;
    private final int capacidadOperacion=12;//cantidad aviones que pueden transitar por las pistas
    private Map<String,Avion>hangares;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, CodigoInternacional codigoInternacional, String direccion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.hangares = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CodigoInternacional getCodigoInternacional() {
        return codigoInternacional;
    }

    public void setCodigoInternacional(CodigoInternacional codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public Map<String, Avion> getHangares() {
        return hangares;
    }

    public void setHangares(Map<String, Avion> hangares) {
        this.hangares = hangares;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigoInternacional=" + codigoInternacional +
                ", direccion='" + direccion + '\'' +
                ", capacidadOperacion=" + capacidadOperacion +
                ", hangares=" + hangares +
                '}';
    }





}
