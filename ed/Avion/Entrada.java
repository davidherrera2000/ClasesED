package ed2.Avion;

public class Entrada {

    public static void main(String[] args) {
        Aviones aviones1= new Aviones("David","Herrera García", "1234","Iberia","París");
        Aviones aviones2= new Aviones("Marta","Romero Lopez", "4321","Vueling","Hong Kong");
        Aviones aviones3= new Aviones("Juan","Sanchez Guerrero", "1235","Air France","Berlín");
        Pasajeros pasajeros= new Pasajeros();
        pasajeros.agregarpasajeros(aviones1);
        pasajeros.agregarpasajeros(aviones2);
        pasajeros.agregarpasajeros(aviones3);
    }


}
