import java.util.Scanner;
import sistemaTransporte.*;
public class Main {
    public static void main(String[] args) {
        //Objetos con valores nulos
        pasajeros pasajero = new pasajeros();
        pasajeros pasajero2 = new pasajeros();
        pasajeros pasajero3 = new pasajeros();
        pasajeros pasajero4 = new pasajeros();
        pasajeros pasajero5 = new pasajeros();
        //Seteos de los objetos antes mencionados
        pasajero.setNombre("Mireya");
        pasajero.setApellido("Suarez");
        pasajero2.setNombre("Martina");
        pasajero2.setApellido("García");
        pasajero3.setNombre("Maria");
        pasajero3.setApellido("Carvajal");
        pasajero4.setNombre("Margarita");
        pasajero4.setApellido("Cadena");
        pasajero5.setNombre("Pedro");
        pasajero5.setApellido("Cabrera");
        //Mostrar
        pasajero.mostrar();
        pasajero2.mostrar();
        pasajero3.mostrar();
        pasajero4.mostrar();
        pasajero5.mostrar();
        //Objetos con valores quemados
        ticket pasajero1 = new ticket();
        ticket pasajero2 = new ticket();

    }
}