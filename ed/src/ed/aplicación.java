package ed;

import java.util.Scanner;

public class aplicación {

    public static void main(){
        Scanner teclado= new Scanner(System.in);
        int opcion,opcion1, opcion2,opcion3;

        do{
            System.out.println("Seleccione una opción");
            System.out.println("1ºNovato");
            System.out.println("2ºAvanzado");
            System.out.println("3ºExperto");
            System.out.println("4ºSalir");
            opcion=teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Has elegido la opcion de novato");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºPiernas");
                        System.out.println("2ºBrazos");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        opcion1=teclado.nextInt();

                        switch(opcion1){
                            case 1:
                                System.out.println("Sentadillas durante 10 minutos, zancadas alternas 10 minutos y burpees 5 minutos");
                            case 2:
                                System.out.println("20 flexiones de pecho, 15 dips de tríceps y 15 flexiones de tríceps");
                            case 3:
                                System.out.println("20 flexiones de pecho, zancadas alternas 5 minutos, 15 flexiones de tríceps y zancadas alternas 5 minutos");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (opcion1!=4);
                case 2:
                    System.out.println("Has elegido la opcion de Avanzado");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºPiernas y brazos");
                        System.out.println("2ºPesas");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        opcion2=teclado.nextInt();

                        switch(opcion2){
                            case 1:
                                System.out.println("Sentadillas durante 15 minutos, 30 flexiones de pecho, 30 burpees minutos y 30 flexiones de tríceps");
                            case 2:
                                System.out.println("Curl de bíceps, peso muerto y press de banca");
                            case 3:
                                System.out.println("Haz lo que puedas todo en 1 hora y media, no hay prisa ni tampoco tienes la obligación de hacerlo todo.");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (opcion2!=4);
                case 3:
                    System.out.println("Has elegido la opcion de Experto");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºEspalda");
                        System.out.println("2ºMaquinas");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        opcion3=teclado.nextInt();

                        switch(opcion3){
                            case 1:
                                System.out.println("Remo con barra durante 15 minutos, Jalones al pecho durante 15 min, pull over en polea alta con brazos extendidos durante 15 min y hiperextensión durante 15 min");
                            case 2:
                                System.out.println("Press de pecho en máquina durante 15 minutos, Remo al pecho en polea durante 15 min , Prensa de piernas durante 15 min y Curl femoral tumbado durante 15 min");
                            case 3:
                                System.out.println("Hay que hacerlo todo.");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (opcion3!=4);
                case 4:
                    System.out.println("Saliendo");
            }
        }while (opcion!=4);
    }





}
