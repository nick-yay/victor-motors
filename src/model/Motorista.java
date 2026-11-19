package model;

import java.util.ArrayList;
import java.util.List;

import service.DocService;

public final class Motorista {

    private ArrayList<Multa> multas = new ArrayList<>();
    private String nome;
    private String CPF;
    private String RG;
    private String endereco;
    private Genero genero;
    private String CNH;

    public Motorista() {
    }
    
    public Motorista(String nome, String cPF, String rG, String endereco, Genero genero, String cNH) {
        this.nome = nome;
        CPF = cPF;
        RG = rG;
        this.endereco = endereco;
        this.genero = genero;
        CNH = cNH;
    }

    public Motorista(String nome, String endereco, Genero genero, String cNH) {
        this.nome = nome;
        CPF = DocService.formatarCPF();
        DocService.validarCPF(CPF);
        RG = DocService.formatarRG();
        this.endereco = endereco;
        this.genero = genero;
        CNH = cNH;
    }

    @Override
    public String toString() {
        return "Motorista [multas=" + multas + ", nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", endereco="
                + endereco + ", genero=" + genero + ", CNH=" + CNH + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setCNH(String cNH) {
        CNH = cNH;
    }

    public void addMulta(Multa multa) {
        multas.add(multa);
    }

    public void addMultas(List<Multa> multas) {
        this.multas.addAll(multas);
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getCNH() {
        return CNH;
    }
}
