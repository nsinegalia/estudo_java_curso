package estudoJavaImpacta.modulo1.aula10;

public class Lab1Aula10Teste {


        public static void main(String[] args) {
            Lab1Aula10Pessoa aluno1 = new Lab1Aula10Aluno("João", 20, 'M', 123456, "15/04/2005", 850.00f, "Engenharia");
            Lab1Aula10Pessoa aluno2 = new Lab1Aula10Aluno("Maria", 22, 'F', 654321, "10/08/2003", 920.00f, "Direito");
            Lab1Aula10Pessoa professor = new Lab1Aula10Professor("Carlos", 45, 'M', 789456, "01/02/1980", 5500.00f, "Matemática");

            aluno1.falar("Estou estudando para a prova!");
            aluno2.falar("Amo meu curso!");
            professor.falar("Hoje teremos aula de trigonometria.");

            System.out.println();
            aluno1.mostrarDados();
            aluno2.mostrarDados();
            professor.mostrarDados();
        }


}
