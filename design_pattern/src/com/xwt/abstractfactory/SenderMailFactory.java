package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 *����������
 */
public class SenderMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailASender();
	}

}
