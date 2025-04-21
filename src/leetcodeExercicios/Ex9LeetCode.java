package leetcodeExercicios;

public class Ex9LeetCode {
    public static void main(String[] args) {
        String a;
        int x = 123321;

        a = String.valueOf(x);

        String y = "";

        //y = y + a.charAt(a.length() - 1); // Estamos pegando a posição 5 que seria a última
        //y = y + a.charAt(4);
        //y = y + a.charAt(3);
        //y = y + a.charAt(2);
        //y = y + a.charAt(1);
        //y = y + a.charAt(0);

        // System.out.println(y);

        for (int i = a.length() - 1; i >= 0; i--) {

            y = y + a.charAt(i);

        }

        // x = x + 1;
        // x += 1;


        //return a == y;
        System.out.println(a.equals(y));

    }


}
