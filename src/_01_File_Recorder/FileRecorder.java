package _01_File_Recorder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("src/_01_File_Recorder/print.txt");
		System.out.println("What do you want to write?");
		String s = new Scanner(System.in).nextLine();
		f.write(s);
		f.close();
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_01_File_Recorder/print.txt"));
			
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
