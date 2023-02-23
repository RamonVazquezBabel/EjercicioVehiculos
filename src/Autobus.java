public class Autobus extends Vehiculo implements IVehiculo{
    private int numPlazas;
    private String funcionalidad;

    @Override
    public void fabricarVehiculo(Vehiculo v) {
        v.setCombustible("Diesel");
        v.setColor("Negro");
        v.setDimensiones("7x2");
        v.setMatricula(matriculaVehiculo(v));
        v.setMotor(true);
        v.setRuedas(4);
        v.setPrecio(155295);
        v.setTipoCambio("Automatico");
        v.setTipoDireccion("Normal");
    }

    @Override
    public void montajeVehiculo(Vehiculo v) {

    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        return null;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }
}
