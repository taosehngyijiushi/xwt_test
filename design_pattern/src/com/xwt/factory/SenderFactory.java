package com.xwt.factory;

/**
 * 
 * @author xwt 
 * 创建工厂类
 * 
 */

public class SenderFactory {
	public Sender produce(String type) {
		if ("sms".equalsIgnoreCase(type)) {
			return new SmsSender();
		} else if ("mail".equalsIgnoreCase(type)) {
			return new MailSender();
		} else {
			return null;
		}
	}

}
