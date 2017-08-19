package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.anno.RequestMapping;

public class Container {

	public void processReq(String url) {
		// ...
		try {
			Class clazz = Class.forName("com.component.ComponentA");
			Object ins = clazz.newInstance();

			// Reflection API
			Method[] methods = clazz.getMethods();

			for (Method method : methods) {

				RequestMapping rm = method.getAnnotation(RequestMapping.class);

				if (rm != null) {
					if (url.equals(rm.url())) {
						method.invoke(ins, null);
					}
				}

			}

		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException| InstantiationException e) {
			e.printStackTrace();
		}
		// ...

	}

}
