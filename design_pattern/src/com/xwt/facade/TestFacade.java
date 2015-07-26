package com.xwt.facade;
/**
 * 
 * @author xwt
 * 测试外观模式
 *
 */
public class TestFacade {
	public static void main(String[] args) {
		Computer cp=new Computer();
		cp.startup();
		cp.shutdown();
	}

}
