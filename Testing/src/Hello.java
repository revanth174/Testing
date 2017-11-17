import java.util.Scanner;
import java.util.Stack;

public class Hello {

	private static Scanner scan;

	public static void main(String[] args) {
		System.out.println(isValid());
	}

	private static boolean isValid() {
		Stack<Character> s = new Stack<>();
		scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.indexOf("world"));
		char st = str.charAt(0);
		if(st =='}' || st == ']' || st == ')')
			return false;
		for (char c : str.toCharArray()) {
			if (c == '{' || c == '(' || c == '[')
				s.push(c);
			else {
				if (!s.isEmpty()) {
					if (c == '}') {
						if (s.peek() != '{')
							return false;
						else
							s.pop();
					}

					if (c == ')') {
						if (s.peek() != '(')
							return false;
						else
							s.pop();
					}

					if (c == ']') {
						if (s.peek() != '[')
							return false;
						else
							s.pop();
					}
				}
				else 
					return false;
			}

		}
		
		
		if (s.isEmpty())
			return true;
		else
			return false;
	}

}
