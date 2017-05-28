package com.core.annotation.runtime;

/*A retention policy determines at what point annotation should be discarded.

 Java defined 3 types of retention policies through java.lang.annotation.
 RetentionPolicy enumeration. It has SOURCE, CLASS and RUNTIME.
 Example shows how to query an annotation values during runtime using java reflection.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class GetAnnotationAtRuntime {
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotation {
		String key();

		String value();

	}

}
