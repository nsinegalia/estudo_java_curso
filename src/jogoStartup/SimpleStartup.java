package jogoStartup;

public class SimpleStartup {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {

        locationCells = locs;

    }

    public String checkYourself(int guess) { // metodo

        String result = "miss"; // Cria uma variavel para armazenar o resultado que retornaremos. Insere "miss" como padrão. (Ou seja, presume que havera erro).

        for (int cell : locationCells) { // Repete isso com cada célula no array locationCells (Cada local de célula do objeto).

            if (guess == cell) { // Compara o palpite do usuário com este elemento(célula) no array

                result = "hit";
                numOfHits++; // Temos um acerto

                break; // Sai do loop, não há necessidade de testar as outras células.
            }


        }

        if (numOfHits == locationCells.length) {

            result = "kill"; // Estamos fora do loop, mas vamos ver se agora estamos 'mortos' (acertar 3x) e mudar o resultado String para "Kill"
        }

        System.out.println(result); // Exibe o resultado para o usuário ("miss", a menos que tenha sido alterado para "hit" ou "kill")

        return result; // Retorna o resultado para o metodo de chamada.

    }


}
