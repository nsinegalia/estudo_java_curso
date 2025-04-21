package jogoStartup;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
/*        SimpleStartup dot = new SimpleStartup(); //Instanciando um objeto jogoStartup.SimpleStartup.

        int[] locations = {2, 3, 4}; // Cria um array int para o local da Startup (3 ints consecutivos de 7 possíveis)
        dot.setLocationCells(locations); // Invoca o metodo setter na startup.

        int userGuess = 2; // Cria um palpite fake do usuário
        String result = dot.checkYourself(userGuess); // Invoca o metodo checkYourSelf() no objeto startup e passe a ele o palpite fake.

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed"; // Se o palpite fake (2) retornar um hit, está funcionando.

        }

        System.out.println(testResult); // Printa o resultado do teste ("passed" ou "failed") */


        testeAcerto();
        testeErro();
    }

    public static void testeAcerto() {
        SimpleStartup dot = new SimpleStartup(); //Instanciando um objeto jogoStartup.SimpleStartup.

        int[] locations = {2, 3, 4}; // Cria um array int para o local da Startup (3 ints consecutivos de 7 possíveis)
        dot.setLocationCells(locations); // Invoca o metodo setter na startup.

        int userGuess = 2; // Cria um palpite fake do usuário
        String result = dot.checkYourself(userGuess); // Invoca o metodo checkYourSelf() no objeto startup e passe a ele o palpite fake.

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed"; // Se o palpite fake (2) retornar um hit, está funcionando.

        }

        System.out.println(testResult); // Printa o resultado do teste ("passed" ou "failed")

    }

    public static void testeErro() {
        SimpleStartup dot = new SimpleStartup(); //Instanciando um objeto jogoStartup.SimpleStartup.

        int[] locations = {1, 3, 4}; // Cria um array int para o local da Startup (3 ints consecutivos de 7 possíveis)
        dot.setLocationCells(locations); // Invoca o metodo setter na startup.

        int userGuess = 2; // Cria um palpite fake do usuário
        String result = dot.checkYourself(userGuess); // Invoca o metodo checkYourSelf() no objeto startup e passe a ele o palpite fake.

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed"; // Se o palpite fake (2) retornar um hit, está funcionando.

        }

        System.out.println(testResult); // Printa o resultado do teste ("passed" ou "failed")

    }

}
