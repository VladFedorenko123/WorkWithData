package src.srccode.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import src.srccode.interfaces.Sum;

public class FindSumConsonant implements Sum {
	private static BufferedReader readerConsonant;

	@Override
	public void sumFunction() {
		try {
			File consonantFile = new File("consonant.txt");

			int sumConsonant = 0;
			readerConsonant = new BufferedReader(new FileReader(consonantFile));
			String text = null;
			while ((text = readerConsonant.readLine()) != null) {
				sumConsonant = sumConsonant + Integer.parseInt(text);
			}
			System.out.println("Sum of consonant: " + sumConsonant);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
