package cn.itcast.core.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			// 把字符串转换为日期类型
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = simpleDateFormat.parse(source);

			return date;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 如果转换异常则返回空
		return null;
	}
}
