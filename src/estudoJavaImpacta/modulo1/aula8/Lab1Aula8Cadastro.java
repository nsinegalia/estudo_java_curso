package estudoJavaImpacta.modulo1.aula8;

public class Lab1Aula8Cadastro {

    private String nome;
    private String sobrenome;
    private int idade;

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;

    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;

    }

    public String getSobrenome() {

        return sobrenome;

    }

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public int getIdade() {

        return idade;

    }

    public Lab1Aula8Cadastro(){

       this.nome = "";
        sobrenome = "";
        idade = 0;
    }

    public Lab1Aula8Cadastro (String nome, String sobrenome){

        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public Lab1Aula8Cadastro (String nome, String sobrenome, int idade){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public void mostrar (){

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);

    }

}
