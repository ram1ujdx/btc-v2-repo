package inheritance;

public class Bowler extends Player{

	private int wickets;
	private float economy;
	private int total5wickets;
	
	
	
	
	public int getWickets() {
		return wickets;
	}




	public void setWickets(int wickets) {
		this.wickets = wickets;
	}




	public float getEconomy() {
		return economy;
	}




	public void setEconomy(float economy) {
		this.economy = economy;
	}




	public int getTotal5wickets() {
		return total5wickets;
	}




	public void setTotal5wickets(int total5wickets) {
		this.total5wickets = total5wickets;
	}




	public void showPlayerDetails() {
		System.out.println("Player Name - "+playerName);
		System.out.println("Serial No. - "+serialNo);
		System.out.println("Age - "+age);
		System.out.println("Total Wickets - "+wickets);
		System.out.println("Economy - "+economy);
		System.out.println("No. of 5-wickets - "+total5wickets);
	}
	
	
}
