public class Moto extends Vehiculo implements IVehiculo{

    private String tipoMoto;
    private boolean embrague;
    private boolean manillar;

    private enum Tipo {
        NAKED,
        RACING,
        CUSTOM
    }
    @Override
    public void fabricarVehiculo(Vehiculo v) {

    }

    @Override
    public void montajeVehiculo(Vehiculo v) {

    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        return null;
    }
}
