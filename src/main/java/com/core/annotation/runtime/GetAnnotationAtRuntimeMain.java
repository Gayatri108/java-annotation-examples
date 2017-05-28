package com.core.annotation.runtime;


import java.lang.reflect.Method;

import com.core.annotation.runtime.GetAnnotationAtRuntime.MyAnnotation;

public class GetAnnotationAtRuntimeMain {
	@MyAnnotation(key = "Web Site", value = "www.youtube.com")
	public void myAnnotationTest() {

		try {
			Class<? extends GetAnnotationAtRuntimeMain> cls = this.getClass();
			Method mth = cls.getMethod("myAnnotationTest");
			MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
			System.out.println("key: " + myAnno.key());
			System.out.println("value: " + myAnno.value());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		GetAnnotationAtRuntimeMain main = new GetAnnotationAtRuntimeMain();
		main.myAnnotationTest();

	}

}
