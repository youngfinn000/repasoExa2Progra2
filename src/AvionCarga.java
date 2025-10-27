public class AvionCarga extends Avion{
    private int totalKilosATransportar;
    private ProductosTransportables transportables;

    public AvionCarga() {
    }
    public AvionCarga(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int totalKilosATransportar, ProductosTransportables transportables) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, 0);
        this.totalKilosATransportar = totalKilosATransportar;
        this.transportables = transportables;
    }

    public int getTotalKilosATransportar() {
        return totalKilosATransportar;
    }

    public void setTotalKilosATransportar(int totalKilosATransportar) {
        this.totalKilosATransportar = totalKilosATransportar;
    }

    public ProductosTransportables getTransportables() {
        return transportables;
    }

    public void setTransportables(ProductosTransportables transportables) {
        this.transportables = transportables;
    }

    @Override
    public String toString() {
        return "AvionCarga{" +
                super.toString()+
                "totalKilosATransportar=" + totalKilosATransportar +
                ", transportables=" + transportables +
                '}';
    }
}
