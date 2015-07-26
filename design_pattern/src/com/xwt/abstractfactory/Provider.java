package com.xwt.abstractfactory;
/**
 * 
 * @author xwt
 * 外部接口，为了实现增加功能不改动原先代码
 *
 */
public interface Provider {
	public Sender produce();

}
