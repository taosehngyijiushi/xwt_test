package com.xwt.factory;

/**
 * 
 * @author xwt 
 * ���Թ�����
 * 
 */
public class TestFactory {
	public static void main(String[] args) {
		SenderFactory sf = new SenderFactory();
		Sender send = sf.produce("sms");
		send.send();
		Sender send1 = sf.produce("mail");
		send1.send();
	}
}
