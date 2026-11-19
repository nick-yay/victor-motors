package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class AbstractRepository <T> {
    private List<T> r = new ArrayList<>();
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
    protected T findBy(Predicate<T> condicao){
        return r.stream()
        .filter(condicao)
        .findFirst()
        .orElse(null);
    }
    protected void remove(T obj){
        r.remove(obj);
    }
    public void update(T t1, T t2){
        r.set(r.indexOf(t1), t2);
    }
}
