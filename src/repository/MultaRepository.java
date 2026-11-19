package repository;

import model.Multa;

public class MultaRepository extends AbstractRepository<Multa>{
    public Multa findByAIT(int ait){
        return findBy(m -> m.getAIT() == ait);
    }
    public void removeByAIT(int ait){
        remove(findByAIT(ait));
    }
}
