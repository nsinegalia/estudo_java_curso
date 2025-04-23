package estudoJavaImpacta.modulo1.aula5;

public class Lab2Aula5 {
    public static void main(String[] args) {

        String nomeMes = "Cu";

        verificaMes(nomeMes);


    }

    public static void verificaMes(String nomeMes) {


        switch (nomeMes) {
            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println("O mês escolhido tem 31 dias");
                break;
            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println("O mês escolhido tem 30 dias");
                break;
            case "Fevereiro":
                System.out.println("O mês escolhido tem 28 ou 29 dias");
                break;
            default:
                System.out.println("Mês inválido");
        }

    }

}

