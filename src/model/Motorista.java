package model;

import java.util.ArrayList;
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

    public Motorista(String nome, String rG, String endereco, Genero genero, String cNH) {
        this.nome = nome;
        CPF = DocService.formatarCPF();
        DocService.validarCPF(CPF);
        RG = DocService.formatarRG();
        this.endereco = endereco;
        this.genero = genero;
        CNH = cNH;
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
