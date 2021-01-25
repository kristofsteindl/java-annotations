package com.ksteindl.annotations;

import java.lang.reflect.Field;

public class RegexChecker {
	
	public static boolean check(Object object) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Regex.class)) {
				Regex regexAnnotation = field.getAnnotation(Regex.class);
				String regex = regexAnnotation.value();
				Object fieldValue = field.get(object);
				if (fieldValue instanceof String) {
					String stringValue = (String) fieldValue;
					if (!stringValue.matches(regex)) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
