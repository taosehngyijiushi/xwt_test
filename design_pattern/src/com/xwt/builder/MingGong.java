package com.xwt.builder;
/**
 * 
 * @author xwt
 * ��,��������������ʵʩ
 * ��,������о��岿���細��,�ذ�Ľ���
 * ͬʱ��Ϊ�������񹤽���,��˽�����ɺ������ѷ��ӵݽ��ط��� 
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
