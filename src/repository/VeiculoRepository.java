package repository;

import model.Veiculo;

public final class VeiculoRepository extends AbstractRepository<Veiculo>{
    public Veiculo findByCRV(String crv){
        return findBy(v -> v.getCRV().equals(crv));
    } 
    public void removeByCRV(String crv){
        remove(findByCRV(crv));
    }
}
