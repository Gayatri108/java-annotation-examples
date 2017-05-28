package com.core.marker.annotation;

//Marker Annotation doesn't contain any member.

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MarkerAnnotation {
	@Retention(RetentionPolicy.RUNTIME)
	@interface MyMarkerAnnot {
	}

}
