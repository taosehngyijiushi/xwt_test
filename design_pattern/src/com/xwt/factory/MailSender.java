package com.xwt.factory;
/**
 * 
 * @author xwt
 * ����ʵ�ֹ�ͬ�ӿڵ���
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("����MailSender��");
	}

}
