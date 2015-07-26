package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 * 实现类
 *
 */
public class SmsASender implements Sender {

	@Override
	public void send() {
		System.out.println("这是SmsASender！");
	}

}
