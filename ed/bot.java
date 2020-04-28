package ed2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.*;
import java.util.Scanner;

public class bot {

    static Scanner teclado = new Scanner(System.in);
    static int opcion;
    static String texto;
    private static Object IOException;

    public static void main(String[] args) throws IOException {

        System.out.println("Bienvenido");

        do {
            System.out.println("Introduce una opción:");
            System.out.println("1-Pedido");
            System.out.println("2-Formulario");
            System.out.println("3-Comentario");
            System.out.println("4-Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    String pedido = JOptionPane.showInputDialog("¿Qué quieres comprar?");
                    URL url = new URL("https://www.amazon.es/");
                    URLConnection con = url.openConnection();
                    int resp=JOptionPane.showConfirmDialog(null,"¿Quieres seguir?");
                    if (JOptionPane.OK_OPTION == resp){
                        System.out.println("Selecciona opción Afirmativa");
                    }
                    else{
                        System.out.println("No selecciona una opción afirmativa");
                    }
                    break;
                case 2:
                    String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
                    int numero=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
                    Object oficio = JOptionPane.showInputDialog(null,"¿Tienes un oficio?",
                            "", JOptionPane.QUESTION_MESSAGE, null,
                            new Object[] { "Seleccione","Sí", "No" },"Seleccione");
                    Object bot = JOptionPane.showInputDialog(null,"¿Eres un bot?",
                            "", JOptionPane.QUESTION_MESSAGE, null,
                            new Object[] { "Seleccione","Sí", "No" },"Seleccione");
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

        }while (opcion != 4);

    }
    }
