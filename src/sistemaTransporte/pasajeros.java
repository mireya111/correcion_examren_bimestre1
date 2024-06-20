package sistemaTransporte;

public class pasajeros {
    String nombre;
    String apellido;
    //Constructires
    public pasajeros(){}

    public pasajeros(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Metodo personalizado
    public void mostrar(){
        System.out.println("Nombre del pasajero es: " + nombre);
        System.out.println("Apellido:  " + apellido);
    }
}