package com.xwt.decorator;
/**
 * 
 * @author xwt
 * ����decoratorװ����
 *
 */
public class TestDecorator {
	public static void main(String[] args) {
		Sourceable s=new Source();
		Decorator d=new Decorator(s);
		d.method();
	}

}
