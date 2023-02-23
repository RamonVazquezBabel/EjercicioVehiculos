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
        v.setCombustible("Gasolina");
        v.setColor("Negro");
        v.setDimensiones("2x1.7");
        v.setMatricula(matriculaVehiculo(v));
        v.setMotor(true);
        v.setRuedas(2);
        v.setPrecio(75000);
        v.setTipoCambio("Marchas");
        v.setTipoDireccion("Normal");

    }

    @Override
    public void montajeVehiculo(Vehiculo v) {
        System.out.println("Moto montada de tipo: " + Tipo.CUSTOM.toString());
    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        String matricula = generarMatricula.generarMatricula();
        return matricula;
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
