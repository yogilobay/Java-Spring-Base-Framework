package com.practice.yogi.syaputra.java.spring.base.framework.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BasePagingAndSortingRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T,ID> {

    List<T> findAll();
    Page<T> findAll(Pageable pageable);

}
