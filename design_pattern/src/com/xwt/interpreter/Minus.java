package com.xwt.interpreter;
/**
 * 
 * @author xwt
 * Minus�����������ʵ��
 *
 */
public class Minus implements Expression {

	  @Override  
	    public int interpret(Context context) {  
	        return context.getNum1()-context.getNum2();  
	    }  

}
