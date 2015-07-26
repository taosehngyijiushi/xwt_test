package com.xwt.proxy;
/**
 * 
 * @author xwt
 * 测试proxy代理模式
 *
 */
public class TestProxy {
	public static void main(String[] args) {
		Italk italk=new People();
		italk.talk("I can not talk");
		Proxy p=new Proxy(italk);
		p.talk("I can talk");
		p.sing("I can sing");
	}
	

}
