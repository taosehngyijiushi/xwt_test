package com.xwt.memento;
/**
 * 
 * @author xwt
 * ����¼ģʽ�ֽ�������ģʽ(Snapshot Pattern)��Tokenģʽ��������Ϊģʽ��
 * �����ڲ��ƻ���յ�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
 * �����Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
 * 
 * 
 * Original����ԭʼ�࣬��������Ҫ���������value������һ������¼�࣬��������valueֵ

 *
 */

public class Original {
	 private String value;  
     
	    public String getValue() {  
	        return value;  
	    }  
	  
	    public void setValue(String value) {  
	        this.value = value;  
	    }  
	  
	    public Original(String value) {  
	        this.value = value;  
	    }  
	  
	    public Memento createMemento(){  
	        return new Memento(value);  
	    }  
	      
	    public void restoreMemento(Memento memento){  
	        this.value = memento.getValue();  
	    }  

}
