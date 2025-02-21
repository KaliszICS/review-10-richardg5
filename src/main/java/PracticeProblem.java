public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pyramid(int rows) {
		StringBuilder current = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int e = 0; e < rows - 1 - i; e++) {
				current.append(" ");
			}
			current.append("*");
			for (int e = 0; e < i; e++) {
				current.append(" *");
			}
			if (i < rows - 1) {
				current.append("\n");
			}
		}
		return current.toString();
	}

	public static String square(int length) {
		StringBuilder current = new StringBuilder();
		for (int i = 0; i < length; i++) {
			current.append("*");
		}
		for (int i = 1; i < length - 1; i++) {
			current.append("\n");
			current.append("*");
			for (int e = 1; e < length - 1; e++) {
				current.append(" ");
			}
			current.append("*");
		}
		if (length > 1) {
			current.append("\n");
			for (int i = 0; i < length; i++) {
				current.append("*");
			}
		}
		return current.toString();
	}

	public static boolean hasLowercase(String check) {
		for (int i = 0; i < check.length(); i++) {
			if (check.charAt(i) >= 'a' && check.charAt(i) <= 'z') {
				return true;
			}
		}
		return false;
	}
}
