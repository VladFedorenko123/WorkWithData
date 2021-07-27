package src.srccode.data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import src.srccode.interfaces.Console;
import src.srccode.interfaces.FileRead;

public class DataWork {
	private static boolean restart = true;
	private static Scanner scanner = new Scanner(System.in);
	private static final String EXIT = "Exit";
	private static final String READFILE = "File";
	private static final String CONSOLE = "Console";

	public static void main(String[] args) throws IOException {
		while (restart) {
			FileRead read = new FileReadImplementation();
			Console consol = new ConsoleImplementation();

			File vowelsFile = new File("vowels.txt");
			File consonantFile = new File("consonant.txt");

			System.out.println(
					"If you wanna work with file please enter File or Console, if you wnat to work with console!");

			String file = scanner.nextLine();
			if (file.equals(READFILE)) {
				// Path to file /home/vlad/eclipse-workspace/WorkWithData/myfile.txt
				read.process();
			}
			if (file.equals(CONSOLE)) {
				consol.getConsole();
			}
			if (file.equals(EXIT)) {
				vowelsFile.delete();
				consonantFile.delete();
				System.exit(0);
			}
			scanner.close();
		}
	}
}
