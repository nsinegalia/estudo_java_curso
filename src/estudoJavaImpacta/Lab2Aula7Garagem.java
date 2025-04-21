package estudoJavaImpacta;

public class Lab2Aula7Garagem {

     Lab2Aula7Carro carroPasseio = new Lab2Aula7Carro();
     Lab2Aula7Carro carroEvento = new Lab2Aula7Carro();

    public static void main (String [] args){

        Lab2Aula7Garagem g = new Lab2Aula7Garagem();

        g.carroPasseio.modelo = "Volkswagen Fox";
        g.carroPasseio.potencia = "120cv";
        g.carroPasseio.cor = "Prata";

        g.carroEvento.modelo = "Volkswagen Golf";
        g.carroEvento.potencia = "125cv";
        g.carroEvento.cor = "Bege";


        System.out.println("Informações Carro de Passeio: \n" + g.carroPasseio.modelo + "\n" + g.carroPasseio.potencia + "\n" + g.carroPasseio.cor);
        System.out.println("Informações Carro de Evento: \n" + g.carroEvento.modelo + "\n" + g.carroEvento.potencia + "\n" + g.carroEvento.cor);
    }




}


