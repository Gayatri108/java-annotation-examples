package com.core.default_value.custom.annotation;

import java.lang.reflect.Method;

import com.core.default_value.custom.annotation.AnnotationDefaultValues.MyAnnot;

public class AnnotationDefaultValuesMain {
	@MyAnnot()
	public void myAnnotationTestMethod() {

		try {
			Class<? extends AnnotationDefaultValuesMain> cls = this.getClass();
			Method mth = cls.getMethod("myAnnotationTestMethod");
			MyAnnot myAnno = mth.getAnnotation(MyAnnot.class);
			System.out.println("key: " + myAnno.key());
			System.out.println("value: " + myAnno.value());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String a[]) {

		AnnotationDefaultValuesMain mat = new AnnotationDefaultValuesMain();
		mat.myAnnotationTestMethod();
	}

}
