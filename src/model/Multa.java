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
        if (gravidadeM.equals(GravidadeM.GRAVISSIMA)) {
            valorF = gravidadeM.getValor()*multiplicador;
        }
        valorF=gravidadeM.getValor();
    }
    public Multa(Veiculo veiculo, Motorista motorista, int aIT, String descricao, GravidadeM gravidadeM) {
        this.veiculo=veiculo;
        this.motorista=motorista;
        this.AIT= aIT;
        this.descricao = descricao;
        this.gravidadeM = gravidadeM;
        pontucao=gravidadeM.getPontuacao();
        valorF=gravidadeM.getValor();
    }
    
    @Override
    public String toString() {
        return "Multa [veiculo=" + veiculo + ", motorista=" + motorista + ", AIT=" + AIT + ", descricao=" + descricao
                + ", gravidadeM=" + gravidadeM + ", pontucao=" + pontucao + ", valorF=" + valorF + ", multiplicador="
                + multiplicador + "]";
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public int getAIT() {
        return AIT;
    }
    public void setAIT(int aIT) {
        AIT = aIT;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public GravidadeM getGravidadeM() {
        return gravidadeM;
    }
    public void setGravidadeM(GravidadeM gravidadeM) {
        this.gravidadeM = gravidadeM;
    }
    public int getPontucao() {
        return pontucao;
    }
    public void setPontucao(int pontucao) {
        this.pontucao = pontucao;
    }
    public double getValorF() {
        return valorF;
    }
    public void setValorF(double valorF) {
        this.valorF = valorF;
    }
    public int getMultiplicador() {
        return multiplicador;
    }
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
}
