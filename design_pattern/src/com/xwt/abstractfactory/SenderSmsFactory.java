package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 *����������
 */
public class SenderSmsFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsASender();
	}

}
