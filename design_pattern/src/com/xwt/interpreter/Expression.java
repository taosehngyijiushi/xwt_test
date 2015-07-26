package com.xwt.interpreter;
/**
 * 
 * @author xwt
 * 解释器模式定义语言的文法，并且建立一个解释器来解释该语言中的句子。
 * 它属于类的行为模式。这里的语言意思是使用规定格式和语法的代码
 */
public interface Expression {
	public int interpret(Context context);  
}
