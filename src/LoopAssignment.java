
public class LoopAssignment {

	public static void main(String[] args) {
		int multiplesNum = 10;
		char letter = 'z';
		int series = 10;
		int factors = 25;
		int sumDigits = 555;
		
		//multiples(multiplesNum);
		//vowels(letter);
		series(series);
		//factors(factors);
		//System.out.println(sumOfDigits(sumDigits));

	}
	
	// This takes a number and shows its multiples ten times
	public static void multiples(int num) {
		int new_num = num;
		for(int i = 0; i < 10; i++) {
			System.out.println(new_num);		
			new_num += num;
		}
	}
	
	// This determines if a character is a vowel
	public static void vowels(char c) {
		switch(c) {
			case 'a':
				System.out.println("This is a vowel");
				break;
			case 'e':
				System.out.println("This is a vowel");
				break;
			case 'i':
				System.out.println("This is a vowel");
				break;
			case 'o':
				System.out.println("This is a vowel");
			break;
			case 'u':
				System.out.println("This is a vowel");
				break;
			case 'y':
				System.out.println("This is a sometimes a vowel");
				break;
			default:
				System.out.println("This is not a vowel");
		}
	}
	
	// Prints a designated series
	// Not great readability lol
	public static void series(int x) {
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= x; j++) {
				if (j > i) {
					break;
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
	public static void factors(int num) {
		for(int divide = 1; divide <= num; divide++) {
			if (num % divide == 0) {
				System.out.println(divide + " and " + (num / divide) + " are factors of " + num);
			}
		}
	}
	
	public static int sumOfDigits(int input) {
		String convertedInt = String.valueOf(input);
		int sum = 0;
		for(int i = 0; i < convertedInt.length(); i++) {
			sum = sum + Character.getNumericValue(convertedInt.charAt(i));
		}
		return sum;	
	}
}
