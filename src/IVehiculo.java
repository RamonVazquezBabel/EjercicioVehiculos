public interface IVehiculo {
    public void fabricarVehiculo(Vehiculo v);
    public void montajeVehiculo(Vehiculo v);
    public String matriculaVehiculo(Vehiculo v);
    public int acelerarVehiculo(int velocidad);

    public int frenarVehiculo(int velocidad);
}
