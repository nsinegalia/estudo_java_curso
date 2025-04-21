package leetcodeExercicios;

public class Mix4 {
    int counter = 0;


    public static void main(String[] args) {
        int count = 0;
        Mix4[] mixes = new Mix4[20];  // Array de 20 posições (nenhuma instância foi criada ainda)
        int i = 0;
        while (i < 9) {   // Esse loop percorre os índices de 0 a 8 (9 iterações), criando e armazenando instâncias de leetcodeExercicios.Mix4 nas posições correspondentes do array mixes. Em cada iteração:
            mixes[i] = new Mix4();  // Criando uma nova instância de leetcodeExercicios.Mix4 na posição i
            mixes[i].counter = mixes[i].counter + 1; // Incrementando o counter dessa instância específica
            count = count + 1;  // Incrementando count (para cada nova instância criada)
            count = count + mixes[i].maybeNew(i); // Chamando maybeNew e somando o retorno a count
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);

    }

    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
