package by.self.Interface;

import by.self.exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T findById(String id) throws ItemNotFoundException;
    void save(T item);
    void delete(String id) throws ItemNotFoundException;
}
