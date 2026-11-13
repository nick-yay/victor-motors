package model;

/**
 * Multa
 */
public final class Multa {
    private Veiculo veiculo;
    private Motorista motorista;
    private int AIT;
    private String descricao;
    private GravidadeM gravidadeM;
    private int pontucao;
    private double valorF;
    private int multiplicador;
    
    public Multa(){}
    public Multa(Veiculo veiculo, Motorista motorista, int AIT, String descricao, GravidadeM gravidadeM, int multiplicador) {
        this.veiculo=veiculo;
        this.motorista=motorista;
        this.AIT= AIT;
        this.descricao = descricao;
        this.gravidadeM = gravidadeM;
        this.multiplicador = multiplicador;
        pontucao=gravidadeM.getPontuacao();
        this.valorF = gravidadeM.getValor()*multiplicador;
    }
}
