package com.practice.yogi.syaputra.java.spring.base.framework.json;

import lombok.Data;

@Data
public class Warning {
    private String code;
    private String title;
    private String detail;
    private Source source;
}
