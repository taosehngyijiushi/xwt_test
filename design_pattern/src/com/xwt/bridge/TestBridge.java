package com.xwt.bridge;

/**
 * 
 * @author xwt 
 * ����Bridge�Ž�ģʽ
 * 
 */
public class TestBridge {
	public static void main(String[] args) {
		Bridge mb = new MyBridge();
		// ���õ�һ������
		mb.setSource(new SourceSub1());
		mb.method();
		// ���õڶ�������
		mb.setSource(new SourceSub2());
		mb.method();

	}
}
