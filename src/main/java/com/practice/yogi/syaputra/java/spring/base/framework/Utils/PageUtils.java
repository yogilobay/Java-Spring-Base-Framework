package com.practice.yogi.syaputra.java.spring.base.framework.Utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageUtils {

    public Pageable pagingAndSorting(String orderBy, String direction, int page, int size){
        Sort sort = null;
        if (direction.trim().isEmpty() || direction.equalsIgnoreCase("ASC")) {
            sort = new Sort(new Sort.Order(Sort.Direction.ASC, orderBy));
        }else {
            sort = new Sort(new Sort.Order(Sort.Direction.DESC, orderBy));
        }
        Pageable pageable = new PageRequest(page, size, sort);

        return pageable;
    }

}
