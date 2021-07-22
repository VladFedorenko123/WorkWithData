package src.srccode.data;

import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.FileRead;

import src.srccode.interfaces.Readers;
import src.srccode.interfaces.Vowels;

public class FileReadImplementation implements FileRead {

	@Override
	public void process() {
		Readers read = new CommonReaders();
		Vowels vow = new VowelsCalculator();
		Consonant con = new ConsonantCalculator();

		int vowelsCount = 0;
		int consonantCount = 0;
		for (String i : read.commonReader()) {
			System.out.println(i);
			vowelsCount = vow.getVowels(i);
			consonantCount = con.getConsonant(i);
			System.out.println("Vowels: " + vowelsCount);
			System.out.println("Consonant: " + consonantCount);
		}
	}
}
