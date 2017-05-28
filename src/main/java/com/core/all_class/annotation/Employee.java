package com.core.all_class.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Employee {
	@Retention(RetentionPolicy.RUNTIME)
	@interface Emp{
	     
	    String empId();
	    String empName();
	}

}
