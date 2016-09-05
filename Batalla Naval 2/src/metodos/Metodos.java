package metodos;

/**
 * Created by Alan on 05/09/2016.
 */
public class Metodos {

    /**
     * Crear Tablero
     */
    public static void crearTablero(char[][] matriz, int tam){
        for (int i = 0; i < tam; i++){
            for (int f = 0; f < tam; f++){
                matriz[i][f] = '~';
            }
        }
    }

    /**
     * Cargar Barcos
     */
    public static boolean sonContiguos(char[][] matriz , int a, int b, int c, int d){
        return false;
    }

    public static int posicionLetra(String coor1){
        char a = coor1.charAt(0); int n1 = 0;

        switch (a){
            case 'a' | 'A': n1 = 1; break;
            case 'b' | 'B': n1 = 2; break;
            case 'c' | 'C': n1 = 3; break;
            case 'd' | 'D': n1 = 4; break;
            case 'e' | 'E': n1 = 5; break;
            case 'f' | 'F': n1 = 6; break;
            case 'g' | 'G': n1 = 7; break;
            case 'h' | 'H': n1 = 8; break;
            case 'i' | 'I': n1 = 9; break;
            case 'j' | 'J': n1 = 10; break;
        }

        return n1;
    }

    public static int posicionNum(String coor1){
        String a = coor1.substring(1);
        int n1 = Integer.parseInt(a);

        return n1;
    }

    /**
     * Imprimir tablero
     */
    public static void imprimirTablero(char[][] matriz, int tam){
        int cont = 0;
        char ascii = 65;
        print(" ");
        while (cont != tam){
            print(" ");
            print(ascii);
            cont++;
            ascii++;
        }

        println("");
        for (int i = 0; i < tam; i++){
            print((i + 1) + ". ");
            for (int f = 0; f < tam; f++){
                print(matriz[i][f] + " ");
            }
            println("");
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
