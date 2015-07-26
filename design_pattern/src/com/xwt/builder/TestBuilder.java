package com.xwt.builder;
/**
 * 
 * @author xwt
 * 房主的任务就是聘请一个民工，一个设计师，同时把民工给设计师指挥，督促设计师开展工作。最后从民工手上收房。
 *
 */
public class TestBuilder {
	public static void main(String[] args) {
		//聘请一个民工
		Builder mingGong=new MingGong();
		//聘请一个设计师
		Designer ds=new Designer();
		//设计师指挥民工
		ds.Order(mingGong);
		//房东收房
		mingGong.getRoom();
		
	}

}
