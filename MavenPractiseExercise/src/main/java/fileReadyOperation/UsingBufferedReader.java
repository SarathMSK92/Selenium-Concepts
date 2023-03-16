package fileReadyOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {

		String location = "BufferWriterText.txt";		
		FileReader filereader = new FileReader(location);		
		BufferedReader reader = new BufferedReader(filereader);		
		String currentLine;
		while((currentLine = reader.readLine())!=null)
		{	
		System.out.println(currentLine);
		}
	}

}
