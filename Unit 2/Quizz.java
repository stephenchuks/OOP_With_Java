import javax.swing.JOptionPane;

public class Quizz{

public static void main(String[]) {
	String question = "What is a quiz?\n";
	question += "A. a test of knowledge, especially a brief informational test given to students\n";
	question += "B. 42\n";
	question += "C. a duck\n";
	question += "D. to get to the other side\n";;
	question += "E. To be or not to be, that is the question.";
	
	while (true) {
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		if (answer.equals("A")) {
			JOptioinPane.showMessageDialog(null, "Correct!");
			break;
		} else if (answer.equals("B") || answer.equals("C")|| answer.equals("D") || answer.equals("E")) {
			JOptionPane.showMessageDialog(null, "Incorrect. Please try again.")
		} else {
			JOptionPane.showMessageDialog(null, "Invalid answer");
		}
	}
	
}
}