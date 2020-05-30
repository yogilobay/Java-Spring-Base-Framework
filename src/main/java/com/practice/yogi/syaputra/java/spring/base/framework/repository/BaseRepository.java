package com.practice.yogi.syaputra.java.spring.base.framework.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T,ID> {

    T save(T entity);
    T delete(T entity);
    List<T> findAll();
    Page<T> findAll(Pageable pageable);

}
