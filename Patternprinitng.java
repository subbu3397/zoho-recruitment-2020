package round1;

public class Patternprinitng {

	public static void patternprinting(String s) {
		if (s.isEmpty()) {
			System.out.println("String is Empty and pattern cannot be printed");
		} else {
			int n = s.length();
			int mid = n / 2;
			for (int i = 0; i <= mid; i++) {
				for (int j = i; j < s.length(); j++) {
					System.out.print(" ");
				}
				System.out.println(s.substring(mid, mid + i + 1));
			}
			for (int i = 0; i < mid; i++) {
				for (int j = i; j < mid; j++) {
					System.out.print(" ");
				}
				System.out.println(s.substring(mid) + s.substring(0, i + 1));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Pattern of String 1");
		String s = "WELCOME";
		patternprinting(s);
		System.out.println("Pattern of String 2");
		String s1 = "WATER";
		patternprinting(s1);
	}

}
