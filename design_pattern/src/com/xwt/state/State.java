package com.xwt.state;
/**
 * 
 * @author xwt
 * 状态模式:当对象的状态改变时，同时改变其行为
 * State类是个状态类
 */
public class State {
	 private String value;  
     
	    public String getValue() {  
	        return value;  
	    }  
	  
	    public void setValue(String value) {  
	        this.value = value;  
	    }  
	  
	    public void method1(){  
	        System.out.println("execute the first opt!");  
	    }  
	      
	    public void method2(){  
	        System.out.println("execute the second opt!");  
	    }  

}
