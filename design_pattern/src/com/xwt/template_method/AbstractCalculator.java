package com.xwt.template_method;
/**
 * 
 * @author ģ�巽��
 *ģ�巽��ģʽ������ָ��һ���������У���һ����������
 *�ٶ���1...n�������������ǳ���ģ�Ҳ������ʵ�ʵķ�����
 *����һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬
 *ʵ�ֶ�����ĵ���
 */
public abstract class AbstractCalculator {
	 /*��������ʵ�ֶԱ������������ĵ���*/  
    public final int calculate(String exp,String opt){  
        int array[] = split(exp,opt);  
        return calculate(array[0],array[1]);  
    }  
      
    /*��������д�ķ���*/  
    abstract public int calculate(int num1,int num2);  
      
    public int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  

}
