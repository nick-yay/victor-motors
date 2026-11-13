package model;

/**
 * GravidadeM
 */
public enum GravidadeM {
    BAIXA(3, 88.38), MEDIA(4, 130.16), 
    GRAVE(5, 195.23), GRAVISSIMA(7, 293.47);

    
    private int pontuacao;
    private double valor;

    GravidadeM(int pontucao, double valor){
        this.pontuacao=pontucao;
        this.valor=valor;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public double getValor() {
        return valor;
    }
}
