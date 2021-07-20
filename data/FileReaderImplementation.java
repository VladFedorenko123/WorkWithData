package src.srccode.data;

import src.srccode.interfaces.FileRead;
import src.srccode.interfaces.Readers;
import src.srccode.interfaces.Vowels;

public class FileReaderImplementation implements FileRead {

	@Override
	public void process() {
		Readers read = new CommonReaders();
		Vowels vow = new VowelsCalculator();
		int vowelsCount = 0;
		for (String i : read.commonReader()) {
			System.out.println(i);
			vowelsCount = vow.getVowels(i);
			System.out.println(vowelsCount);
		}
	}
}
