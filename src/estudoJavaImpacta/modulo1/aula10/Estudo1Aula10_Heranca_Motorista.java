package estudoJavaImpacta.modulo1.aula10;

public class Estudo1Aula10_Heranca_Motorista extends Estudo1Aula10_Heranca_Funcionario {

    private String cnh;
    private String placaAutomovel;

    public Estudo1Aula10_Heranca_Motorista (int mat, String nm, double sal, String cnh, String placa) {

        super(mat, nm, sal);
        this.cnh = cnh;
        this.placaAutomovel = placa;

    }


    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaAutomovel() {
        return placaAutomovel;
    }

    public void setPlacaAutomovel(String placaAutomovel) {
        this.placaAutomovel = placaAutomovel;
    }



}
