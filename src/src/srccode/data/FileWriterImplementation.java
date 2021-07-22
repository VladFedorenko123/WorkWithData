package src.srccode.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.FileWrite;
import src.srccode.interfaces.Length;
import src.srccode.interfaces.Vowels;

public class FileWriterImplementation implements FileWrite {
	@Override
	public void proccesWriter(String str) {

		try {
			Length len = new LengthCalculator();
			Vowels vow = new VowelsCalculator();
			Consonant con = new ConsonantCalculator();

			PrintWriter writerVowels = new PrintWriter(new FileWriter("vowels.txt", true));
			PrintWriter writerConsonant = new PrintWriter(new FileWriter("consonant.txt", true));

			int length = len.getLength(str);
			int vowelsCount = vow.getVowels(str);
			int consonantCount = con.getConsonant(str);

			writerVowels.println(vowelsCount);
			writerVowels.close();

			writerConsonant.println(consonantCount);
			writerConsonant.close();

			System.out.println("Length of your name: " + length);
			System.out.println("Vowels in your name: " + vowelsCount);
			System.out.println("Consonant int your name: " + consonantCount);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
