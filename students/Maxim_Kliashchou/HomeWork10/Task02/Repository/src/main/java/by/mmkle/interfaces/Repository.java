package by.mmkle.interfaces;

import by.mmkle.exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T findById(String id) throws ItemNotFoundException;
    void save(T item);
    void delete(String id) throws ItemNotFoundException;
}
