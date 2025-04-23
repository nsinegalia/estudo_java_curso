package estudoJavaImpacta.modulo1.aula8;

public class Lab1Aula8TesteCadastro {
    public static void main (String [] args){

        Lab1Aula8Cadastro padrao1 = new Lab1Aula8Cadastro();
        padrao1.mostrar();

        Lab1Aula8Cadastro padrao2 = new Lab1Aula8Cadastro("Nicolas","Sinegalia");
        padrao2.mostrar();

        Lab1Aula8Cadastro padrao3 = new Lab1Aula8Cadastro("Ingrid","Pierre",25);
        padrao3.mostrar();


    }
}
