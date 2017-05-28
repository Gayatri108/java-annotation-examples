package com.core.default_value.custom.annotation;

/*We can assign default values to annotation members.
 These values will be return in case if you didn't provide any values to the annotation members.
 We can assign default values by using default clause during members declarations.

 Below example shows how to assign default values to annotation members.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationDefaultValues {
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnot {

		String key() default "Student_Id";

		String value() default "S0001";
	}

}
