package com.strategydesignpattern.helper;

import java.io.InputStream;
import java.util.Properties;

public class ObjectFactory {
	public static Object createObject(String logicalClassName) throws Exception {
		Properties props = null;
		InputStream in = null;
		Class<?> clazz = null;
		Object obj = null;
		String fullyQualifiedClassName;

		props = new Properties();
		in = ObjectFactory.class.getClassLoader()
				.getResourceAsStream("com/strategydesignpattern/common/appClasses.properties");

		if (!props.containsKey(logicalClassName)) {
			throw new Exception(
					"FullyQualifiedClassName is not found for given Logical Class Name " + logicalClassName);
		}

		fullyQualifiedClassName = props.getProperty(logicalClassName);
		clazz = Class.forName(fullyQualifiedClassName);

		obj = clazz.newInstance();

		return obj;
	}
}
