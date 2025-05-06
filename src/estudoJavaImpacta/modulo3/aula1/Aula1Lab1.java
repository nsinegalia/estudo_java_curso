package estudoJavaImpacta.modulo3.aula1;


import java.io.*;

public class Aula1Lab1 {

    public static void main (String [] args){

        escrever("Aula1 \n Laboratorio1");
        ler();

    }

    public static void escrever (String texto){

        try{

            FileOutputStream arquivo = new FileOutputStream("C:\\Users\\Kabum\\Desktop\\Aula1_Lab1.txt");
            DataOutputStream dados = new DataOutputStream(arquivo);

            dados.writeChars(texto);

            System.out.println("Arquivo criado");

            dados.close();

        }catch (IOException e){
            System.out.println("Não foi possível criar o arquivo");

        }



    }

    public static void ler (){

        try{

            FileInputStream arquivo = new FileInputStream("Aula1_Lab1.txt");
            DataInputStream dados = new DataInputStream(arquivo);

            while(dados.available() > 0 ){

                char c = dados.readChar();
                System.out.println("Lendo o arquivo..... " + c);
            }
            dados.close();

        } catch (IOException e){

            System.out.println("Não foi possível ler o arquivo!");

        }

    }



}
