package com.practice.yogi.syaputra.java.spring.base.framework.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseCrudRepository<T, ID extends Serializable> extends CrudRepository<T,ID> {

    <S extends T> S save(S entity);
    List<T> findAll();
    Page<T> findAll(Pageable pageable);

}
