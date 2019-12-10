import java.io.IOException;
import java.util.LinkedList;

public class Player implements Comparable<Player> {
	
	private int score;
	private String name;
	
	public Player(String name, int score) {
		super();
		this.score = score;
		this.name = name.toUpperCase();
	}
	
	public Player(String fromToString) {
		super();
		this.score = Integer.parseInt(fromToString.substring(4));
		this.name = fromToString.substring(0, 3).toUpperCase();
	}

	/*		setters and getters		*/
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "\t" + this.getScore() + "\n";
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return ((Integer)this.getScore()).compareTo((Integer)o.getScore());
	}
	
	public static LinkedList<Player> getPlayers(String nameOfFile){
		
		LinkedList<Player> players = new LinkedList<Player>();	//create linked list of players
		//load players from "leaderboard.txt" file
		try {
			for (String p : TextReader.getLinkedListOfStringOfPlayers(nameOfFile)) {
				System.out.println(p);
				if(!p.isEmpty())
					players.add(new Player(p));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return players;
	}
}