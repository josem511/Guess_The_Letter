package guess_the_letter;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.io.IOException;
import java.util.Collections;


public class game {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Player p1 = new Player("jos", 10000);
		Player p2 = new Player("jor", 1500);
		Player p3 = new Player("jsw", 1030);
		Player p4 = new Player("jeq", 2100);
		Player p5 = new Player("jes", 100);
		Player p6 = new Player("qeq", 10);
		Player p7 = new Player("ied", 900);
		Player p8 = new Player("peq", 2000);
		
		LinkedList<Player> players = new LinkedList<Player>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		
		
		Collections.sort(players, Collections.reverseOrder());
		
		String leaderBoard = "";
		int i = 0;
		for (Player p : players) {
			if (i > 4)
				break;
			leaderBoard += p.toString();
			i++;
		}
		
		JOptionPane.showMessageDialog( null, new JTextArea(leaderBoard),
		         "Top Five", JOptionPane.INFORMATION_MESSAGE );

		try {
			TextWriter.saveToFile("leaderboard.txt", leaderBoard);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		players.clear();
		
		try {
			for (String p : TextReader.getLinkedListOfStringOfPlayers("leaderboard.txt")) {
				System.out.println(p);
				if(!p.isEmpty())
					players.add(new Player(p.substring(0, 3), Integer.parseInt(p.substring(4))));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		players.add(new Player("MOK", 25000));
		Collections.sort(players, Collections.reverseOrder());

		leaderBoard = "";
		i = 0;
		for (Player p : players) {
			if (i > 4)
				break;
			leaderBoard += p.toString();
			i++;
		}
		
		try {
			for (String p : TextReader.getLinkedListOfStringOfPlayers("leaderboard.txt")) {
				System.out.println(p);
				if(!p.isEmpty())
					players.add(new Player(p.substring(0, 3), Integer.parseInt(p.substring(4))));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog( null, new JTextArea(leaderBoard),
		         "Top Five", JOptionPane.INFORMATION_MESSAGE );
		
		
		
		
		
		
	}

}
