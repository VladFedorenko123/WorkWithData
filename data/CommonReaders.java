package src.srccode.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.srccode.interfaces.Readers;

public class CommonReaders implements Readers {
	private static Scanner scanner;
	private static List<String> list = new ArrayList<String>();

	@Override
	public List<String> commonReader() {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter path that file you wanna read!");

			String path = scanner.nextLine();
			File readingFile = new File(path);
			Scanner myReader = new Scanner(readingFile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				list.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return list;
	}
}
