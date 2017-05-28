package com.core.custom.annotation;

import java.lang.reflect.Method;

public class CustomAnnotationMain {
	@CustomAnnotation(empName = "John", empAddress = "Delhi, India")
	public void display() {
		System.out.println("Custom Annotation");
	}

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {
		CustomAnnotationMain cae = new CustomAnnotationMain();
		Method m = cae.getClass().getMethod("display");
		CustomAnnotation cAntn = m.getAnnotation(CustomAnnotation.class);
		System.out.println(cAntn.empName());
		System.out.println(cAntn.empAge());
		System.out.println(cAntn.empAddress());
	}

}
