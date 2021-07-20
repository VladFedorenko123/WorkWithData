package src.srccode.data;

public class StringValidation implements ErrorDetection {

	@Override
	public boolean validationString(String str) {
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!(ch >= 'a' && ch <= 'z')) {
				return false;
			}
		}
		return true;
	}

}
