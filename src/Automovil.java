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

    }

    @Override
    public void montajeVehiculo(Vehiculo v) {

    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        return new generarMatricula().toString();
    }

    public boolean isMaletero() {
        return maletero;
    }

    public void setMaletero(boolean maletero) {
        this.maletero = maletero;
    }

    public boolean isCinturon() {
        return cinturon;
    }

    public void setCinturon(boolean cinturon) {
        this.cinturon = cinturon;
    }
}
