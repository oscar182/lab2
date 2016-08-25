import java.util.*;

/**
 * Created by Alan on 22/08/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] matriz = new char[10][10];

        for (int i = 0; i < 10; i++){
            for (int f = 0; f < 10; f++){
                matriz[i][f] = '~';
            }
        }

        int cont = 0;
        while (cont != 3){
            int i = (int) (Math.random()*9);
            int f = (int) (Math.random()*9);

            if(matriz[i][f] == '~'){
                matriz[i][f] = 'O';

                boolean rta = true;
                do {
                    int a = (int) (Math.random()*(1-4)+4);
                    switch (a){
                        case 1: { //Arriba
                            if(i != 0){
                                matriz[i - 1][f] = 'O';
                                rta = false;
                            }
                        }
                        break;
                        case 2: { //Abajo
                            if (i != 9){
                                matriz[i + 1][f] = 'O';
                                rta = false;
                            }
                        }
                        break;
                        case 3: { //Derecha
                            if (f != 9){
                                matriz[i][f + 1] = 'O';
                                rta = false;
                            }
                        }
                        break;
                        case 4: { //Izquierda
                            if (f != 0){
                                matriz[i][f - 1] = 'O';
                                rta = false;
                            }
                        }
                        break;
                    }
                } while (rta);
                cont++;
            }
        }
        System.out.println("     Tablero Inicial");
        System.out.println("   A B C D E F G H I J");
        for (int i = 0; i < 10; i++){
            System.out.print(i + ". ");
            for (int f = 0; f < 10; f++){
                System.out.print(matriz[i][f] + " ");
            }
            System.out.println("");
        }
    }
}
