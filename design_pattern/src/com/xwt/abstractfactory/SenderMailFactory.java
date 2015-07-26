package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 *创建工厂类
 */
public class SenderMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailASender();
	}

}
