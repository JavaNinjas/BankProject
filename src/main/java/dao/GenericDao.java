package dao;

import java.util.List;

public interface GenericDao<T> {

    void create(T obj);

    List<T> getAll();

    void update(T obj);

    void delete(T obj);
}
