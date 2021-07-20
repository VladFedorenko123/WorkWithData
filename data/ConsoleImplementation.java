package src.srccode.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import src.srccode.interfaces.Console;
import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.Length;
import src.srccode.interfaces.Vowels;

public class ConsoleImplementation implements Console {
	private static BufferedReader readerVowels;
	private static BufferedReader readerConsonant;
	private static Scanner scanner = new Scanner(System.in);

	private static String exit = "Exit";

	@Override
	public void getConsole() {
		try {
			StringValidation obj = new StringValidation();
			Length len = new LengthCalculator();
			Vowels vow = new VowelsCalculator();
			Consonant con = new ConsonantCalculator();

			PrintWriter writerVowels;
			writerVowels = new PrintWriter(new FileWriter("vowels.txt", true));

			PrintWriter writerConsonant = new PrintWriter(new FileWriter("consonant.txt", true));

			File vowelsFile = new File("vowels.txt");
			File consonantFile = new File("consonant.txt");

			System.out.println("Please enter your name.");
			String name = scanner.nextLine();
			boolean bool = obj.validationString(name);
			if (!bool) {
				System.out.println("You enter your name with some issues. ");
			}

			int length = len.getLength(name);
			int vowelsCount = vow.getVowels(name);
			int consonantCount = con.getConsonant(name);

			writerVowels.println(vowelsCount);
			writerVowels.close();

			writerConsonant.println(consonantCount);
			writerConsonant.close();

			System.out.println("Length of your name: " + length);
			System.out.println("Vowels in your name: " + vowelsCount);
			System.out.println("Consonant int your name: " + consonantCount);

			int sumVowels = 0;
			int sumConsonant = 0;
			readerVowels = new BufferedReader(new FileReader(vowelsFile));
			readerConsonant = new BufferedReader(new FileReader(consonantFile));
			String text = null;
			while ((text = readerVowels.readLine()) != null) {
				sumVowels = sumVowels + Integer.parseInt(text);
			}
			while ((text = readerConsonant.readLine()) != null) {
				sumConsonant = sumConsonant + Integer.parseInt(text);
			}
			System.out.println("Sum of vowels: " + sumVowels);
			System.out.println("Sum of consonant: " + sumConsonant);

			if (name.equals(exit)) {
				vowelsFile.delete();
				consonantFile.delete();
				System.exit(0);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
