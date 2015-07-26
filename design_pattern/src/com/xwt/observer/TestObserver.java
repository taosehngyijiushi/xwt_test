package com.xwt.observer;
/**
 * 
 * @author xwt
 * 测试观察者模式
 *
 */
public class TestObserver {
	public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
          
        sub.operation();  
    }  

}
