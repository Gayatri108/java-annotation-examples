package com.core.single.member.annotation;

import java.lang.reflect.Method;

import com.core.single.member.annotation.SingleMemberAnnotation.MyAnnotation;

public class SingleMemeberAnnotationMain {
	@MyAnnotation("google.com")
	public void myAnnotationTestMethod() {

		try {
			Class<? extends SingleMemeberAnnotationMain> cls = this.getClass();
			Method mth = cls.getMethod("myAnnotationTestMethod");
			MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);

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

		SingleMemeberAnnotationMain main = new SingleMemeberAnnotationMain();
		System.out.println(main);
		main.myAnnotationTestMethod();
	}

}
