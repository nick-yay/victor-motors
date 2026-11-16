package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class AbstractRepository <T> {
    protected List<T> r = new ArrayList<>();
    
    public void save(T o){
        r.add(o);
    }
    public void save(List<T> l){
        r.addAll(l);
    }
    public List<T> findAll(){
        return r;
    }
    public void showAll(){
        r.forEach(o -> System.out.println(o));
    }
    public T findBy(Predicate<T> condicao){
        return r.stream()
        .filter(condicao)
        .findFirst()
        .orElse(null);
    }

}
