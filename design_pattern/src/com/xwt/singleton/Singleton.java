package com.xwt.singleton;

/**
 * 
 * @author xwt ����ģʽSingleton 
 * Ӧ�ó��ϣ���Щ��������ֻ��һ�����㹻�� 
 * ���ã���֤����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 * 
 */
public class Singleton {
	// 1.���췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton() {
	}

	// 2.�������Ψһʵ��
	private static Singleton instance = new Singleton();

	// 3.�ṩһ�����ڻ�ȡʵ���ķ���
	public static Singleton getInstance() {
		return instance;
	}
}
