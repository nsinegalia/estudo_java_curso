package estudoJavaImpacta.modulo2.aula5;

import java.util.ArrayList;

public class Aula5_Lab02 {
    public static void main(String[] args) {

        ArrayList<Aula5_Lab02_Estudante> estudanteList = new ArrayList<>();

        estudanteList.add(new Aula5_Lab02_Estudante("Nicolas", 9.0, 5.0));
        estudanteList.add(new Aula5_Lab02_Estudante("Joana", 8.5, 8.5));
        estudanteList.add(new Aula5_Lab02_Estudante("Antônio", 6.0, 9.0));
        estudanteList.add(new Aula5_Lab02_Estudante("Mariana", 7.5, 9.0));
        estudanteList.add(new Aula5_Lab02_Estudante("Ricardo", 7.0, 6.0));
        estudanteList.add(new Aula5_Lab02_Estudante("Gustavo", 9.5, 10.0));

        estudanteList.forEach(e -> e.setMedia((e.getNotaMatematica() + e.getNotaPortugues()) / 2));

        estudanteList.forEach(e -> System.out.println("As notas do " + e.getNome() + " foram: \n" + e.getNotaMatematica() + " Nota de Matematica \n" +
                e.getNotaPortugues() + " Nota de Portugues \n" ));
        estudanteList.forEach(e -> System.out.println("Média do aluno: \n" + e.getNome() + ": " + e.getMedia() + "\n"));

        estudanteList.forEach(e -> {
            if(e.getMedia() < 7.0){
                System.out.println("O aluno " + e.getNome() + " foi Reprovado.");
            }

        });


    }

}
