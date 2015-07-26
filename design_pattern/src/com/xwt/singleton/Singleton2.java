package com.xwt.singleton;
/**
 * 
 * @author xwt
 * ģʽ������ģʽ
 */
public class Singleton2 {
	//1.����˽�з���
	private Singleton2(){
	}
	//2.�������Ψһʵ��
	private static Singleton2 instance;
	//3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static Singleton2 getInstance(){
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}

}
