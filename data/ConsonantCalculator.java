package src.srccode.data;

import src.srccode.interfaces.Consonant;
import src.srccode.interfaces.Length;

public class ConsonantCalculator implements Consonant {

	public int getConsonant(String str) {
		Length length = new LengthCalculator();
		str = str.toLowerCase();
		int cCount = 0;
		int k = 0;
		for (int i = 0; i < length.getLength(str); i++) {
			if (str.charAt(i) == 'b' || str.charAt(i) == 'c' || str.charAt(i) == 'd' || str.charAt(i) == 'f'
					|| str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k'
					|| str.charAt(i) == 'l' || str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'p'
					|| str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's' || str.charAt(i) == 't'
					|| str.charAt(i) == 'v' || str.charAt(i) == 'w' || str.charAt(i) == 'f' || str.charAt(i) == 'x'
					|| str.charAt(i) == 'y' || str.charAt(i) == 'z') {
				k++;
			}
		}
		return cCount = cCount + k;
	}
}
