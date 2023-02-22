public class generarMatricula {

    public static String generarMatricula() {
        char placa[] = new char[8];
        placa[0] = generarNumero();
        placa[1] = generarNumero();
        placa[2] = generarNumero();
        placa[3] = generarNumero();
        placa[4] = '-';
        placa[5] = generarConsonante();
        placa[6] = generarConsonante();
        placa[7] = generarConsonante();
        return String.valueOf(placa);
    }
    public static char generarConsonante() {
        return generarRandomChar("BCDFGHJKLMNPQRSTVWXYZ");
    }
    public static char generarNumero() {
        return generarRandomChar("0123456789");
    }
    private static char generarRandomChar(String str) {
        char caracteres[] = str.toCharArray();
        int index = (int) (Math.random() * caracteres.length);
        return caracteres[index];
    }
}
