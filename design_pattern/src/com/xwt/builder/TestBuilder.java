package com.xwt.builder;
/**
 * 
 * @author xwt
 * �������������Ƹ��һ���񹤣�һ�����ʦ��ͬʱ���񹤸����ʦָ�ӣ��������ʦ��չ�����������������շ���
 *
 */
public class TestBuilder {
	public static void main(String[] args) {
		//Ƹ��һ����
		Builder mingGong=new MingGong();
		//Ƹ��һ�����ʦ
		Designer ds=new Designer();
		//���ʦָ����
		ds.Order(mingGong);
		//�����շ�
		mingGong.getRoom();
		
	}

}
