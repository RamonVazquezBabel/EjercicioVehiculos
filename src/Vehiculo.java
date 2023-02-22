public class Vehiculo {
    private String color;
    private double precio;
    private String dimensiones;

    private boolean motor;
    private String matricula;
    private int ruedas;

    private String combustible;

    private String tipoCambio;

    private String tipoDireccion;

    private int numPuertas;





    public Vehiculo() {
    }

    public Vehiculo(String color, double precio, String chasis, boolean motor, String matricula, int ruedas, String combustible) {
        this.color = color;
        this.precio = precio;
        this.dimensiones = chasis;
        this.motor = motor;
        this.matricula = matricula;
        this.ruedas = ruedas;
        this.combustible = combustible;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


}
