package com.xwt.factory;
/**
 * 
 * @author xwt
 * 创建实现共同接口的类
 *
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("这是MailSender！");
	}

}
