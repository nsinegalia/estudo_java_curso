package estudoJavaImpacta.modulo1.aula11;

public class Lab1Teste {
    public static void main(String[] args) {

        Lab1Imprimivel relatorio = new Lab1Relatorio();
        Lab1Imprimivel grafico = new Lab1Grafico();

        grafico.imprimir();
        relatorio.imprimir();


    }
}
