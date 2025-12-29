package com.tka.dec24;

public class TestPlayer {
	public static void main(String[] args) {
		
		Player p1 = new Player(45,"Rohit Sharma",7046,15,"Mumbai Indians");
		Player p2 = new Player(13,"Quinton de Kock",3390,0,"Mumbai Indians");
		Player p3 = new Player(63,"Suryakumar Yadav",4311,0,"Mumbai Indians");
		Player p4 = new Player(50,"Sherfane Rutherford",397,1,"Mumbai Indians");
		Player p5 = new Player(9,"Tilak Varma",1499,0,"Mumbai Indians");
		Player p6 = new Player(37,"Corbin Bosch",47,1,"Mumbai Indians");
		Player p7 = new Player(91,"Hardik Pandya",2749,78,"Mumbai Indians");
		Player p8 = new Player(74,"Mitchell Santner",110,25,"Mumbai Indians");
		Player p9 = new Player(56,"Deepak Chahar",117,88,"Mumbai Indians");
		Player p10 = new Player(18,"Trent Boult",85,143,"Mumbai Indians");
		Player p11 = new Player(93,"Jasprit Bumrah",69,183,"Mumbai Indians");
		
		System.out.println("Jersey No: " + p1.jersey_no);
		System.out.println("Player Name: " + p1.player_name);
		System.out.println("Runs: " + p1.runs);
		System.out.println("Wickets: " + p1.wickets);
		System.out.println("Team: " + p1.team_name);
	

	}

}

