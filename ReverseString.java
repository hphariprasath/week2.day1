package week2.day1;

public class ReverseString {
	public static void main(String[] args) {
		String test = "so sad";
		char[] array = test.toCharArray();
		for (int i=5; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
