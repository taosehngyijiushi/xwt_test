package com.xwt.strategy;
/**
 * 
 * @author xwt
 *策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们还可以相互替换。策略模式让算法独立于是用它的客户而独立变化
 */
public interface MemberStrategy {
	 public double discount();

}
