package sistemaTransporte;

public class ruta extends ticket{
    String rutaSeleccionada;
    double pasaje1 = 20;
    double pasaje2 = 15;
    double pasaje3 = 17.50;
    int numeroPersonas;
    //Constructores

    public ruta(int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3) {
        this.numeroPersonas = numeroPersonas;
        this.rutaSeleccionada = rutaSeleccionada;
        this.pasaje2 = pasaje2;
        this.pasaje1 = pasaje1;
        this.pasaje3 = pasaje3;
    }

    public ruta(int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3) {
        super(cedulaPasajero, formaDePago, empresaTransporte);
        this.numeroPersonas = numeroPersonas;
        this.rutaSeleccionada = rutaSeleccionada;
        this.pasaje2 = pasaje2;
        this.pasaje1 = pasaje1;
        this.pasaje3 = pasaje3;
    }

    public ruta(String nombre, String apellido, int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3) {
        super(nombre, apellido, cedulaPasajero, formaDePago, empresaTransporte);
        this.numeroPersonas = numeroPersonas;
        this.rutaSeleccionada = rutaSeleccionada;
        this.pasaje2 = pasaje2;
        this.pasaje1 = pasaje1;
        this.pasaje3 = pasaje3;
    }

    //Setters y Getters
    public String getRutaSeleccionada() {
        return rutaSeleccionada;
    }

    public void setRutaSeleccionada(String rutaSeleccionada) {
        this.rutaSeleccionada = rutaSeleccionada;
    }

    public double getPasaje1() {
        return pasaje1;
    }

    public void setPasaje1(double pasaje1) {
        this.pasaje1 = pasaje1;
    }

    public double getPasaje2() {
        return pasaje2;
    }

    public void setPasaje2(double pasaje2) {
        this.pasaje2 = pasaje2;
    }

    public double getPasaje3() {
        return pasaje3;
    }

    public void setPasaje3(double pasaje3) {
        this.pasaje3 = pasaje3;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    //Metodos perzonalizados
    public Double QuitoGuayaquil(){
        double precioSumando = numeroPersonas*pasaje1;
        return precioSumando;
    }
    public Double QuitoPuyo(){
        double precioSumando = numeroPersonas* pasaje2;
        return precioSumando;
    }
    public Double QuitoTulcan(){
        double precioSumando = numeroPersonas* pasaje3;
        return precioSumando;
    }
    public Double QuitoRiobamba(){
        double precioSumando = numeroPersonas*pasaje3;
        return precioSumando;
    }

    public void ruta1(){
        double precioTotal= QuitoGuayaquil();
        System.out.println("Precio de la ruta: " + precioTotal);
    }
    public void ruta2(){
        double precioTotal= QuitoPuyo();
        System.out.println("Precio de la ruta: " + precioTotal);
    }
    public void ruta3(){
        double precioTotal= QuitoTulcan();
        System.out.println("Precio de la ruta: " + precioTotal);
    }
    public void ruta4(){
        double precioTotal= QuitoRiobamba();
        System.out.println("Precio de la ruta: " + precioTotal);
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Ruta Seleccionada: " + rutaSeleccionada);
    }

}
