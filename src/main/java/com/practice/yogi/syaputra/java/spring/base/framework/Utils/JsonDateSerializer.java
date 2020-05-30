package com.practice.yogi.syaputra.java.spring.base.framework.Utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author yogisyaputra <yogi.syaputra@myindo.co.id>
 * @Since 7/2/19
 * @Time 6:20 PM
 * @Encoding UTF-8
 * @Project myindo-platform
 * @Package
 */
public class JsonDateSerializer extends JsonSerializer<Date> {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void serialize(final Date date, final JsonGenerator gen, final SerializerProvider provider) throws IOException, JsonProcessingException {

        String dateString = format.format(date);
        gen.writeString(dateString);
    }

}
