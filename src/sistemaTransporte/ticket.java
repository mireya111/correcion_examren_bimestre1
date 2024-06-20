package sistemaTransporte;

public class ticket extends pasajeros{
    int cedulaPasajero;
    String formaDePago;
    String empresaTransporte;
    //Contructores
    public ticket(){}
    public ticket(int cedulaPasajero, String formaDePago, String empresaTransporte) {
        this.cedulaPasajero = cedulaPasajero;
        this.formaDePago = formaDePago;
        this.empresaTransporte = empresaTransporte;
    }

    public ticket(String nombre, String apellido, int cedulaPasajero, String formaDePago, String empresaTransporte) {
        super(nombre, apellido);
        this.cedulaPasajero = cedulaPasajero;
        this.formaDePago = formaDePago;
        this.empresaTransporte = empresaTransporte;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Nombre del pasajero es: " + nombre);
        System.out.println("Apellido:  " + apellido);
        System.out.println("Cedula Pasajero: " + cedulaPasajero);
        System.out.println("Forma de Pago: " + formaDePago);
        System.out.println("Empresa de Transporte: " + empresaTransporte);
    }
}