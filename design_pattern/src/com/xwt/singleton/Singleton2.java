package com.xwt.singleton;
/**
 * 
 * @author xwt
 * 模式：懒汉模式
 */
public class Singleton2 {
	//1.构造私有方法
	private Singleton2(){
	}
	//2.创建类的唯一实例
	private static Singleton2 instance;
	//3.提供一个用于获取实例的方法
	public static Singleton2 getInstance(){
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}

}
