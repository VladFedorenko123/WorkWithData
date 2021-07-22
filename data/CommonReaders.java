package src.srccode.data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import src.srccode.interfaces.Readers;

public class CommonReaders implements Readers {
	private static Scanner scanner;
	private static List<String> list = new ArrayList<String>();
	private static final String JAVA7 = "Java 7";
	private static final String JAVA8 = "Java 8";
	private static final String JAVA11 = "Java 11";

	@Override
	public List<String> commonReader() {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter path that file you wanna read!");
			String path = scanner.nextLine();

			System.out.println("Select Java version and write in next line\"Java 7,Java 8, Java 11\"");
			String javaVersion = scanner.nextLine();

			// java 77
			if (javaVersion.equals(JAVA7)) {
				System.out.println("---------java 7----------");
				File file = new File(path);
				FileReader fileRead = new FileReader(file);
				Scanner myReader = new Scanner(fileRead);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					list.add(data);
				}
				myReader.close();
			}

			// java8
			if (javaVersion.equals(JAVA8)) {
				System.out.println("---------java 8----------");
				String reader = new String(Files.readAllBytes(Paths.get(path)));
				Scanner myReader = new Scanner(reader);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					list.add(data);
				}
				myReader.close();
			}

			// java 11
			if (javaVersion.equals(JAVA11)) {
				System.out.println("---------java 11----------");
				Path fileName = Path.of(path);
				String actual = Files.readString(fileName);
				Scanner myReader = new Scanner(actual);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					list.add(data);
				}
				myReader.close();
			}
		} catch (

		IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return list;
	}
}
