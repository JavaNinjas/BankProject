package dao;

import java.util.List;

public interface GenericDao<T> {

    public void create(T obj);

    public List<T> read();

    public void update(T obj);

    public void delete(T obj);

}
