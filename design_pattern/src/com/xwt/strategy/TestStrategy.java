package com.xwt.strategy;

public class TestStrategy {
	 public static void main(final String[] args)
	    {
	        final MemberStrategy strategy = new PrimaryMember();
	        final MemberContent memberContext = new MemberContent(strategy);
	        System.out.println("primary member discount:" + memberContext.discount());

	        final MemberStrategy strategy1 = new IntermediateMember();
	        final MemberContent memberContext1 = new MemberContent(strategy1);
	        System.out.println("intermediate member discount:" + memberContext1.discount());

	        final MemberStrategy strategy2 = new AdvancedMember();
	        final MemberContent memberContext2 = new MemberContent(strategy2);
	        System.out.println("advanced member discount:" + memberContext2.discount());
	    }

}
