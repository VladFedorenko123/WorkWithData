package src.srccode.data;

import java.io.File;
import java.util.Scanner;

import src.srccode.interfaces.Console;
import src.srccode.interfaces.ErrorDetection;
import src.srccode.interfaces.FileWrite;
import src.srccode.interfaces.Sum;

public class ConsoleImplementation implements Console {
	private static Scanner scanner = new Scanner(System.in);

	private static final String EXIT = "Exit";

	@Override
	public void getConsole() {
		ErrorDetection obj = new StringValidation();
		FileWrite write = new FileWriterImplementation();
		Sum sumV = new FindSumVowels();
		Sum sumC = new FindSumConsonant();

		File vowelsFile = new File("vowels.txt");
		File consonantFile = new File("consonant.txt");

		System.out.println("Please enter your name.");
		String name = scanner.nextLine();

		boolean isValid = obj.validationString(name);
		if (!isValid) {
			System.out.println("You enter your name with some issues. ");
		}

		write.proccesWriter(name);
		sumV.sumFunction();
		sumC.sumFunction();

		if (name.equals(EXIT)) {
			vowelsFile.delete();
			consonantFile.delete();
			System.exit(0);
		}
	}
}
