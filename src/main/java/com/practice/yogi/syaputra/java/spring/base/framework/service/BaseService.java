package com.practice.yogi.syaputra.java.spring.base.framework.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<T> {
    T save(T entity);
    Boolean delete(T entity);
    T findById(String id);
//    List<T> findAll();
    Page<T> findAllPage(Pageable pageable);
}
