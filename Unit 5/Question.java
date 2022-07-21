import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String question;
	String correctAnswer;
	
	abstract String ask();
	
	void check () {
		nQuestions++;
	String answer = ask();
	if (answer.equals(correctAnswer)) {
		JOptionPane.showMessageDialog(null, "You are correct.");
		nCorrect++;
	}else {
		JOptionPane.showMessageDialog(null, "You are Incorrect. The correct answer is " + correctAnswer);
		}
	}// End of else branch
		static void showResults() {
			JOptionPane.showConfirmDialog(null, "You got " + nCorrect + "correct out of " + nQuestions + "questions");
		}
}
