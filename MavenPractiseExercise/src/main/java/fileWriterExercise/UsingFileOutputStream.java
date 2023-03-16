package fileWriterExercise;

import java.io.FileOutputStream;
import java.io.IOException;

 

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {

		String location = "UsingFileIOnew.txt";
		String content = "Hi UsingFileIO new ";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] thismessage = content.getBytes();
		fileOutputStream.write(thismessage);
		fileOutputStream.close();
	}

}
