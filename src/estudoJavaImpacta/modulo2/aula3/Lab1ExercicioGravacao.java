package estudoJavaImpacta.modulo2.aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab1ExercicioGravacao {
    public static void main (String [] args ){

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite qualquer frase: ");
            String texto = scanner.nextLine();
            //C:\Users\Kabum\Desktop

            PrintWriter writer = new PrintWriter("C:\\Users\\Kabum\\Desktop\\testeJavaDoc1.txt");
            writer.println(texto);
            writer.close();

            System.out.println("Arquivo de texto gerado com Sucesso ");

        }catch (IOException e){

            System.out.println("Falha ao gravar as informações digitadas");

        }

        scanner.close();

    }
}
