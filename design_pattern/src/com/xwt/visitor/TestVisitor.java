package com.xwt.visitor;
/**
 * 
 * @author xwt
 * 测试访问者模式
 *
 */
public class TestVisitor {
	public static void main(String[] args) {  
        
        Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);      
    }  

}
