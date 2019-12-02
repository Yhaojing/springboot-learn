package com.haojing.springboot.time.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author haoj
 * @date 2019/12/2
 */
public class LocalDateTimeConverter extends JsonSerializer<LocalDateTime> {
    @Override
    public void serialize(LocalDateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(dateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }
}
