package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 * ʵ����
 *
 */
public class MailASender implements Sender {

	@Override
	public void send() {
		System.out.println("����MailASender��");
	}

}
