package repository;

import model.Motorista;

public class MotoristaRepository extends AbstractRepository<Motorista>{
    public Motorista findByCPF(String cpf){
        return findBy(m -> m.getCPF().equals(cpf));
    }
    public void removeByCPF(String cpf){
        remove(findByCPF(cpf));
    }
}
