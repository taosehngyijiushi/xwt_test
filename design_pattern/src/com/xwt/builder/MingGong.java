package com.xwt.builder;
/**
 * 
 * @author xwt
 * 民工,他负责具体事物的实施
 * 民工,负责进行具体部件如窗户,地板的建造
 * 同时因为房子是民工建的,因此建设完成后由他把房子递交回房主 
 *
 */
public class MingGong implements Builder {
	private String window="";
	private String floor="";

	@Override
	public void makeWindow() {
		// TODO Auto-generated method stub
		window=new String("window");

	}

	@Override
	public void makeFloor() {
		// TODO Auto-generated method stub
		floor=new String("floor");

	}

	@Override
	public Room getRoom() {
		 if((!window.equals(""))&&(!floor.equals(""))) {  
		      System.out.println("room ready!");  
		      return new Room();  
		    }  
		    else return null;  
		  }  
}
