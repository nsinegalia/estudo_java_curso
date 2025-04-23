package estudoJavaImpacta;

public class Lab1Aula10RG {

    private int numero;
    private String dataNasci;

    public String getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }

    public int getNumero(){
        return numero;

    }

    public void setNumero(int numero){
        this.numero = numero;
    }


    public Lab1Aula10RG (int numero, String dataNasci){

        this.numero = numero;
        this.dataNasci = dataNasci;

    }
}
