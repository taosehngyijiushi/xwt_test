package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 * ʵ����
 *
 */
public class SmsASender implements Sender {

	@Override
	public void send() {
		System.out.println("����SmsASender��");
	}

}
