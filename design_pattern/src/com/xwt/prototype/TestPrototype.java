package com.xwt.prototype;
/**
 * 
 * @author xwt
 * 测试原型模式
 *
 */
public class TestPrototype {
	public static void main(String[] args) {
		testPrototype();
	}

	private static void testPrototype() {
		Prototype pro = new Prototype();
		pro.setName("original object");
		Prototype pro1 = (Prototype) pro.clone();
		pro.setName("changed object1");

		System.out.println("original object:" + pro.getName());
		System.out.println("cloned object:" + pro1.getName());
	}

}
