/*
public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	

	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {
		question = query + "\n";
		question += "A." + a + "\n";
		question += "B." + b + "\n";
		question += "C." + c + "\n";
		question += "D." + d + "\n";
		question += "E." + e + "\n";
		
		correctAnswer = answer.toUpperCase();

	}
	

	 
	String ask () {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C")||answer.equals("D") || answer.equals("E"));
			if (valid) {
			return answer;
			}
			else {
			JOptionPane.showMessageDialog(null, "Answer is not valid, Please enter A,B,C,D,or E.");
			}
		}
		
	}
	
	void check () {
		nQuestions++;
	String answer = ask();
	if (answer.equals(correctAnswer)) {
		JOptionPane.showMessageDialog(null, "You are correct.");
		nCorrect++;
	}else {
		JOptionPane.showMessageDialog(null, "You are Incorrect. The correct answer is " + correctAnswer);}
	}// End of else branch
		static void showResults() {
			JOptionPane.showConfirmDialog(null, "You got " + nCorrect + "correct out of " + nQuestions + "questions");
		}
	} //This method will check the answer to the question
