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
        v.setCombustible("Combustible");
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
        System.out.println("Moto montada y creada!");
    }

    @Override
    public String matriculaVehiculo(Vehiculo v) {
        String matricula = generarMatricula.generarMatricula();
        return matricula;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public boolean isEmbrague() {
        return embrague;
    }

    public void setEmbrague(boolean embrague) {
        this.embrague = embrague;
    }

    public boolean isManillar() {
        return manillar;
    }

    public void setManillar(boolean manillar) {
        this.manillar = manillar;
    }
}
