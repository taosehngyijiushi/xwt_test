package com.xwt.visitor;
/**
 * 
 * @author xwt
 * ���Է�����ģʽ
 *
 */
public class TestVisitor {
	public static void main(String[] args) {  
        
        Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);      
    }  

}
