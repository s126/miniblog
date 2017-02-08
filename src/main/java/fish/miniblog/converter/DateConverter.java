package fish.miniblog.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        // 1990-02-08
        return null;
    }
}
