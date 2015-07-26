package com.xwt.bridge;

/**
 * 
 * @author xwt 
 * 测试Bridge桥接模式
 * 
 */
public class TestBridge {
	public static void main(String[] args) {
		Bridge mb = new MyBridge();
		// 调用第一个对象
		mb.setSource(new SourceSub1());
		mb.method();
		// 调用第二个对象
		mb.setSource(new SourceSub2());
		mb.method();

	}
}
