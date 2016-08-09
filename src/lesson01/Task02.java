package lesson01;

import java.io.FileWriter;
import java.io.IOException;

public class Task02 {
	
	public static void main(String[] args) throws IOException {

		try (FileWriter writer = new FileWriter("C:/temp/text.txt", true)) {
			for (int i = 0; i < 10; i++) {
				writer.write(i + ": " + "Hello world");
				writer.write(System.lineSeparator());
			}
			writer.flush();
			writer.close();
		}
	}

}
