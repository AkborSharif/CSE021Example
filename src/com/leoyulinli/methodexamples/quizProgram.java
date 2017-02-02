package com.leoyulinli.methodexamples;

import java.util.Scanner;

public class quizProgram {
	
	//PARALLEL ARRAY
	//Parallel Array is a group of arrays to create a table-like structure
	//to store data.
	//To rewrite it as a table, it will look something like this:
	//
	//		QUESTION	ANSWERKEY	POSSIBLESCORE
	//	[0]	"Which..."	'A'			1
	//	[1]	"How..."	'A'			9
	//
	//Usually I would create an object to store each answer key and score
	//with the corresponding question, but since object has not been taught
	//so I am using parallel array for now. 
	
	//List of questions to ask
	public static final String[] QUESTION = {
			"Which of the following letter is 'A' \n\t A. A\tB. B\tC. C\tD. D",
			"How many electron does a Hydrogen atom has? \n\tA. 1\tB. 2\tC. 3\t D. 4"
		};
	
	//List of answers to the questions
	public static final char[] ANSWERKEY = {
			'A',
			'A'
	};
	
	//List of points each question is worth in the quiz
	public static final int[] POSSIBLESCORE = {
			1,
			9
	};
	

	/**
	 * Check the answer, and return the score it deserved.
	 * <p>
	 * For now, the answer is either right or wrong. 
	 * For right answer, return the corresponding POSSIBLESCORE; 
	 * For wrong answer, return a 0.
	 * </p>
	 * 
	 * @param questionNumber the index of the question
	 * @param answer the answer to check
	 * @return score the answer deserved
	 */
	public static int getAnswerScore(int questionNumber, char answer) {
		return ANSWERKEY[questionNumber] == answer ? 
				POSSIBLESCORE[questionNumber] : 0;
		//Another way to write it could be
		//
		//	if(ANSWERKEY[questionNumber] == answer) {
		//		return POSSIBLESCORE[questionNumber];
		//	} else {
		//		return 0;
		//	}
		//
		//but using 
		//
		//	return [condition] ? [value when true] : [value when false];
		//
		//is shorter and more convenient. 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalScore = 0;
		int totalPossileScore = 0;
		System.out.println("Here is the quiz: ");
		for(int i = 0; i < QUESTION.length; i++) {
			totalPossileScore += POSSIBLESCORE[i];
			System.out.println(QUESTION[i]);
			
			//scan.nextLine().charAt(0) is to get the first character from the
			//user input, since getAnswerScore require a char.
			//(and there is no scan.nextChar method)
			totalScore += getAnswerScore(i, scan.nextLine().charAt(0));
		}
		System.out.println("Your final Score is: " + totalScore + "/" + totalPossileScore);

	}

}
