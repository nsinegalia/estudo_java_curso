package estudoJavaImpacta;

import java.util.Scanner;

public class Lab2Aula4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");


        int valor = scanner.nextInt(); // Numero que o usuário colocaria
        int divisor = 2; // Qualquer número divisivel por 2 com o resto 0 é par


        if (valor % divisor == 0) {
            System.out.println("Este numero é Par: " + valor);

        } else {
            System.out.println("Este numero é Impar: " + valor);
        }

    }

}
