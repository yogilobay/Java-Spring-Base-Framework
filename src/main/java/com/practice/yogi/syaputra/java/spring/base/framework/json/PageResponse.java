package com.practice.yogi.syaputra.java.spring.base.framework.json;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yogisyaputra <yogi.syaputra@myindo.co.id>
 * @Since 1/29/19
 * @Time 4:07 PM
 * @Encoding UTF-8
 * @Project myindo-platform
 * @Package
 */

@Data
public class PageResponse<T> {
    List<T> content = new ArrayList<>();

    String orderBy;

    String direction;

    Integer page;

    Integer size;
}
