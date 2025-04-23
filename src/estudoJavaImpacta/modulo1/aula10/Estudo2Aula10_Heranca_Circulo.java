package estudoJavaImpacta.modulo1.aula10;

public class Estudo2Aula10_Heranca_Circulo extends Estudo2Aula10_Heranca_FiguraGeometrica {

    private double raio;

    public Estudo2Aula10_Heranca_Circulo (double raio){

        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {

        return raio * raio * Math.PI;

    }

}
