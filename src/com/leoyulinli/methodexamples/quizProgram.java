package com.leoyulinli.methodexamples;

import java.util.Scanner;

public class quizProgram {
	public static final String[] QUESTION = {
			"Which of the following letter is 'A' \n\t A. A\tB. B\tC. C\tD. D",
			"How many electron does a Hydrogen atom has? \n\tA. 1\tB. 2\tC. 3\t D. 4"
		};
	
	public static final char[] ANSWERKEY = {
			'A',
			'A'
	};
	
	public static final int[] POSSIBLESCORE = {
			1,
			9
	};
	
	public static int getAnswerScore(int questionNumber, char answer) {
		return ANSWERKEY[questionNumber] == answer ? 
				POSSIBLESCORE[questionNumber] : 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalScore = 0;
		int totalPossileScore = 0;
		System.out.println("Here is the quiz: ");
		for(int i = 0; i < QUESTION.length; i++) {
			totalPossileScore += POSSIBLESCORE[i];
			System.out.println(QUESTION[i]);
			totalScore += getAnswerScore(i, scan.nextLine().charAt(0));
		}
		System.out.println("Your final Score is: " + totalScore + "/" + totalPossileScore);

	}

}
