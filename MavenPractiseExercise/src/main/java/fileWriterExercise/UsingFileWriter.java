package fileWriterExercise;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {

		String location = "FileWriterText.txt";
		String content = "Hi FileWriter";
		
		FileWriter file = new FileWriter(location);
		file.write(content);
		file.close();

	}

}
