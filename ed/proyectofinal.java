package ed2;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;
import java.util.Scanner;

public class proyectofinal {

    static Scanner teclado = new Scanner(System.in);
    static int opcion;
    static String texto;
    private static Object IOException;

    public static void main(String[] args) throws IOException {

        System.out.println("Bienvenido a la página web de Islazul");

        do {
            System.out.println("Introduce una de las opciones que hay aquí:");
            System.out.println("1-Comprar");
            System.out.println("2-Registrarse");
            System.out.println("3-Más sobre el centro");
            System.out.println("4-Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Dónde/Qué quieres comprar?");
                    do {
                        System.out.println("1-GAME");
                        System.out.println("2-LIDL");
                        System.out.println("3-Mediamark");
                        System.out.println("4-Toysrus");
                        System.out.println("5-Salir");
                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                try {
                                    Desktop.getDesktop().browse(new URI("https://www.game.es/#"));
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2:
                                try {
                                    Desktop.getDesktop().browse(new URI("https://www.lidl.es/"));
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 3:
                                try {
                                    Desktop.getDesktop().browse(new URI("https://www.mediamarkt.es/es/category/_campa%C3%B1as-y-ofertas-701114.html"));
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 4:
                                try {
                                    Desktop.getDesktop().browse(new URI("https://www.toysrus.es/"));
                                } catch (URISyntaxException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 5:
                                System.out.println("Vuelva cuando quiera");
                                break;
                        }
                    }while (opcion != 5) ;
                    break;
                case 2:
                    String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
                    Object oficio = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                            "", JOptionPane.QUESTION_MESSAGE, null,
                            new Object[]{"Seleccione", "Sí", "No"}, "Seleccione");
                    int respu = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Aviso", JOptionPane.YES_NO_OPTION);
                    break;
                case 3:
                    System.out.println("¿Qué quieres poner de comentario?");
                    texto = teclado.next();
                    System.out.println(texto);
                    break;
                case 4:
                    System.out.println("Esperemos en volverle a ver");
                    break;
                default:
                    System.out.println("Número no válido");
                    break;
            }
        }while (opcion != 4) ;
    }
}