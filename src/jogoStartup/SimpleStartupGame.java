/*package jogoStartup;

import java.util.ArrayList;

public class SimpleStartupGame {
    public static void main(String[] args) {

        int numOfGuesses = 0; // Variavel para rastrear quantos palpites o usuário fará.

        GameHelper helper = new GameHelper(); // Classe especial que tem o metodo para obter a entrada do usuario. Não escrevemos ainda, mas finge que faz parte do Java.

        SimpleStartup theStartup = new SimpleStartup(); // Cria o objeto Startup

        //Startup theStartup = new Startup();

        int randomNum = (int) (Math.random() * 5); // Cria um numero aleatorio para a primeira celula.
            // 1-(o (int) é um cast, que força o Math.random a vir como int, já que por padrão vem como double..
            // 2- O metodo Math.random retorna um numero zero e menor que 1. Colocando o 5* e utilizando o Cast, fará com que retorne um numero de 0 à 4. (ou seja, 0 à 4.999, convertido em um int que ficara 4)

        int[] locations = {randomNum, randomNum + 1, randomNum + 2}; // usa o numero aleatorio para criar o array das celulas locais.
        //ArrayList<String> locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations); // Fornece a Startup seus locais (o array)

        boolean isAlive = true; // Cria uma variavel booleana para verificar se o jogo ainda esta ativo, para usar no teste loop while. Repete enquanto o jogo estiver ativo.

        while (isAlive) {

            int guess = helper.getUserInput ("enter a number"); // Obtem o palpite do usuario.

            String result = theStartup.checkYourself(guess); // Solicita a Startup para verificar o palpite; Salva o resultado retornado.

            numOfGuesses++; // Incremente a contagem de palpites.

            if(result.equals("kill")){ // Foi kill ? Se sim, define isAlive como falso (para que nao entremos novamente no loop) e printa a contagem de palpites do usuario.

                isAlive = false;

                System.out.println ("You took " + numOfGuesses + " guesses");
            }

        }




    }
}
*/

package jogoStartup;

import java.util.ArrayList;
import java.util.Random;


public class SimpleStartupGame {
    public static void main(String[] args) {

        int numOfGuesses = 0; // Variavel para rastrear quantos palpites o usuário fará.

        GameHelper helper = new GameHelper(); // Classe especial que tem o metodo para obter a entrada do usuario. Não escrevemos ainda, mas finge que faz parte do Java.

        Startup theStartup = new Startup();

        Random random = new Random();
        int randomNum = random.nextInt(5); // Cria um numero aleatorio para a primeira celula.

        ArrayList<String> locations = new ArrayList<>();


        locations.add("A" + randomNum);
        locations.add("A" + (randomNum + 1));
        locations.add("A" + (randomNum + 2));

        theStartup.setLocationCells(locations); // Fornece a Startup seus locais (o array)

        boolean isAlive = true; // Cria uma variavel booleana para verificar se o jogo ainda esta ativo, para usar no teste loop while. Repete enquanto o jogo estiver ativo.

        while (isAlive) {

            int guess = helper.getUserInput("enter a number"); // Obtem o palpite do usuario.

            String result = theStartup.checkYourself("A" + guess); // Solicita a Startup para verificar o palpite; Salva o resultado retornado.

            numOfGuesses++; // Incremente a contagem de palpites.

            if (result.equalsIgnoreCase("kill")) { // Foi kill ? Se sim, define isAlive como falso (para que nao entremos novamente no loop) e printa a contagem de palpites do usuario.

                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }


    }
}


