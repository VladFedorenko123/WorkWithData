package src.srccode.data;

import src.srccode.interfaces.Length;

public class LengthCalculator implements Length {
	@Override
	public int getLength(String str) {
		int length = str.length();
		return length;
	}
}
