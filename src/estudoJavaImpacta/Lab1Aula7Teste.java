package estudoJavaImpacta;

public class Lab1Aula7Teste {
    public static void main(String[] args) {

        Lab1Aula7Funcionario Funcionario = new Lab1Aula7Funcionario();

        Funcionario.nome = "Nicolas";
        Funcionario.sobrenome = "Sinegalia";
        Funcionario.cargo = "Engenheiro de Software";
        Funcionario.salario = 9320.87;

        System.out.println("Nome do funcionario: " +Funcionario.nome);
        System.out.println("Sobrenome do funcionario: " +Funcionario.sobrenome);
        System.out.println("Cargo do funcionario: " +Funcionario.cargo);
        System.out.println("Salario do funcionario: " +Funcionario.salario);



    }
}
