package estudoJavaImpacta.modulo1.aula5;

public class Lab3Aula5 {
    public static void main(String[] args) {

        for (int ano = 1930; ano <= 2025; ano += 4) {

            if (ano == 1942 || ano == 1946) {
                continue;
            }

            System.out.println("Copa do mundo em: " + ano);

        }

    }

}
