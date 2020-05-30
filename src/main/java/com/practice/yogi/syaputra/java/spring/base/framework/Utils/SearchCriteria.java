package com.practice.yogi.syaputra.java.spring.base.framework.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author yogisyaputra <yogi.syaputra@myindo.co.id>
 * @Since 3/6/19
 * @Time 11:39 AM
 * @Encoding UTF-8
 * @Project myindo-platform
 * @Package
 */
@Data
@AllArgsConstructor
public class SearchCriteria {
    private String key;
    private String operation;
    private Object value;

}
