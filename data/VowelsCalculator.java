package src.srccode.data;

public class VowelsCalculator implements Vowels {
	public int getVowels(String str) {
		int vCount = 0;
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				k++;
			}
		}
		return vCount = vCount + k;
	}
}
