package com.core.all_class.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Department {
	@Retention(RetentionPolicy.RUNTIME)
	@interface Dept{
	     
	    String deptName();
	}
	

}
