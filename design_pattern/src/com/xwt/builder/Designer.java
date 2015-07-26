package com.xwt.builder;
/**
 * 
 * @author xwt
 * 定义设计师，他的职责是指挥房主指派给他的工人按照自己的设计意图建造房子
 * 设计师。他知道房子应该怎么设计，但他不会自己去建造，而是指挥民工去建造
 */

public class Designer {
	// 指挥民工进行工作
	public void Order(Builder builder){
		builder.makeWindow();
		builder.makeFloor();
	}

}
