import java.util.List;

public class AvionComercial extends Avion{
    private int cantidadAzafatas;
    private List<String>servicios;

    public AvionComercial() {
    }

    public AvionComercial(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas, List<String> servicios) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = servicios;
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "AvionComercial{" +
                super.toString()+
                "cantidadAzafatas=" + cantidadAzafatas +
                ", servicios=" + servicios +
                '}';
    }
}
