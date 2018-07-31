package com.zhoudong.strategy;

public class Main {

	public static void main(String[] args) {
		int seed1 = 5;
		int seed2 = 10;
		
		Player player1 = new Player("Tom", new Winningstrategy(seed1));
		Player player2 = new Player("Jerry", new ProbStrategy(seed2));
		
		for(int i=0;i<100; i++) {
			Hand hand1 = player1.nextHand();
			Hand hand2 = player2.nextHand();
			
			if(hand1.isStrongThan(hand2)) {
				System.out.println("winner: "+player1);
				player1.win();
				player2.lose();
			}else if(hand1.isWeakThan(hand2)) {
				System.out.println("winner: "+player2);
				player1.lose();
				player2.win();
			}else {
				System.out.println("even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
}
