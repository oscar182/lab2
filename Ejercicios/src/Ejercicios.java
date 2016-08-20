import java.util.*;

/**
 * Created by Alan on 16/08/2016.
 */
public class Ejercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        imprimirMensaje("Ingrese un numero del 1 al 31: "); int numero = sc.nextInt();
        if(numero >= 1 && numero <= 31) {
            switch (numero) {
                case 1: {
                    imprimirMensaje("1. Hacer un programa que imprima los números del 0 al 100");
                    for (int i = 0; i <= 100; i++){
                        imprimirMensaje(i);
                    }
                    break;
                }
                case 2: {
                    imprimirMensaje("2. Hacer un programa que imprima los números del 100 al 0 en orden decreciente");
                    for (int i = 100; i >= 0; i--) {
                        imprimirMensaje(i);
                    }
                    break;
                }
                case 3: {
                    imprimirMensaje("3. Hacer un programa que imprima las sumas de los 100 primeros números enteros");
                    int suma = 0;
                    for (int i = 0; i < 100; i++) {
                        suma += i;
                    }
                    imprimirMensaje(suma);
                    break;
                }
                case 4: {
                    imprimirMensaje("4. Hacer un programa que imprima los números pares entre el 0 al 100");
                    for (int i = 0; i <= 100; i++) {
                        if (i % 2 == 0) {
                            imprimirMensaje(i);
                        }
                    }
                    break;
                }
                case 5: {
                    imprimirMensaje("5. Hacer un programa que imprima los números impares hasta el 100 y que imprima cuantos impares hay");
                    int cont = 0;
                    for (int i = 0; i <= 100; i++) {
                        if (i % 2 != 0) {
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad de impares: " + cont);
                    break;
                }
                case 6: {
                    imprimirMensaje("6. Hacer un programa que imprima los números impares desde el 100 hasta la unidad y que calcule su suma");
                    int suma = 0;
                    for(int i = 100; i >= 0; i--){
                        if(i % 2 != 0){
                            imprimirMensaje(i);
                            suma += i;
                        }
                    }
                    imprimirMensaje("Total impares: " + suma);
                    break;
                }
                case 7: {
                    imprimirMensaje("7. Hacer un programa que imprima todos los números naturales que hay desde la unidad hasta un número introducido por teclado");
                    imprimirMensaje("Ingrese un numero: "); int a = sc.nextInt();
                    if(a > 0){
                        for (int i = 0; i <= a; i++){
                            imprimirMensaje(i);
                        }
                    } else {
                        for (int i = 0; i >= a; i--){
                            imprimirMensaje(i);
                        }
                    }
                    break;
                }
                case 8: {
                    imprimirMensaje("8. Hacer un  programa que imprima y cuente los múltiplos de 3 que hay entre 1 y 100");
                    int cont = 0;
                    for (int i = 1; i <= 100; i++){
                        if(i % 3 == 0){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad de multiplos de 3: " + cont);
                    break;
                }
                case 9: {
                    imprimirMensaje("9. Hacer un programa que calcule la suma de los números impares comprendidos entre el 0 y 100");
                    int suma = 0;
                    for (int i = 0; i <= 100; i++){
                        if(i % 2 != 0){
                            imprimirMensaje(i);
                            suma += i;
                        }
                    }
                    imprimirMensaje("Total impares: " + suma);
                    break;
                }
                case 10: {
                    imprimirMensaje("10. Hacer un algoritmo que imprima y cuente los múltiplos de 5 que hay entre 1 y 500");
                    int cont = 0;
                    for (int i = 1; i <= 500; i++){
                        if(i % 5 == 0){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad de multiplos de 5: " + cont);
                    break;
                }
                case 11: {
                    imprimirMensaje("11. Imprimir, contar y sumar los múltiplos de 2 hasta un número que introducimos por teclado");
                    int a = sc.nextInt();
                    int cont = 0;
                    int suma = 0;
                    for (int i = 0; i <= a; i++){
                        if(i % 2 == 0){
                            imprimirMensaje(i);
                            cont++;
                            suma += i;
                        }
                    }

                    imprimirMensaje("Cantidad de multiplos: " + cont + " Total: " + suma);
                    break;
                }
                case 12: {
                    imprimirMensaje("12. Imprimir, contar y sumar los múltiplos de 10 hasta un número que introducimos por teclado");
                    int a = sc.nextInt();
                    int cont = 0;
                    int suma = 0;
                    for (int i = 0; i <= a; i++){
                        if(i % 10 == 0){
                            imprimirMensaje(i);
                            cont++;
                            suma += i;
                        }
                    }

                    imprimirMensaje("Cantidad de multiplos: " + cont + " Total: " + suma);
                    break;
                }
                case 13: {
                    imprimirMensaje("13. Introducir un número por teclado menor que 500. Imprimir, sumar y contar los números que están separadas entre si 8 posiciones," +
                            " desde ese número al 500");
                    int a = sc.nextInt();
                    if(a < 500){
                        int cont = 0;
                        int suma = 0;

                        for (int i = a; i <= 500; i += 9){
                            imprimirMensaje(i);
                            suma += i;
                            cont++;
                        }

                        imprimirMensaje("Cantidad: " + cont + " Total: " + suma);
                    }
                    break;
                }
                case 14: {
                    imprimirMensaje("14. Calcular la suma de los cuadrados de los números pares entre el 0 y el 100.");
                    int suma = 0;
                    for (int i = 0; i <= 100; i++){
                        if (i % 2 == 0){
                            suma += (int) Math.pow(i, 2);
                        }
                    }
                    imprimirMensaje(suma);
                    break;
                }
                case 15: {
                    imprimirMensaje("15. Introducir un número por teclado menor que 100.imprimir la suma de los cuadrados de los números que están separados entre sí 4 posiciones.");
                    int a = sc.nextInt();
                    if(a < 100){
                        int suma = 0;
                        for (int i = a; i <= 100; i += 4){
                            suma += (int) Math.pow(i, 2);
                        }
                        imprimirMensaje(suma);
                    }
                    break;
                }
                case 16: {
                    imprimirMensaje("16. Introducir un número por teclado que nos diga si es positivo o negativo.");
                    int a = sc.nextInt();
                    String mensaje = a > 0 ? "Positivo" : "Negativo";
                    imprimirMensaje(mensaje);
                    break;
                }
                case 17: {
                    imprimirMensaje("17. Introducir un número por teclado. Que nos diga si es par o impar.");
                    int a = sc.nextInt();
                    String mensaje = a % 2 == 0 ? "Par" : "Impar";
                    imprimirMensaje(mensaje);
                    break;
                }
                case 18: {
                    imprimirMensaje("18. Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado");
                    int a = sc.nextInt();
                    int cont = 0;
                    for (int i = 0; i < a; i++){
                        if (i % 3 == 0){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad: " + cont);
                    break;
                }
                case 19: {
                    imprimirMensaje("19. Hacer un programa que imprima los números del 1 al 100." +
                            " Que calcule la suma de todos los números pares por un lado y otro la de todos los impares.");
                    int sumaPares = 0;
                    int sumaImpares = 0;
                    for (int i = 1; i <= 100; i++){
                        if (i % 2 == 0){
                            sumaPares += i;
                        } else {
                            sumaImpares += i;
                        }
                    }
                    imprimirMensaje("Total Pares: " + sumaPares + " Total Impares: " + sumaImpares);
                    break;
                }
                case 20: {
                    imprimirMensaje("20. Imprimir y contar los números que son múltiplos de 2 o 3 que hay del 1 al 100.");
                    int cont = 0;
                    for(int i = 1; i <= 100; i++){
                        if((i % 2 == 0) || (i % 3 == 0)){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad de numeros: " + cont);
                    break;
                }
                case 21: {
                    imprimirMensaje("21. Imprimir y contar los números que son múltiplos de 2 y 3 que hay del 1 al 100.");
                    int cont = 0;
                    for(int i = 1; i <= 100; i++){
                        if((i % 2 == 0) && (i % 3 == 0)){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad de numeros: " + cont);
                    break;
                }
                case 22: {
                    imprimirMensaje("22. Hacer un programa que imprima el mayor el menor de una serie de cinco números  que vamos introduciendo por teclado.");
                    int[] numeros = new int[5];
                    for(int i = 0; i < 5; i++){
                        numeros[i] = sc.nextInt();
                    }

                    Arrays.sort(numeros);
                    imprimirMensaje("Mayor: " + numeros[4] + " Menor: " + numeros[0]);
                    break;
                }
                case 23: {
                    imprimirMensaje("23. Introducir dos números por teclado. Imprimir los números naturales que hay entre ambos números empezando por el más pequeño," +
                            " contar cuantos hay y cuántos de ellos son pares. Calcular la suma de los impares.");
                    int a = sc.nextInt(), b = sc.nextInt();
                    int cont = 0;
                    int contPares = 0;
                    int sumaImpares = 0;

                    if(a < b){
                        for(int i = a; i <= b; i++){
                            imprimirMensaje(i);
                            cont++;
                            if(i % 2 == 0){
                                contPares++;
                            } else {
                                sumaImpares += i;
                            }
                        }
                    } else {
                        for(int i = b; i <= a; i++){
                            imprimirMensaje(i);
                            cont++;
                            if(i % 2 == 0){
                                contPares++;
                            } else {
                                sumaImpares += i;
                            }
                        }
                    }

                    imprimirMensaje("Cantidad de numeros: " + cont + " Cantidad de numeros Pares: " + contPares + " Suma de Impares: " + sumaImpares);
                    break;
                }
                case 24: {
                    imprimirMensaje("24. Introducir una serie de números. Decir si esos números son mayores o menores de 10.");
                    boolean rta = true;

                    do {
                        int a = sc.nextInt();
                        if(a > 10){
                            imprimirMensaje("Mayor a 10");
                        } else {
                            imprimirMensaje("Menor a 10");
                        }

                        imprimirMensaje("Continuar? Si/No");
                        String pregunta = sc.next();
                        if(pregunta.equalsIgnoreCase("no")){
                            rta = false;
                        }
                    }while (rta);
                    break;
                }
                case 25: {
                    imprimirMensaje("25. Introducir tantos números que hay entre el 1 al 100.excepto los múltiplos de 2.");
                    boolean rta = true;
                    while (rta){
                        imprimirMensaje("Ingrese un numero entre el 1 al 100: ");
                        int a = sc.nextInt();
                        if(a < 1){
                            imprimirMensaje("Error 00: El numero ingresado es menor a 1");
                        } else if (a > 100){
                            imprimirMensaje("Error 02: El numero ingresado es mayor a 100");
                        }

                        if (a % 2 == 0){
                            imprimirMensaje("Error 03: El numero ingresado es par");
                        }


                        imprimirMensaje("Continuar? Si/No");
                        String pregunta = sc.next();

                        if(pregunta.equalsIgnoreCase("no")){
                            rta = false;
                        }
                    }
                    break;
                }
                case 26: {
                    imprimirMensaje("26. Imprimir y sumar los números desde el cero hasta un número determinado, " +
                            " excepto los múltiplos de 5 imprimir el valor de la suma de los múltiplos de 5.");
                    imprimirMensaje("Ingrese un numero: ");
                    int a = sc.nextInt();
                    int suma = 0;
                    int sumaMultiplos = 0;

                    for(int i = 0; i <= a; i++){
                        if(i % 5 != 0){
                            imprimirMensaje(i);
                            suma += i;
                        } else {
                            sumaMultiplos += i;
                        }
                    }

                    imprimirMensaje("Suma sin multiplos de 5: " + suma + " Suma de los multiplos de 5: " + sumaMultiplos);
                    break;
                }
                case 27: {
                    imprimirMensaje("27. Imprimir y contar los números, que son a la vez múltiplos de 2 y 3, que hay entre la unidad y el determinado número.");
                    imprimirMensaje("Ingrese un numero: ");
                    int a = sc.nextInt();
                    int cont = 0;
                    for(int i = 0; i <= a; i++){
                        if((i % 2 == 0) && (i % 3 == 0)){
                            imprimirMensaje(i);
                            cont++;
                        }
                    }
                    imprimirMensaje("Cantidad: " + cont);
                    break;
                }
                case 28: {
                    imprimirMensaje("28. Introducir una serie de números. Sumar los múltiplos  de 5. Cual es el mayor y cuántos números se han introducido.");
                    boolean rta = true;
                    int sumaMultiplos = 0;
                    int mayor = 0;
                    int cont = 0;
                    do {
                        int a = sc.nextInt();
                        if (a > mayor){
                            mayor = a;
                        }

                        if (a % 5 == 0){
                            sumaMultiplos += a;
                        }

                        cont++;

                        imprimirMensaje("Continuar? Si/No");
                        String mensaje = sc.next();
                        if(mensaje.equalsIgnoreCase("no")){
                            rta = false;
                        }
                    }while (rta);

                    imprimirMensaje("Mayor: " + mayor + " Suma multiplos de 5: " + sumaMultiplos + " Cantidad de numeros introducidos: " + cont);
                    break;
                }
                case 29: {
                    imprimirMensaje("29. Introducir dos números por teclado de tal forma que el segundo sea mayor que el primero." +
                            " A partir del primero. Imprimir los números separados. Entre si 7 unidades, contarlos." +
                            " Cuántos de estos son pares y cuanto vale la suma de los impares.");
                    imprimirMensaje("Introducir 2 numeros. El 2do numero tiene que ser mayor que el primero: ");
                    boolean rta = true;
                    int a = sc.nextInt();
                    int b;
                    do {
                        b = sc.nextInt();
                        if(b > a){
                            rta = false;
                        } else {
                            imprimirMensaje("El segundo numero tiene que ser mayor que el primero");
                        }
                    } while (rta);

                    int cont = 0;
                    int contPares = 0;
                    int sumaImpares = 0;
                    for(int i = a; i <= b; i += 8){
                        imprimirMensaje(i);
                        cont++;

                        if(i % 2 == 0){
                            contPares++;
                        } else {
                            sumaImpares += i;
                        }
                    }

                    imprimirMensaje("Cantidad de numeros: " + cont + " Cantidad de Pares: " + contPares + " Total Impares: " + sumaImpares);
                    break;
                }
                case 30: {
                    imprimirMensaje("30. Introducir una cantidad por teclado." +
                            " Si es menor que 500, sumarle el 50 por ciento; si es mayor o igual a 500 pero menor que 1000, sumarle el 7 por ciento;" +
                            " si es mayor que 1000 y menor o igual a 5000, restarle el 5 por ciento");

                    imprimirMensaje("Ingrese un numero: ");
                    float a = sc.nextInt();
                    float porcentaje;
                    float resultado;

                    if(a < 500){
                        porcentaje = 50;
                        resultado = (porcentaje / 100) * a;
                        imprimirMensaje(a + resultado);
                    } else if ((a >= 500) && (a < 1000)){
                        porcentaje = 7;
                        resultado = (porcentaje / 100) * a;
                        imprimirMensaje(a + resultado);
                    } else if((a > 1000) && (a < 5000)){
                        porcentaje = 5;
                        resultado = (porcentaje / 100) * a;
                        imprimirMensaje(a - resultado);
                    }
                    break;
                }
                case 31: {
                    imprimirMensaje("31. Desarrolle un programa que obtenga un número desde el teclado e imprima por consola los siguientes 100 números de la serie fibonacci");
                    imprimirMensaje("Ingrese un numero: ");
                    int number = sc.nextInt();

                    boolean rta = true;

                    long a = 0;
                    long b = 1;
                    long suma = 0;
                    do {
                        suma = a + b;
                        a = b;
                        b = suma;

                        if (suma >= number){
                            for(int i = 0; i < 100; i++){
                                imprimirMensaje((i + 1) + ". " + suma);
                                suma = a + b;
                                a = b;
                                b = suma;
                            }

                            rta = false;
                        }
                    } while (rta);
                    break;
                }
            }
        }
    }

    /**
     * Imprimir Mensaje
     */
    public static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static void imprimirMensaje(int mensaje){
        System.out.println(mensaje);
    }

    public static void imprimirMensaje(float mensaje){
        System.out.println(mensaje);
    }

}