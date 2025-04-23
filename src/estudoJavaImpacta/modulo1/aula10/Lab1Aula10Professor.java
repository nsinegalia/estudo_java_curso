package estudoJavaImpacta.modulo1.aula10;

public class Lab1Aula10Professor extends Lab1Aula10Pessoa{
    private float salario;
    private String disciplina;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;

    }

    public Lab1Aula10Professor (String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina){

        super(nome, idade, sexo, new Lab1Aula10RG(numeroRG, dataNasc));
        this.salario = salario;
        this.disciplina = disciplina;


    }


    public void falar(String fala) {
        System.out.println(getNome() + " diz: " + fala);
    }


    public void mostrarDados() {
        System.out.println("PROFESSOR:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("RG: " + getRg().getNumero());
        System.out.println("Data de Nascimento: " + getRg().getDataNasci());
        System.out.println("Salário: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println();
    }

}
