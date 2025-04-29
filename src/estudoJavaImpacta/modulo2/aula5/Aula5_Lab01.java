package estudoJavaImpacta.modulo2.aula5;

import java.util.HashMap;

public class Aula5_Lab01 {

    public static void main (String [] args){
        HashMap<String, Integer> pessoaMap = new HashMap<>();

        pessoaMap.put("Nicolas", 26);
        pessoaMap.put("Ingrid", 25);
        pessoaMap.put("Gustavo", 26);
        pessoaMap.put("Leticia", 27);

        pessoaMap.forEach((k,v)-> System.out.println(k + ": " + v));


    }

}
