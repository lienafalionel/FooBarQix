import java.util.HashMap;
import java.util.Map;

public class Main {

	public static final int START = 1;
	public static final int END = 100;
	public static final Map<Integer, String> DIVIDER = new HashMap<Integer, String>();

	public Main() {
		DIVIDER.put(3, "Foo");
		DIVIDER.put(5, "Bar");
		DIVIDER.put(7, "Qix");
	}

	public String extractWords(int number) {
		String result = "";

		// extract divisors
		for (Integer lDivider : DIVIDER.keySet()) {
			if (number % lDivider == 0) {
				result += DIVIDER.get(lDivider);
			}
		}

		// extract contains
		String lNumberString = String.valueOf(number);
		String[] lNumberSplit = lNumberString.split("");
		for (String string : lNumberSplit) {
			for (Integer lDivider : DIVIDER.keySet()) {
				if (lDivider == Integer.parseInt(string)) {
					result += DIVIDER.get(lDivider);
				}
			}
		}

		return result.isEmpty() ? String.valueOf(number) : result;
	}

	public void print() {
		for (int i = START; i < END; i++) {
			System.out.println(i + " -> " + extractWords(i));
		}
	}

	public static void main(String[] args) {
		new Main().print();
	}

}
