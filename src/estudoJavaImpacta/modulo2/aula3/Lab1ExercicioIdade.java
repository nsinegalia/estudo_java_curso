package estudoJavaImpacta.modulo2.aula3;

import java.util.Scanner;

public class Lab1ExercicioIdade {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite o ano do seu nascimento: ");
            String anoNascimentoStr = scanner.nextLine(); // Neste passo estou solicitando que o usuario coloque na proxima linha o ano de nascimento
            int anoNascimento = Integer.parseInt(anoNascimentoStr); // Aqui pego o valor armazenado na variavel anoNascimentoStr e passo para int.
            int idade = 2025 - anoNascimento; // armazeno na variavel idade o calculo do ano atual - ano de nascimento

            System.out.println("Sua idade é: " +idade + " anos."); // mostro a idade do usuario

        }catch (NumberFormatException e){
            System.out.println("Valor digitado inválido"); // se caso der errado, mostro isso
        }

        scanner.close(); // encerro o metodo scanner.

    }
}
