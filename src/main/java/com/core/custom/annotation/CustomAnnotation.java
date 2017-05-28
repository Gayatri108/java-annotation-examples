package com.core.custom.annotation;

/*This example shows how to create our own custom annotation.
 Annotations are created by using @interface, followed by annotation name.
 An annotation can have elements as well.
 They look like methods. For example in the below code, we have three elements. 
 We should not provide implementation for these elements.
 All annotations extends java.lang.annotation.Annotation interface. 
 Annotations cannot include any extends clause.*/

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Documented annotation indicates that elements using this annotation should be documented by JavaDoc.
@Documented
/*
 * It specifies where we can use the annotation.As we specified here as
 * METHOD,its only applicable to method.If don't define Target type,it can be
 * applicable to any element
 */
@Target(ElementType.METHOD)
// The @Inherited annotation indicates custom annotation used in a class
// should be inherited by all of its sub classes
@Inherited
// It indicates how long annotations with the annotated type are to be retained.
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
	int empAge() default 27;

	String empName();

	String empAddress();

}
