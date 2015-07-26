package com.xwt.proxy;
/**
 * 
 * @author xwt
 * 创建代理，有People的功能
 *
 */
public class Proxy implements Italk {
	Italk italk;
	public Proxy(Italk italk){
		this.italk=italk;
	}

	@Override
	public void talk(final String msg) {
		// TODO Auto-generated method stub
		this.italk.talk(msg);

	}
	public void sing(final String songName){
		System.out.println("songName "+songName);
	}

}
