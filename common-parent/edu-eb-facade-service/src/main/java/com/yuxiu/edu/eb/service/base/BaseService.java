package com.yuxiu.edu.eb.service.base;

public interface BaseService<T> {

    public T findById(Integer id);
    public T DeleteById(Integer id);
}
