package sistemaTransporte;
public class servicioNormal extends ruta{
    String asientos;
    String espacioMaletas="Solo para 1";
    int maletasAdicionaes;
    //Contructores

    public servicioNormal(int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String asientos, String espacioMaletas) {
        super(numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
        this.asientos = asientos;
        this.espacioMaletas = espacioMaletas;
    }

    public servicioNormal(int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String asientos, String espacioMaletas) {
        super(cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
        this.asientos = asientos;
        this.espacioMaletas = espacioMaletas;
    }

    public servicioNormal(String nombre, String apellido, int cedulaPasajero, String formaDePago, String empresaTransporte, int numeroPersonas, String rutaSeleccionada, double pasaje2, double pasaje1, double pasaje3, String asientos, String espacioMaletas) {
        super(nombre, apellido, cedulaPasajero, formaDePago, empresaTransporte, numeroPersonas, rutaSeleccionada, pasaje2, pasaje1, pasaje3);
        this.asientos = asientos;
        this.espacioMaletas = espacioMaletas;
    }
    //Setters y getters

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getEspacioMaletas() {
        return espacioMaletas;
    }

    public void setEspacioMaletas(String espacioMaletas) {
        this.espacioMaletas = espacioMaletas;
    }

    public int getMaletasAdicionaes() {
        return maletasAdicionaes;
    }

    public void setMaletasAdicionaes(int maletasAdicionaes) {
        this.maletasAdicionaes = maletasAdicionaes;
    }

    //Metodos personaizados

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asientos: " + asientos);
        System.out.println("Espacios Maletas: " + espacioMaletas);
        System.out.print("Precio Quito");
    }
    @Override
    public Double QuitoGuayaquil() {
        double precioMaletas=maletasAdicionaes*5;
        return super.QuitoGuayaquil() + precioMaletas;
    }

    @Override
    public Double QuitoPuyo() {
        double precioMaletas=maletasAdicionaes*5;
        return super.QuitoPuyo() + precioMaletas;
    }

    @Override
    public Double QuitoTulcan() {
        double precioMaletas=maletasAdicionaes*5;
        return super.QuitoTulcan()+ precioMaletas;
    }

    @Override
    public Double QuitoRiobamba() {
        double precioMaletas=maletasAdicionaes*5;
        return super.QuitoRiobamba()+precioMaletas;
    }

    @Override
    public void ruta1() {
        super.ruta1();
    }

    @Override
    public void ruta2() {
        super.ruta2();
    }

    @Override
    public void ruta3() {
        super.ruta3();
    }

    @Override
    public void ruta4() {
        super.ruta4();
    }
}