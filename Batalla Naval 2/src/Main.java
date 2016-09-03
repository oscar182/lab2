import java.util.Scanner;

/**
 * Created by Alan on 03/09/2016.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            println("BATALLA NAVAL");
            print("Ingrese el tamaño del tablero que desea generar (MAX: 10): "); int a = scanner.nextInt();
            while (a > 10){
            print("El numero supera el tamaño maximo. Por favor ingreselo nuevamente: "); a = scanner.nextInt();
        }

        int b = a;
        char[][] tablero = new char[a][b];
        cargarTablero(tablero, a, b);
        imprimirTablero(tablero, a, b);
    }

    /**
     * Generador de tablero
     */
    public static void cargarTablero(char[][] tablero, int a, int b){
        for (int i = 0; i < a; i++){
            for (int f = 0; f < b; f++){
                tablero[a][b] = '~';
            }
        }
    }

    /**
     * Imprimir tablero
     */
    public static void imprimirTablero(char[][] tablero, int a, int b){
        print(" A B C D E F G H I J");
        for (int i = 0; i < a; i++){
            print(i + ".");
            for (int f = 0; f < b; f++){
                print(tablero[a][b] + " ");
            }
        }
    }

    /**
     * Print's
     */
    public static void println(String mensaje){
        System.out.println(mensaje);
    }

    public static void println(int mensaje){
        System.out.println(mensaje);
    }

    public static void println(char mensaje){
        System.out.println(mensaje);
    }

    public static void print(String mensaje){
        System.out.print(mensaje);
    }

    public static void print(int mensaje){
        System.out.print(mensaje);
    }

    public static void print(char mensaje){
        System.out.print(mensaje);
    }
}