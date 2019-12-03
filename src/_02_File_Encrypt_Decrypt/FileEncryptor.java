package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("src/_02_File_Encrypt_Decrypt/print.txt");
		System.out.println("What do you want to write?");
		String s = new Scanner(System.in).nextLine();
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				s.toCharArray()[i]=Character.toUpperCase(s.toCharArray()[i]);
			}else {
				s.toCharArray()[i]=Character.toLowerCase(s.toCharArray()[i]);
			}
		}
		f.write(s);
		f.close();
	}
}
