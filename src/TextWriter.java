import java.io.*;

public class TextWriter {
	
	public static void saveToFile(String file_name, String input) throws IOException {
		File file = new File(file_name);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		out.println(input);
		out.close();
	}
	
	
}