package com.xwt.interpreter;
/**
 * 
 * @author xwt
 * Minus是用来计算的实现
 *
 */
public class Minus implements Expression {

	  @Override  
	    public int interpret(Context context) {  
	        return context.getNum1()-context.getNum2();  
	    }  

}
