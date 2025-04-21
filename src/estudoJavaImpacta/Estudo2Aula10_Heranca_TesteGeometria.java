package estudoJavaImpacta;

public class Estudo2Aula10_Heranca_TesteGeometria {
    public static void main (String [] args){

        Estudo2Aula10_Heranca_FiguraGeometrica figuraGeometrica = new Estudo2Aula10_Heranca_Quadrado(4);
        System.out.println("A area do Quadrado é: " + figuraGeometrica.getArea());

        figuraGeometrica = new Estudo2Aula10_Heranca_Circulo(2);
        System.out.println("A area do Circulo é: " + figuraGeometrica.getArea());

        figuraGeometrica = new Estudo2Aula10_Heranca_Triangulo(4, 3 );
        System.out.println("A area do Triangulo é: " + figuraGeometrica.getArea());



    }

}
