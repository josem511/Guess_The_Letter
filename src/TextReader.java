import java.io.*;
import java.util.LinkedList;

public class TextReader {
	
	public static LinkedList<String> getLinkedListOfStringOfPlayers(String file_name) throws IOException {
		
		LinkedList<String> players = new LinkedList<String>(); //initialize linked list
		
		File data = new File(file_name);
		if(data.exists()) {
			BufferedReader in = new BufferedReader(new FileReader(data));
			String line = in.readLine();
			while(line != null) {
				players.add(line); //add every line in the file to the linked list
				line = in.readLine();
			}
			in.close();
		} else {
			System.out.println(file_name + " File Could Not Be Opened");
		}
		
		return players;
	}

}