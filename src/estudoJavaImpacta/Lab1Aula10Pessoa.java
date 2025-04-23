package estudoJavaImpacta;

public abstract class Lab1Aula10Pessoa {

    String nome;
    int idade;
    char sexo;
    Lab1Aula10RG rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Lab1Aula10RG getRg(){
        return rg;
    }

    public void setRg(Lab1Aula10RG rg) {
        this.rg = rg;
    }


    public Lab1Aula10Pessoa (String nome, int idade, char sexo, Lab1Aula10RG rg ){

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = rg;

    }

    public abstract void falar (String fala); //metodos abstratos
    public abstract void mostrarDados(); //metodos abstratos




}
