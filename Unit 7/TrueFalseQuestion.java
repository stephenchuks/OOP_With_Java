import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	String ask () {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if(answer.equals("T") || (answer.equals("Y") || answer.equals("YES"))) answer = "TRUE";
			
			if(answer.equals("F") || (answer.equals("N") || answer.equals("NO"))) answer = "FALSE";
			
			boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
			
			if (valid)
			return answer;
			JOptionPane.showMessageDialog(null, "Answer is not valid, Please enter TRUE or FALSE.");
			}
			}
	
	
		
	TrueFalseQuestion(String question, String answer){
		super.question = "TRUE or FALSE: " + question;
		answer = answer.toUpperCase();
		
		if (answer.equals("T") || (answer.equals("Y") || (answer.equals("Yes") )))
			correctAnswer = "TRUE";
		
		if (answer.equals("F") || (answer.equals("N") || (answer.equals("NO") )))
			correctAnswer = "FALSE";
		
	}
		
	}


