package com.xwt.interpreter;
/**
 * 
 * @author xwt
 * ���Խ�����ģʽ
 *
 */
public class TestInterpreter {
	public static void main(String[] args) {

		// ����9+2-8��ֵ
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}

}
