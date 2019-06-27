package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		char firstChar;
		char secondChar;
		int loops = 0;
		Stack<Character> chars = new Stack<Character>();

		for (int i = 0; i < b.length(); i++) {
			chars.add(b.charAt(i));
		}
		while (loops < 10) {
			for (int i = 0; i < chars.size(); i++) {
				firstChar = chars.elementAt(i);
				secondChar = chars.elementAt(i + 1);
				if (firstChar == '{' && secondChar == '}') {
					chars.remove(i);
					chars.remove(i + 1);
				}
			}
			loops++;
		}
		if (chars.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

}