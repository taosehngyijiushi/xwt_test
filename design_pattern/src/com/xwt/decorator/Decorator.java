package com.xwt.decorator;
/**
 * 
 * @author xwt
 * ����װ����
 *
 */
public class Decorator implements Sourceable {
	private Sourceable s;
	public  Decorator (Sourceable s){
		this.s=s;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		s.method();
		System.out.println("after decorator");

	}

}
