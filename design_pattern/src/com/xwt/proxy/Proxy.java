package com.xwt.proxy;
/**
 * 
 * @author xwt
 * ����������People�Ĺ���
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
