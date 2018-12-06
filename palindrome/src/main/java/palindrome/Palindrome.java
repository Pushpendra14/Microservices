package palindrome;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {
	
	public boolean isPalindrome(String word) {
		boolean palin = false;
		String[] originalWord = word.split("");
		StringBuilder reversedWordBuilder = new StringBuilder("");
		for (int i = originalWord.length - 1; i >= 0; i-- ) {
			reversedWordBuilder.append(originalWord[i]);
		}
		palin = reversedWordBuilder.toString().equalsIgnoreCase(word);
		return palin;
	}
	
}
