
public class Tictactoe {
	
	//Fields
	
	private int turns = 0;
	private int wins1 = 0;
	private int wins2 = 0;
	private String name1;
	private String name2;

	//Constructor
	
	public Tictactoe(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	
	}
	
	//Methods
	
	
	public int getTurns() {
		return turns;
	}
	
	public int getWins1() {
		return wins1;
	}
	
	public int getWins2() {
		return wins1;
	}
	
	public String getName1() {
		return name1;
	}
	
	public String getName2() {
		return name2;
	}
	
	public void setTurns(int turns) {
		this.turns = turns;
	}
	
	public void setWins1(int wins1) {
		this.wins1 = wins1;
	}
	
	public void setWins2(int wins2) {
		this.wins2 = wins2;
	}
	
	//Använd scannerklassen för att fråga spelarna om deras namn och sätt deras svar till fältens värde!
	
	
	
	public String whoStarts() {
		String player1 = getName1();
		String player2 = getName2();
		if(Math.random() < 0.5D) {
			return player1 + "starts!";
		}else {
			return player2 + "starts!";
		}
		
	}
	public String startPlay() {
		
		
		return "";
	}

}
