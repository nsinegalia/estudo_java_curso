package leetcodeExercicios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        final String ee = " cu ";
        System.out.println("\n" + ee.trim());

        int x = 1;

        switch (x) { //
            case 1:
            case 2:
                System.out.println("Mais uma merda");
                //break;
            case 4:
            case 6:
            case 0:
                System.out.println("Qualquer merda");
                break;
            default:
                System.out.println("Outra merda");
                break;
        }


    }
}