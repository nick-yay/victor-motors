package repository;

import java.util.ArrayList;
import java.util.List;

import model.Motorista;
import model.Veiculo;

public class VeiculoRepository {
    private static List<Veiculo> repVeiculos = new ArrayList<Veiculo>();

    public static void saveMotorista(Veiculo v){
        repVeiculos.add(v);
    }

    public static void saveMotorista(ArrayList<Veiculo> v) {
        v.forEach(ve -> repVeiculos.add(ve));
    }
}
