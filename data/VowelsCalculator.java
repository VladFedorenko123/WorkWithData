package src.srccode.data;

import src.srccode.interfaces.Length;
import src.srccode.interfaces.Vowels;

public class VowelsCalculator implements Vowels {
	public int getVowels(String str) {
		Length length = new LengthCalculator();
		str = str.toLowerCase();
		int vCount = 0;
		int k = 0;
		for (int i = 0; i < length.getLength(str); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				k++;
			}
		}
		return vCount = vCount + k;
	}
}
