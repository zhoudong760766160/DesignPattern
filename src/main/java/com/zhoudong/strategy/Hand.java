package com.zhoudong.strategy;

public class Hand {

	public final static int HANDVALUE_GUO = 1;
	
	public final static int HANDVALUE_CHO = 2;
	
	public final static int HANDVALUE_PAA = 3;
	
	private int handValue;
	
	public Hand(int handValue) {
		this.handValue = handValue;
	}
	
	public static final Hand[] hands = {
			new Hand(HANDVALUE_GUO),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA),
	};
	
	private static final String[] names = {"石头","剪刀","不"};

	public static Hand getHand(int handValue) {
		return hands[handValue];
	}
	
	public boolean isStrongThan(Hand hand) {
		return fight(hand) == 1;
	}
	
	public boolean isWeakThan(Hand hand) {
		return fight(hand) == -1;
	}

	private int fight(Hand hand) {
		if(this == hand) {
			return 0;
		}else if((this.handValue+1)%3 == hand.handValue) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public String tostring() {
		return names[handValue];
	}
	
}
