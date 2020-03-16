package loveandpeace.tool;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 字符串转日期
public class StringToDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        if (s == null){
            throw new RuntimeException("你丫没传数据");
        }
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return d.parse(s);
        }catch (Exception e){
            throw new RuntimeException("数据类型转换失败");
        }
    }
}
