package com.xwt.builder;
/**
 * 
 * @author xwt
 * 定义工人接口，就是能够完成建造房子任务的人的通用要求
 * 工人接口，定义了各个工人所要进行的工所作。他们负责进行具体部件如窗户，地板的建造
 * 同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
 *
 */

public interface Builder {
	public void makeWindow();
	public void makeFloor();
	public Room getRoom();

}
