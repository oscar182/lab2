import java.util.Scanner;

import static metodos.Metodos.*;


/**
 * Created by Alan on 03/09/2016.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        println("BATALLA NAVAL");
        print("Ingrese el tamaño del tablero que desea generar (MAX: 10): ");
        int a = scanner.nextInt();
        while (a > 10) {
            print("El numero supera el tamaño maximo. Por favor ingreselo nuevamente: ");
            a = scanner.nextInt();
        }

        //Creamos el tablero de juego
        char[][] tablero = new char[a][a];
        crearTablero(tablero, a);
        imprimirTablero(tablero, a);

        //Cargamos la cantidad de barcos deseados
        int cantMAX = ((a * a) / 2);
        print("Ingrese la cantidad de barcos que desea cargar (MAX: " + cantMAX + "): ");
        int cantBarcos = scanner.nextInt();
        while (cantBarcos > cantMAX) {
            print("El numero supera el tamaño maximo. Por favor ingreselo nuevamente: ");
            cantBarcos = scanner.nextInt();
        }

        //Hora de cargar los barcos
        int[] array = new int[4];
        int cont = 1;
        while (cont <= cantBarcos) {
            print("Ingrese las coordenadas para añadir al barco " + cont + ": ");
            String coor1 = scanner.next();
            String coor2 = scanner.next();
            array[0] = posicionLetra(coor1) - 1;
            array[1] = posicionNum(coor1) - 1;
            array[2] = posicionLetra(coor2) - 1;
            array[3] = posicionNum(coor2) - 1;

            if ((array[0] >= 0) && (array[0] <= a)){
                if ((array[1] >= 0) && (array[1] <= a)){
                    if ((array[2] >= 0) && (array[2] <= a)){
                        if ((array[3] >= 0) && (array[3] <= a)){
                            if (sonContiguos(tablero, array[0], array[1], array[2], array[3])){

                            } else {
                                println("Las coordenadas no son contiguas. Por favor ingrese dos coordenadas que sean contiguas");
                            }
                        } else {
                            println("La numero de la coordenada " + coor2 + " supera el rango maximo del tablero. Por favor ingrese las coordenadas nuevamente");
                        }
                    } else {
                        println("La letra de la coordenada " + coor2 + " supera el rango maximo del tablero. Por favor ingrese las coordenadas nuevamente");
                    }
                } else {
                    println("La numero de la coordenada " + coor1 + " supera el rango maximo del tablero. Por favor ingrese las coordenadas nuevamente");
                }
            } else {
                println("La letra de la coordenada " + coor1 + " supera el rango maximo del tablero. Por favor ingrese las coordenadas nuevamente");
            }
        }
    }
}
