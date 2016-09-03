import java.util.*;

/**
 * Created by Alan on 22/08/2016.
 * Batalla Naval con carga de 3 Barcos Aleatorios
 * El tablero tiene un tamaño por defecto de 10x10
 *
 */
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        imprimirMensaje("Batalla Naval");
        imprimirMensaje("¿Iniciar? Si/No");
        String mensaje = sc.next();

        if(mensaje.equalsIgnoreCase("si")){

            int[][] matriz = new int[10][10];
            for(int i = 0; i < 10; i++){
                for(int f = 0; f < 10; f++){
                    matriz[i][f] = 0;
                }
            }

            imprimirMensaje("Tablero inicial");
            imprimirMensaje("   A B C D E F G H I J");
            for(int i = 0; i < 10; i++){
                System.out.print(i + "." + " ");
                for(char f = 0; f < 10; f++){
                    System.out.print(matriz[i][f] + " ");
                }
                imprimirMensaje("");
            }

            System.out.println("\n\n");
            imprimirMensaje("Cargar barcos"); int cont = 0;

            while(cont != 3){
                imprimirMensaje("Ingrese coordenadas");

                System.out.print("Ingrese una Letra de la A a la J: "); char letra = sc.next().charAt(0);
                System.out.print("Ingrese un numero del 1 al 10: "); int i = sc.nextInt();

                if((letra >= 65 && letra <= 74) || (letra >= 97 && letra <= 106)){
                    if(i >= 1 && i <= 10){
                        imprimirMensaje("bien gato\n");
                        cont++;
                    } else {
                        imprimirMensaje("El numero no esta entre 1 y 10\n");
                    }
                } else {
                    imprimirMensaje("La letra no esta entre la A y la J\n");
                }
            }
        } else if(mensaje.equalsIgnoreCase("no")){
            imprimirMensaje("Bueno bai");
        } else {
            imprimirMensaje("Era Si o No gato");
        }
    }

    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
