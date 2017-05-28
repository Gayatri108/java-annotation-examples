package com.core.suppresswarning.antn;

/*In case if you don't want to get any warnings from compiler for the known things,
 *  then you can use @SuppressWarnings annotation. 
 * For example, we are calling deprecated method(showDeprecatedMessage),
 * and you know that it is deprecated, to avoid compiler warnings,
 *  we can use @SuppressWarnings annotation. 
 */
public class SuppressWarningAntnExample {
	@Deprecated
	public void showDeprecatedMessage() {
		System.out.println("This method is marked as deprecated");
	}

	@SuppressWarnings("deprecation")
	void myMethod() {
		showDeprecatedMessage();
	}

	public static void main(String a[]) {

		SuppressWarningAntnExample swe = new SuppressWarningAntnExample();
		swe.myMethod();

	}
}
