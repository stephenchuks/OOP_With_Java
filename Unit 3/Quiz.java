import javax.swing.JOptionPane;

public class Quizz {
	

	static int nQuestions = 0;
	static int nCorrect = 0;
	 
	static String ask (String question) {
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
	
	static void check (String question, String correctAnswer) {
		nQuestions++;
	String answer = ask(question);
	if (answer.equals(correctAnswer)) {
		JOptionPane.showMessageDialog(null, "You are correct.");
		nCorrect++;
	}else {
		JOptionPane.showMessageDialog(null, "You are Incorrect. The correct answer is " + correctAnswer);
	}// End of else branch
		
	} //This method will check the answer to the question
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question = "Which is not a correct type of a computer? \n";
		
		question += "A. Mini Frame Computer \n";
		question += "B. Supercomputers\n";
		question += "C. a duck \n";
		question += "D. Workstations \n";
		question += "E. Personal Computers";
		check(question, "D");
		JOptionPane.showConfirmDialog(null, "You got " + nCorrect + "correct out of " + nQuestions + "questions");
		
	question = "4) What is the full form of ALU? \n";
		
		question += "A. Arithmetic Logic Unit \n";
		question += "B. Arithmetic Local Unit\n";
		question += "C. a duck \n";
		question += "D. Advance Logical Unit \n";
		question += "E. None of these.";
		check(question, "A");
		JOptionPane.showConfirmDialog(null, "You got " + nCorrect + "correct out of " + nQuestions + "questions");
		
question = "What is the full form of MU? \n";
		
		question += "A. Management Unit \n";
		question += "B. Masked Unit\n";
		question += "C. a duck \n";
		question += "D. Main Unit \n";
		question += "E. Memory Unit";
		check(question, "E");
		JOptionPane.showConfirmDialog(null, "You got " + nCorrect + "correct out of " + nQuestions + "questions");
		/*
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("A")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				break;
			} else if (answer.equals("B") || answer.equals("C")||answer.equals("D") || answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Incorrect. Please try again");
			}else {
				JOptionPane.showMessageDialog(null, "Please enter A, B, C, D, or E");
			}
		}*/
		
			    System.out.println("Hello world!");
			  }
			}