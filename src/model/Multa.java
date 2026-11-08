package model;

/**
 * Multa
 */
public final class Multa extends Motorista {
    private String descricao;
    private GravidadeM gravidadeM;
    private int[] valores=new int[4];

    public Multa(String nome, String cPF, String rG, String endereco, Genero genero, String cNH, String descricao,
            GravidadeM gravidadeM, int[] valores) {
        super(nome, cPF, rG, endereco, genero, cNH);
        this.descricao = descricao;
        this.gravidadeM = gravidadeM;
        this.valores = valores;
    }
}
