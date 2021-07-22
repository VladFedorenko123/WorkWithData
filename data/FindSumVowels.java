package src.srccode.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import src.srccode.interfaces.Sum;

public class FindSumVowels implements Sum {
	private static BufferedReader readerVowels;

	@Override
	public void sumFunction() {
		try {
			File vowelsFile = new File("vowels.txt");

			int sumVowels = 0;
			readerVowels = new BufferedReader(new FileReader(vowelsFile));
			String text = null;
			while ((text = readerVowels.readLine()) != null) {
				sumVowels = sumVowels + Integer.parseInt(text);
			}
			System.out.println("Sum of vowels: " + sumVowels);
			readerVowels.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
