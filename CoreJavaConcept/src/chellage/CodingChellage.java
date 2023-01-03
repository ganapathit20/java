package chellage;

import java.util.HashMap;
import java.util.Map;

public class CodingChellage {

	public static void main(String[] args) {

		// Pointing String pool Constant
		String persion1 = "demo";

		String persion2 = "demo";

		System.out.println(persion1 == persion2);

		// Pointing reference/memory address
		String persion3 = new String("demo");

		String persion4 = new String("demo");

		System.out.println(persion3 == persion4);

		// pre and post increments

		int a = 5;

		int c1 = a++ + a++;

		System.out.println(c1);

		int d = a++ + ++a;

		System.out.println(d);

		int e = ++a + a++;

		System.out.println(e);

		int f = ++a + ++a;

		System.out.println(f);

		// Count Repect Char
		String name = "ganapathi";

		char[] nameArr = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < nameArr.length; i++) {

			if (map.containsKey(nameArr[i])) {
				map.put(nameArr[i], map.get(nameArr[i]) + 1);

			} else {
				map.put(nameArr[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		// Check given number binary or not
		boolean isTrue = true;

		int binary = 0101;

		while (binary > 0 && isTrue) {
			isTrue = false;
			if ((binary % 10 == 0) || (binary % 10 == 1)) {
				isTrue = true;
				binary /= 10;
			}
		}
		if (isTrue) {
			System.out.println(" Binary");
		} else {
			System.out.println("Not Binary");
		}

		// String reversal
		String inputName = "mithunraj";

		char[] rName = inputName.toCharArray();

		for (int i = rName.length - 1; i >= 0; i--) {

			// System.out.print(rName[i]);

		}

		// Vowel
		for (int i = 0; i < rName.length; i++) {

			if ((rName[i] == 'a' || rName[i] == 'e') || rName[i] == 'i' || rName[i] == 'o' || rName[i] == 'u') {
				// System.out.print(rName[i]);
			}

		}

		// Palindrome no ex o/p 515 ok 675 not ok

		int number = 515, tem = 0, rem = 0, check;

		check = number;

		while (number > 0) {

			rem = number % 10;

			tem = (tem * 10) + rem;

			number = number / 10;
		}

		// if(check==tem)
		// System.out.println("same");
		// else
		// System.out.println("no");

		// Check array is Containe odd number

		int numbers[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 1) {

				// System.out.print(numbers[i]);

			}

		}

		// Remove White space in string

		String newName = "  gan apa thi t  ";

		System.out.println(newName.trim());

		char[] tem1 = newName.toCharArray();

		for (int i = 0; i < tem1.length; i++) {

			if (!Character.isWhitespace(tem1[i])) {
				// System.out.print(tem1[i]);
			}

		}

		// Count Repect letter
		String str1 = "abcdABCDabcd";

		char[] chars = str1.toCharArray();

		Map<Character, Integer> charsCount = new HashMap<>();

		for (char c : chars) {
			if (charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c) + 1);
			} else
				charsCount.put(c, 1);
		}

		// System.out.println(charsCount);

		String binaryValue = "10101110";

		char[] byteValue = binaryValue.toCharArray();

		String one = "";
		String zero = "";

		for (int i = 0; i < byteValue.length; i++) {

			if (byteValue[i] == '1') {
				one += byteValue[i];
			} else {
				zero += byteValue[i];
			}
		}

		System.out.println(one + zero);
		System.out.println(zero + one);

		// String name1 = "ganapathi";
		// String name2 = "ganapathi";

		String name1 = new String("ganapathi");
		String name2 = new String("ganapathi");

		if (name1 == name2)
			System.out.println("is correct");
		else if (name1.equals(name2))
			System.out.println("ok");
		else
			System.out.println("not correct");

	}

}
