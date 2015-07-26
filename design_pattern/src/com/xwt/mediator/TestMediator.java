package com.xwt.mediator;

/**
 * 
 * @author xwt 
 * 测试中介者模式
 * 
 */
public class TestMediator {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}

}
