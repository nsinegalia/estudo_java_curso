package estudoJavaImpacta.modulo1.aula7;

public class Lab5Aula7TesteAluno {
    public static void main (String [] args){

        Lab5Aula7Aluno joao = new Lab5Aula7Aluno();
        joao.setNome("João");
        joao.setNome("João");
        joao.incrementarContador();
        joao.imprimeAluno();
        System.out.println("Contador de alunos (via objeto): " + joao.contadorDeAlunos);
        System.out.println("Contador de alunos (via classe): " + Lab5Aula7Aluno.contadorDeAlunos);
        System.out.println();

        Lab5Aula7Aluno maria = new Lab5Aula7Aluno();
        maria.setNome("Maria");
        maria.incrementarContador();
        maria.imprimeAluno();
        System.out.println("Contador de alunos (via objeto): " + maria.contadorDeAlunos);
        System.out.println("Contador de alunos (via classe): " + Lab5Aula7Aluno.contadorDeAlunos);
        System.out.println();

        Lab5Aula7Aluno marcos = new Lab5Aula7Aluno();
        marcos.setNome("Marcos");
        marcos.incrementarContador();
        marcos.imprimeAluno();
        System.out.println("Contador de alunos (via objeto): " + marcos.contadorDeAlunos);
        System.out.println("Contador de alunos (via classe): " + Lab5Aula7Aluno.contadorDeAlunos);

    }

}
