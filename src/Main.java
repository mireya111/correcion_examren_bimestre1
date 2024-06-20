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
        ticket ticket1 = new ticket(1237845712,"Efectivo","Cooperativa de transportes");
        ticket ticket2 = new ticket(1728904563,"Tarjeta","Transportes Ecuador");
        ticket ticket3 = new ticket(1701234567,"Tarjeta", "Globaluvis");
        ticket ticket4 = new ticket(1712345678,"Efectivo", "Trans Ecuador");
        ticket ticket5 = new ticket(1797862390,"Efectivo", "Cooperativa de transportes");
        //Imprimir
        ticket1.mostrar();
        ticket2.mostrar();
        ticket3.mostrar();
        ticket4.mostrar();
        ticket5.mostrar();
    }
}