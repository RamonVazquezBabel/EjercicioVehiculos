public class Automovil extends Vehiculo implements IVehiculo {

    private boolean maletero;

    private boolean cinturon;

    private enum Tipo {
        BERLINA,
        FURGONETA,
        TURISMO,
        SUV
    }
    @Override
    public void fabricarVehiculo(Vehiculo v) {
        v.setCombustible("Hidrógeno");
        v.setColor("Blanco");
        v.setDimensiones("3x2");
        v.setMatricula(matriculaVehiculo(v));
        v.setMotor(true);
        v.setRuedas(4);
        v.setPrecio(25000);
        v.setTipoCambio("Automático");
        v.setTipoDireccion("Normal");
    }

    @Override
    public void montajeVehiculo(Vehiculo v) {

    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        return new generarMatricula().toString();
    }

    @Override
    public int acelerarVehiculo(int velocidad) {
        velocidad+=10;
        return velocidad;
    }

    @Override
    public int frenarVehiculo(int velocidad) {
        velocidad-=10;
        return velocidad;
    }
}
