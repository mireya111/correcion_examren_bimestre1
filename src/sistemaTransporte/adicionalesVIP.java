package sistemaTransporte;
public class adicionalesVIP extends serviciosVIP{
    boolean telivision;
    boolean internet;
    boolean comida;
    //Constructores
    public adicionalesVIP(int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes, boolean telivision, boolean internet, boolean comida) {
        super(numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3, espacioMaletas, maletasAdicionaes);
        this.telivision = telivision;
        this.internet = internet;
        this.comida = comida;
    }

    public adicionalesVIP(int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes, boolean telivision, boolean internet, boolean comida) {
        super(cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3, espacioMaletas, maletasAdicionaes);
        this.telivision = telivision;
        this.internet = internet;
        this.comida = comida;
    }

    public adicionalesVIP(String nombre, String apellido, int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String espacioMaletas, int maletasAdicionaes, boolean telivision, boolean internet, boolean comida) {
        super(nombre, apellido, cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3, espacioMaletas, maletasAdicionaes);
        this.telivision = telivision;
        this.internet = internet;
        this.comida = comida;
    }
    //Getters y Setters
    public boolean isTelivision() {
        return telivision;
    }

    public void setTelivision(boolean telivision) {
        this.telivision = telivision;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print("Tendra televisión: "+telivision);
        System.out.print("\nTendra internet: "+internet);
        System.out.print("\nTendra comida: "+comida);
    }
}