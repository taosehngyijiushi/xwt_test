package com.xwt.template_method;
/**
 * 
 * @author xwt
 *	����ģ�巽��
 */
public class TestTemplateMethod {
	public static void main(String[] args) {  
        String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);  
    }  

}
