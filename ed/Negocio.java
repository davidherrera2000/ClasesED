package ed2;

import java.util.Scanner;

public class Negocio {

    static Scanner teclado = new Scanner(System.in);
    static int opcion;
    static String texto;

    public static void main(String[] args) {

    System.out.printf("Bienvenidos a MarketWatch");

        do{
        System.out.println("¿Qué necesitan para el negocio?");
        System.out.println("1ºMaterial de construcción");
        System.out.println("2ºMaterial de oficina");
        System.out.println("3ºMaterial de costureo");
        System.out.println("4ºIngredientes para la gastronomía");
        System.out.println("5ºSalir");
        opcion=teclado.nextInt();

        switch(opcion){
            case 1:
                System.out.println("¿Qué necesitais para la construcción?");
                do{
                    System.out.println("1ºLadrillos");
                    System.out.println("2ºCemento");
                    System.out.println("3ºCableado");
                    System.out.println("4ºTodo");
                    System.out.println("5ºSalir");
                    opcion=teclado.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 2:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 3:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 4:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 5:
                            System.out.println("¿A qué te vas a dedicar con lo que tienes?");
                            texto = teclado.next();
                            System.out.println("Saliendo");
                    }
                }while (opcion!=5);
            case 2:
                System.out.println("¿Qué materiales de oficina necesitais?");
                do{
                    System.out.println("1ºOrdenadores, teclados y ratones");
                    System.out.println("2ºPapel,Carpetas,Archivadores,etc...");
                    System.out.println("3ºMuebles");
                    System.out.println("4ºTodo lo que hay en la lista");
                    System.out.println("5ºSalir");
                    opcion=teclado.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 2:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 3:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 4:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 5:
                            System.out.println("¿A qué te vas a dedicar con lo que tienes?");
                            texto = teclado.next();
                            System.out.println("Saliendo");
                    }
                }while (opcion!=5);
            case 3:
                System.out.println("¿Qué necesitais para la costura?");
                do{
                    System.out.println("1ºTela");
                    System.out.println("2ºAdornos y bordados");
                    System.out.println("3ºAccesorios");
                    System.out.println("4ºPerchas y maniquies");
                    System.out.println("5ºSalir");
                    opcion=teclado.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 2:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 3:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 4:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 5:
                            System.out.println("¿A qué te vas a dedicar con lo que tienes?");
                            texto = teclado.next();
                            System.out.println("Saliendo");
                    }
                }while (opcion!=5);
            case 4:
                System.out.println("¿Qué necesitais para el negocio de la gastronomía?");
                do{
                    System.out.println("1ºIngredientes");
                    System.out.println("2ºMaterial de servicio");
                    System.out.println("3ºUtensilios");
                    System.out.println("4ºMuebles");
                    System.out.println("5ºSalir");
                    opcion=teclado.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 2:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 3:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 4:
                            System.out.println("¿Algo más que quieres pedir que no esté en la lista?");
                            texto = teclado.next();
                            System.out.println("Entendido, te lo daremos si podemos conseguirlo para su negocio");
                            break;
                        case 5:
                            System.out.println("¿A qué te vas a dedicar con lo que tienes?");
                            texto = teclado.next();
                            System.out.println("Saliendo");
                    }
                }while (opcion!=5);
            case 5:
                System.out.println("");
        }
    }while (opcion!=5);
}



}
