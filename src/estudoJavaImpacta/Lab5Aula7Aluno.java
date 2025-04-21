package estudoJavaImpacta;

public class Lab5Aula7Aluno {


    private String nome;

    public static int contadorDeAlunos = 0;

    // Metodo getter - retorna o valor de nome
    public String getNome(){
        return nome;
    }

    // Metodo setter - define o valor de nome
    public void setNome(String nome){
        this.nome = nome;

    }

    public void imprimeAluno() {
        System.out.println("Nome do aluno: " + nome);
    }

    public void incrementarContador() {
        contadorDeAlunos++;
    }



}
