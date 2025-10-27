public abstract class Avion {
    private String nombreModelo;
    private String marca;
    private int capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;

    public Avion() {
    }

    public Avion(String nombreModelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
}
