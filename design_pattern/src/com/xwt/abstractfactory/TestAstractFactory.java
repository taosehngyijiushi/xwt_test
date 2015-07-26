package com.xwt.abstractfactory;

public class TestAstractFactory {
	public static void main(String[] args) {
		Provider p1=new SenderMailFactory();
		Sender s1=p1.produce();
		s1.send();
		Provider p2=new SenderSmsFactory();
		Sender s2=p2.produce();
		s2.send();
	}

}
