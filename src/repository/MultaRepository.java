package repository;

import java.util.ArrayList;
import java.util.List;

import model.Motorista;
import model.Multa;

public class MultaRepository {
    private static List<Multa> repMultas = new ArrayList<Multa>();

    public static void saveMotorista(Multa m){
        repMultas.add(m);
    }

    public static void saveMotorista(ArrayList<Multa> m) {
        m.forEach(mt -> repMultas.add(mt));
    }
}
