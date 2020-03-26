package ed;

import java.util.Scanner;

public class aplicación {

    public static void main(){
        Scanner teclado= new Scanner(System.in);
        int tutorial,paso1, paso2,paso3;

        System.out.printf("Bienvenido al tutorial de juego de Street Fighter");

        do{
            System.out.println("Seleccione una opción de dificultad para empezar");
            System.out.println("1ºNovato");
            System.out.println("2ºAvanzado");
            System.out.println("3ºExperto");
            System.out.println("4ºSalir");
            tutorial=teclado.nextInt();

            switch(tutorial){
                case 1:
                    System.out.println("Has elegido la opcion de novato");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºGolpes básicos");
                        System.out.println("2ºMovimientos especiales");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        paso1=teclado.nextInt();

                        switch(paso1){
                            case 1:
                                System.out.println("Pulsa Cuadrado, Círculo, Triángulo y X");
                            case 2:
                                System.out.println("Atrás+Abajo+Delante+Cuadrado; Abajo+Atras+X; Atras+Delante+Círculo");
                            case 3:
                                System.out.println("Ejecuta todos los pasos que te piden y derrota al rival");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (paso1!=4);
                case 2:
                    System.out.println("Has elegido la opcion de Avanzado");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºBloqueos");
                        System.out.println("2ºCombos avanzados");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        paso2=teclado.nextInt();

                        switch(paso2){
                            case 1:
                                System.out.println("Bloquea tres veces de pie y bloquea tres veces debajo");
                            case 2:
                                System.out.println("Círculo,Círculo,Abajo+Triángulo; X,X; Cuadrado,Cuadrado,Cuadrado");
                            case 3:
                                System.out.println("Ejecuta todos los pasos que te piden y derrota al rival");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (paso2!=4);
                case 3:
                    System.out.println("Has elegido la opcion de Experto");
                    do{
                        System.out.println("Seleccione una opción");
                        System.out.println("1ºRomper combo");
                        System.out.println("2ºAgerres");
                        System.out.println("3ºTodo");
                        System.out.println("4ºSalir");
                        paso3=teclado.nextInt();

                        switch(paso3){
                            case 1:
                                System.out.println("Mientras te golpean mantén pulsado los botones R2 y L2");
                            case 2:
                                System.out.println("Pulsa L1");
                            case 3:
                                System.out.println("Ejecuta todos los pasos que te piden y derrota al rival");
                            case 4:
                                System.out.println("Saliendo");
                        }
                    }while (paso3!=4);
                case 4:
                    System.out.println("Saliendo");
            }
        }while (tutorial!=4);
    }





}
