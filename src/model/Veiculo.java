package model;

public sealed class Veiculo permits Automovel, Caminhao, Moto{
    private String placa;
    private String CRLV;
    private int eixos;
    private String modelo;
    private String cor;

    public Veiculo(){}
    public Veiculo(String placa, String CRLV, int eixos, String modelo, String cor) {
        this.placa = placa;
        this.CRLV = CRLV;
        this.eixos = eixos;
        this.modelo = modelo;
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", CRLV=" + CRLV + ", eixos=" + eixos + ", modelo=" + modelo + ", cor=" + cor
                + "]";
    }
    
}
