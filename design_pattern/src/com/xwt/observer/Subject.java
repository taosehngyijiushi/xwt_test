package com.xwt.observer;
/**
 * 
 * @author xwt
 *	Subject接口
 *  MySubject类就是我们的主对象，
 *  Observer1和Observer2是依赖于MySubject的对象，
 *  当MySubject变化时，Observer1和Observer2必然变化。
 *  AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：增加或删除被监控对象，
 *  且当MySubject变化时，负责通知在列表内存在的对象
 */
public interface Subject {
	  /*增加观察者*/  
    public void add(Observer observer);  
      
    /*删除观察者*/  
    public void del(Observer observer);  
      
    /*通知所有的观察者*/  
    public void notifyObservers();  
      
    /*自身的操作*/  
    public void operation();  

}
