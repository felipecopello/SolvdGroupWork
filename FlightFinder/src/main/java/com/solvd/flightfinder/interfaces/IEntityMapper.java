package com.solvd.flightfinder.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IEntityMapper<T> {
    public T getById(long id) throws SQLException;

    public List<T> getAll() throws SQLException;

    public void save(T t) throws SQLException;

    public void update(T t, String[] params) throws SQLException;

    public void delete(T t) throws SQLException;
}