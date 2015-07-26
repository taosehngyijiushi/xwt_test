package com.xwt.observer;
/**
 * 
 * @author xwt
 * 观察者模式是类和类之间的关系，不涉及到继承
 * 简单来讲就一句话：当一个对象变化时，
 * 其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 *
 */

public interface Observer {
	public void update();  
}
