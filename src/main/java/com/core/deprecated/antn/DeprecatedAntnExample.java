package com.core.deprecated.antn;
/*The @Deprecated annotation used to inform the compiler to generate a warning 
 * whenever a program uses a method, class, or field with the @Deprecated annotation.
 *  It is good to document the reason with Javadoc @deprecated tag. 
 * @deprecated is for documentation purpose. 
*/
public class DeprecatedAntnExample {
	
	 /** @deprecated This field is replaced by 
	    * MAX_NUM field
	    */
	   @Deprecated
	   int num=10;
		
	   final int MAX_NUM=10;
	/**
     * @deprecated
     * reason for why it was deprecated
     */
    @Deprecated
    public void showDeprecatedMessage(){
        System.out.println("This method is marked as deprecated");
    }
     
    public static void main(String a[]){
         
        DeprecatedAntnExample deprecate= new DeprecatedAntnExample();
        deprecate.showDeprecatedMessage();
        System.out.println(deprecate.num);
    }

	

}
