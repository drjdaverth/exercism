class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		double sumCheck = 0; // Initialize the comparison variable
		int numLength = String.valueOf(numberToCheck).length(); // Gets the power
		int digit = numberToCheck; // Disposable version of numberToCheck

		for (int i = 0; i < numLength; i++) {
			int finalDigit = digit % 10; // Gets the last digit
			sumCheck = sumCheck + Math.pow(finalDigit, numLength); // Adds digit to power of numLength
			digit = digit / 10; // removes (left-shift) last digit
		}
		
		if (sumCheck == numberToCheck) {
			return true;
		}

		return false;
		
	}

}