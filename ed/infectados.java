package ed2;

import java.util.Scanner;

public class infectados {

    static Scanner teclado = new Scanner(System.in);
    static int opcion;
    static String texto;

    public static void main(String[] args) {

        System.out.println("Bienvenido al centro de salud");

        do {
            System.out.println("Introduce la opción de tu análisis:");
            System.out.println("1-Temperatura corporal");
            System.out.println("2-Indicios de enfermedad");
            System.out.println("3-Análisis de sangre");
            System.out.println("4-Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    double temperatura;
                    System.out.println("Por favor póngase el termómetro");
                    temperatura = teclado.nextDouble();


                    if (temperatura <= 28) {
                        System.out.println("Sano");
                    } else if (temperatura > 28 && temperatura <= 30) {
                        System.out.println("Enfermo, pero se puede curar fácilmente");
                    } else if (temperatura > 36) {
                        System.out.println("Infectado, al hospital");
                    } else {
                        System.out.println("A volver a hacerlo");
                    }
                    break;
                case 2:
                    System.out.println("¿Qué tienes?");
                    texto = teclado.next();
                    System.out.println("Ve a la habitación que te darán en Recepción");
                    break;
                case 3:
                    System.out.println("Analizando...");
                    texto = teclado.next();
                    System.out.println("Nos sale "+texto);
                    break;
                case 4:
                    System.out.println("Esperemos en volverle a ver");
                    break;
                default:
                    System.out.println("Número no válido");
                    break;
            }

        }while (opcion != 4);
    }
}