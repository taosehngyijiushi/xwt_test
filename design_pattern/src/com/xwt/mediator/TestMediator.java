package com.xwt.mediator;

/**
 * 
 * @author xwt 
 * �����н���ģʽ
 * 
 */
public class TestMediator {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}

}
