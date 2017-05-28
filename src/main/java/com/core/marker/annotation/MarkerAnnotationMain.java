package com.core.marker.annotation;

import java.lang.reflect.Method;

import com.core.marker.annotation.MarkerAnnotation.MyMarkerAnnot;

public class MarkerAnnotationMain {
	@MyMarkerAnnot
	public void myAnnotationTest() {
		Class<? extends MarkerAnnotationMain> cls = this.getClass();
		try {
			Method m = cls.getMethod("myAnnotationTest");
			
			//isAnnotationPresent method is used to check whether marker annotation is available or not. 
			if (m.isAnnotationPresent(MyMarkerAnnot.class)) {
				System.out.println("Marker annoation is present");
			} else {
				System.out.println("Marker annoation is  not present");
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MarkerAnnotationMain mam = new MarkerAnnotationMain();
		mam.myAnnotationTest();
	}

}
