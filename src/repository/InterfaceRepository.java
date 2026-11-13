package repository;

import java.util.List;

public interface InterfaceRepository <T> {
    default void save(T o, List<T> r){
        r.add(o);
    }
    default void save(List<T> l, List<T> r){
        l.forEach(li -> r.add(li));
    }
    default void findAll(List<T> r){
        r.forEach(re -> System.out.println(re));
    }
}
