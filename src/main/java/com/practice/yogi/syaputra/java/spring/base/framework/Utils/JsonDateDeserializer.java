package com.practice.yogi.syaputra.java.spring.base.framework.Utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author yogisyaputra <yogi.syaputra@myindo.co.id>
 * @Since 7/2/19
 * @Time 6:22 PM
 * @Encoding UTF-8
 * @Project myindo-platform
 * @Package
 */
public class JsonDateDeserializer extends JsonDeserializer<Date> {

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        if (jp.getCurrentToken().equals(JsonToken.VALUE_STRING)) {
            try {
                Date date = format.parse(jp.getText().toString());
                return date;
            } catch (ParseException e) {
                //e.printStackTrace();
            }
        }
        return null;
    }

}
