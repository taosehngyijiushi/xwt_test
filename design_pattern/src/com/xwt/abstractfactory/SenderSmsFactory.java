package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 *创建工厂类
 */
public class SenderSmsFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsASender();
	}

}
