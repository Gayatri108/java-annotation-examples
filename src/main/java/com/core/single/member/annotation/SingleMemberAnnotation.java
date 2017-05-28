package com.core.single.member.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Single Member Annotation contains only one member.We can assign only values without specifying name.

public class SingleMemberAnnotation {
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotation {
		String value();
	}

}
