package com.xwt.state;
/**
 * 
 * @author xwt
 * ����״̬ģʽ
 *
 */
public class TestState {
	 public static void main(String[] args) {  
         
	        State state = new State();  
	        Context context = new Context(state);  
	          
	        //���õ�һ��״̬  
	        state.setValue("state1");  
	        context.method();  
	          
	        //���õڶ���״̬  
	        state.setValue("state2");  
	        context.method();  
	    }  

}
