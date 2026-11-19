package model;

import java.util.ArrayList;
import java.util.List;

public sealed class Veiculo permits Automovel, Caminhao, Moto{
    private String placa;
    private String CRV;
    private int eixos;
    private String modelo;
    private String cor;
    private Motorista motorista;
    private List<Multa> multas = new ArrayList<>();

    public Veiculo(){}
    public Veiculo(String placa, String CRV, int eixos, String modelo, String cor) {
        this.placa = placa;
        this.CRV = CRV;
        this.eixos = eixos;
        this.modelo = modelo;
        this.cor = cor;
    }
    public Veiculo(String placa, String CRV, int eixos, String modelo, String cor, Motorista motorista) {
        this.placa = placa;
        this.CRV = CRV;
        this.eixos = eixos;
        this.modelo = modelo;
        this.cor = cor;
        this.motorista = motorista;
    }
    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", CRV=" + CRV + ", eixos=" + eixos + ", modelo=" + modelo + ", cor=" + cor
                + "]";
    }
    
    public String getPlaca() {
        return placa;
    }
    public String getCRV() {
        return CRV;
    }
    public int getEixos() {
        return eixos;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setCRV(String cRV) {
        CRV = cRV;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public List<Multa> getMultas() {
        return multas;
    }
    public void addMulta(Multa multa) {
        multas.add(multa);
    }
    
    
}
