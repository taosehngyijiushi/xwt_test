package com.xwt.strategy;

public class MemberContent {
	private MemberStrategy memberStrategy = null;

	public MemberContent(final MemberStrategy memberStrategy) {
		this.memberStrategy = memberStrategy;
	}

	public double discount() {
		return this.memberStrategy.discount();
	}

}
