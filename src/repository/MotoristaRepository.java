package repository;

import model.Motorista;
import model.Multa;

public class MotoristaRepository extends AbstractRepository<Motorista>{
    public Motorista findByCPF(String cpf){
        return findBy(m -> m.getCPF().equals(cpf));
    }
    public void removeByCPF(String cpf){
        remove(findByCPF(cpf));
    }
    
    public void addMulta(String cpf, Multa multa){
        Motorista m = findByCPF(cpf);
        m.addMulta(multa);
        update(findByCPF(cpf), m);
    }
}
