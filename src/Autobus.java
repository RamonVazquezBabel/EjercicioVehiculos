public class Autobus extends Vehiculo implements IVehiculo{
    private int numPlazas;
    private String funcionalidad;

    @Override
    public void fabricarVehiculo(Vehiculo v) {

    }

    @Override
    public void montajeVehiculo(Vehiculo v) {
        setRuedas(8);
        setColor("Azuul");
        setCombustible("Diesel");
        setTipoCambio("Automatico");
        setMotor(true);
        setTipoDireccion("Normal");
        setPrecio(25000);
        
    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {

        return generarMatricula.generarMatricula();
    }

    @Override
    public int acelerarVehiculo(int velocidad) {
        velocidad += 5;
        return velocidad;
    }

    @Override
    public int frenarVehiculo(int velocidad) {
        velocidad-=5;
        return velocidad;
    }
}
