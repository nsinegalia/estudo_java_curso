package jogoStartup;


import java.util.ArrayList;

public class Startup {

    private ArrayList<String> locationCells; // Alteramos o array int para um ArrayList que armazena Strings.

    public void setLocationCells(ArrayList<String> locs) { // Alteramos o array int para um ArrayList que armazena Strings.

        locationCells = locs;

    }

    public String checkYourself(String userInput) { // Agora é uma String, precisa aceitar um valor como "A3"

        String result = "miss";
        int index = locationCells.indexOf(userInput); //Verifica se o palpite do usuário está no ArrayList, solicitando seu índice... Se não estiver na lista, indexOf() retorna -1.

        if (index >= 0){ // Se o índice for maior ou igual a zero, o palpite do usuário está definitivamente na lista, então é removido.
            locationCells.remove(index);

            if (locationCells.isEmpty()){ // Se a lista estiver vazia, foi dado o golpe de misericórdia!
                result = "Kill";
            }else {
                result = "Hit";
            }

        }
        System.out.println(result);
        return result;


    }


}

