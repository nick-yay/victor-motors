package model;

public sealed class Motorista permits Multa{
    private String nome;
    private String CPF;
    private String RG;
    private String endereco;
    private Genero genero;
    private String CNH;
    
    public Motorista(String nome, String cPF, String rG, String endereco, Genero genero, String cNH) {
        this.nome = nome;
        CPF = cPF;
        RG = rG;
        this.endereco = endereco;
        this.genero = genero;
        CNH = cNH;
    }
    
}
