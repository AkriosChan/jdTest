package com.akrios.util;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateUtil {
	public static String date2String(Date date) {
		return formatDate(date, "yyyy-MM-dd");
	}

	private static String formatDate(Date date, String patternStr) {
		SimpleDateFormat sdf = new SimpleDateFormat(patternStr);
		return sdf.format(date);
	}

}
