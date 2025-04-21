package leetcodeExercicios;

public class Ex2LeetCode {
    public static void main(String[] args) {
        ListNode l1 = transformaNumeroEmListNode(9);
        ListNode l2 = transformaNumeroEmListNode(9999999991L);
        long n1;
        long n2;
        n1 = transformaListNodeEmNumero(l1);
        n2 = transformaListNodeEmNumero(l2);
        //int n3 = transformaListNodeEmNumero(l2);

        long res = n1 + n2;
        //List<longeger> resF = transformaNumeroEmLista(res);
        ListNode resF = transformaNumeroEmListNode(res);

        System.out.println(resF);
    }

 /*   public static long transformaArrayEmNumero(longeger[] array) {
        //return 1;

        long i = 0;
        long multiplicador = 1;
        long resultado = 0;

        for (i = 0; i < array.length; i++) {
            resultado = resultado + array[i] * multiplicador;
            multiplicador = multiplicador * 10;
        }

        return resultado;
    } */

    public static long transformaListNodeEmNumero(ListNode inicioLista) {

        long i = 0;
        long multiplicador = 1;
        long resultado = 0;
        //leetcodeExercicios.ListNode inicioLista = null;

        while (inicioLista != null) {
            resultado = resultado + inicioLista.val * multiplicador;
            multiplicador = multiplicador * 10;
            inicioLista = inicioLista.next;

        }

        return resultado;

    }


/*
    public static List<longeger> transformaNumeroEmLista(long numero){
        List <longeger> listaDeNumeros = new ArrayList<>();

        //listaDeNumeros.add(7);
        //listaDeNumeros.add(0);
        //listaDeNumeros.add(8);

        long aux1;

        while (numero != 0){
            aux1 = numero / 10;
            aux1 = aux1 * 10;
            listaDeNumeros.add(numero - aux1);
            numero = numero / 10;
        }

        return listaDeNumeros;

    } */

    public static ListNode transformaNumeroEmListNode(long numero) {
        ListNode inicioLista = null;

        int aux1;

        do {
            aux1 = (int)numero / 10;
            aux1 = aux1 * 10;

            if (inicioLista == null) {
                inicioLista = new ListNode((int)numero - aux1);

            } else {
                encontrarFinalLista(inicioLista).next = new ListNode((int)numero - aux1);
            }

            numero = numero / 10;
        } while (numero != 0);


        return inicioLista;

    }

    public static ListNode encontrarFinalLista(ListNode inicioLista) {

        while (inicioLista.next != null) {
            inicioLista = inicioLista.next;

        }

       /* for (;inicioLista.next != null; inicioLista = inicioLista.next){

        } */

        return inicioLista;
    }


}
