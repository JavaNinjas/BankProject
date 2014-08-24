package dao;

import java.util.List;

public interface GenericDao<T> {

    void save(T obj);

    List<T> getAll();

    void update(T obj);

    void delete(T obj);
}
