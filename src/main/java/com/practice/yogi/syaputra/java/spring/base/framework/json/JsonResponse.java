package com.practice.yogi.syaputra.java.spring.base.framework.json;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class JsonResponse<T> {

    List<Error> errors = new ArrayList();

    List<Warning> warnings = new ArrayList();

    T data;

    Map<String,?> dictionaries = new HashMap();

}
