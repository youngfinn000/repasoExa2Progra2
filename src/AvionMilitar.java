public class AvionMilitar extends Avion {
    private int cantidadBalas;
    private SistemaArmas sistemaArmas;

    public AvionMilitar() {
    }

    public AvionMilitar(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadBalas, SistemaArmas sistemaArmas) {
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadBalas = cantidadBalas;
        this.sistemaArmas = sistemaArmas;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    public SistemaArmas getSistemaArmas() {
        return sistemaArmas;
    }

    public void setSistemaArmas(SistemaArmas sistemaArmas) {
        this.sistemaArmas = sistemaArmas;
    }

    @Override
    public String toString() {
        return "AvionMilitar{" +
                super.toString()+
                "cantidadBalas=" + cantidadBalas +
                ", sistemaArmas=" + sistemaArmas +
                '}';
    }
}
