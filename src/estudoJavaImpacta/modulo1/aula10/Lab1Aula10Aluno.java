package estudoJavaImpacta.modulo1.aula10;

public class Lab1Aula10Aluno extends Lab1Aula10Pessoa {

    private float mensalidade;
    private String curso;

    // Construtor
    public Lab1Aula10Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
        super(nome, idade, sexo, new Lab1Aula10RG(numeroRG, dataNasc));
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    // Getters
    public float getMensalidade() {
        return mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    // Setters
    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void falar(String fala) {
        System.out.println(getNome() + " diz: " + fala);
    }

    @Override
    public void mostrarDados() {
        System.out.println("ALUNO:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("RG: " + getRg().getNumero());
        System.out.println("Data de Nascimento: " + getRg().getDataNasci());
        System.out.println("Mensalidade: R$ " + mensalidade);
        System.out.println("Curso: " + curso);
        System.out.println();
    }



}
