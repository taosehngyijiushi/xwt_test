package com.xwt.visitor;
/**
 * 
 * @author xwt
 * Subject�࣬accept���������ܽ�Ҫ�������Ķ���getSubject()��ȡ��Ҫ�����ʵ�����
 *
 */
public interface Subject {
	  public void accept(Visitor visitor);  
	   public String getSubject(); 

}
