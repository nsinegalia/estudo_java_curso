package estudoJavaImpacta;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Lab1Aula5 {
    public static void main(String[] args) {


        int[] numeros = {2, 47, 109, 191, 269, 997, 810, 625, 927, 403};

        Instant inicio;
        Instant fim;

        inicio = Instant.now();

        for (int numero : numeros) {

            verificaPrimo(numero);

        }

        fim = Instant.now();

        System.out.println(Duration.between(inicio, fim));


    }

    public static void verificaPrimoOtimizado(int numeros) {

        // O número Primo só é divisível por 1 e por ele mesmo!! Ou seja, o maximo de divisões realizadas será 2.

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: "); */

        // int numeros;  = scanner.nextInt();

        int divisoes = 0;

        for (int i = 2; i < numeros; i++) {

            if (numeros % i == 0) {
                divisoes++;
                break;
            }

        }
        if (divisoes > 0) { // numero 1 não é primo

            System.out.println("O número inserido não é Primo: " + numeros);

        } else {

            System.out.println("O número inserido é Primo: " + numeros);


        }

    }

    public static void verificaPrimo(int numeros) {

        // O número Primo só é divisível por 1 e por ele mesmo!! Ou seja, o maximo de divisões realizadas será 2.

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: "); */

        // int numeros;  = scanner.nextInt();

        int divisoes = 0;

        for (int i = 1; i <= numeros; i++) {

            if (numeros % i == 0) {
                divisoes++;

            }

        }
        if (divisoes <= 2 && numeros > 1) { // numero 1 não é primo

            System.out.println("O número inserido é Primo: " + numeros);

        } else {

            System.out.println("O número inserido não é Primo: " + numeros);


        }

    }


}
