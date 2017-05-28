package com.core.override.antn;

/*This example shows the use of @override annotation.
 @Override annotation is used when we override a method in sub class.
 it is not mandatory to use this annotation while overriding the method.But its a good programming 
 practice to use it because of the following  advantages:

 1.If programmer makes any mistake such as wrong method name, wrong parameter types 
 while overriding, you would get a compile time error.
 As by using this annotation you instruct compiler that you are overriding this method.
 If you don’t use the annotation then the sub class method would behave as a new method (not the overriding method) in sub class.

 2.It improves the readability of the code.
 */
public class Ford extends Car {
	@Override
	public int speedLimit() {
		return 200;
	}

}
