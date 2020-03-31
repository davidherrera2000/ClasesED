package ed2;

import java.util.Scanner;

public class pedido {

    static int opcion;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        final double Kgcomida= 1.20;
        final double Litrodelíquido= 1;
        final double prohigi= 2.50;
        final double Kitcorona= 4.50;
        double compra= 0;
        int cuecomida= 0;
        int cuelliquidos= 0;
        int cueprohigi= 0;
        int cuecorona= 0;
        int numero;
        String localizacion;

        do{
            System.out.println("Introduce una opción:");
            System.out.println("1-Comida");
            System.out.println("2-Líquidos");
            System.out.println("3-Productos de higiene");
            System.out.println("4-Pedir Kit de supervivencia de Coronavirus");
            System.out.println("5-Sacar la cuenta");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Dónde vas a comprar?");
                    localizacion=teclado.next();
                    System.out.printf("¿Cuánta cantidad de comida quieres?");
                    numero=teclado.nextInt();
                    if (numero==0){
                        System.out.printf("No estás comprando nada");
                    }else{
                        cuecomida=numero;
                        compra += numero*Kgcomida;
                    }
                    break;
                case 2:
                    System.out.println("¿Dónde vas a comprar?");
                    localizacion=teclado.next();
                    System.out.printf("¿Cuántos litros quieres?");
                    numero=teclado.nextInt();
                    if (numero==0){
                        System.out.printf("No estás comprando nada");
                    }else{
                        cuelliquidos=numero;
                        compra += numero*Litrodelíquido;
                    }
                    break;
                case 3:
                    System.out.println("¿Dónde vas a comprar?");
                    localizacion=teclado.next();
                    System.out.printf("¿Cuántos productos quieres?");
                    numero=teclado.nextInt();
                    if (numero==0){
                        System.out.printf("No estás comprando nada");
                    }else{
                        cueprohigi=numero;
                        compra += numero*prohigi;
                    }
                    break;
                case 4:
                    System.out.println("¿Dónde está?");
                    localizacion=teclado.next();
                    System.out.printf("¿Cuántos kits quieres?");
                    numero=teclado.nextInt();
                    if (numero==0){
                        System.out.printf("No estás comprando nada");
                    }else{
                        cuecorona=numero;
                        compra += numero*Kitcorona;
                    }
                    break;
                case 5:
                    System.out.printf("Comida total: %d %n", cuecomida);
                    System.out.printf("Líquidos: %d %n" , cuelliquidos);
                    System.out.printf("Productos de higiene: %d %n", cueprohigi);
                    System.out.printf("Kit de supervivencia de coronavirus: %d %n", cuecorona);
                    System.out.printf("Cuenta total de la compra: %.2f %n", compra);
            }

        }while (opcion != 5);


    }
}
