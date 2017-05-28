package com.core.all_class.annotation;
//This example shows how to get all given annotations at runtime.

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.core.all_class.annotation.Department.Dept;
import com.core.all_class.annotation.Employee.Emp;

public class MultipleAnnotationMain {
	@Dept(deptName = "IT")
	@Emp(empId = "E0001", empName = "Nisha")
	public void organizationData() {
		Class<? extends MultipleAnnotationMain> cls = this.getClass();
		try {
			Method m = cls.getMethod("organizationData");
			Annotation[] anns = m.getAnnotations();
			for (Annotation an : anns) {
				System.out.println(an);
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
		MultipleAnnotationMain ma = new MultipleAnnotationMain();
		ma.organizationData();
	}

}
