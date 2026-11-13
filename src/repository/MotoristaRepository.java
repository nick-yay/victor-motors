package repository;

import java.util.ArrayList;
import java.util.List;
import model.Motorista;
import service.DocService;

public class MotoristaRepository {
    private final static List<Motorista> repMotoristas = new ArrayList<>();

    public static void saveMotorista(Motorista m){
        repMotoristas.add(m);
    }

    public static void saveMotorista(List<Motorista> m) {
        m.forEach(mt -> repMotoristas.add(mt));
    }

    public static Motorista findByCPF(){
        String cpf = DocService.formatarCPF();
        for (Motorista m : repMotoristas){
            if(m.getCPF().equals(cpf)){
                return m;
            }
        }
        System.out.println("Motorista não encontrado");
        return null;
    }
    
    public static void allMotoristas(){
        repMotoristas.forEach(m -> System.out.println(m));
    }
}
