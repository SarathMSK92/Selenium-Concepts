package fileWriterExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException {
		
		String location = "BufferWriterText.txt";
		String content = "Hi BufferWriter";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter buffer = new BufferedWriter(fileWriter);
		buffer.write(content);
		buffer.close();

	}

}
