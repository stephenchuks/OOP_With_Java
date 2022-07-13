
public class Quiz {
	public static void main(String[] args) {
		MultipleChoiceQuestion question = new MultipleChoiceQuestion("Which is not a correct type of a computer? \n", "Mini Frame Computer", "Supercomputers", "a duck", "Workstations", "Personal Computers", "C");
		question.check();
		MultipleChoiceQuestion.showResults();
		
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is the full form of MU? \n", "Management Unit", "Masked Unit", "a duck", "Main Unit", "Memory Unit", "E");
		question1.check();
		MultipleChoiceQuestion.showResults();
		
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the full form of ALU? \n", "Arithmetic Logic Unit", "Arithmetic Local Unit", "a duck", "Advance Logical Unit", "None of these", "A");
		question2.check();
		MultipleChoiceQuestion.showResults();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Which of the following language does the computer understand? \n", " C Language", "Assembly Language", "a duck", "Binary Language", "None of these", "D");
		question3.check();
		MultipleChoiceQuestion.showResults();

		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Which of the following is the brain of the computer? \n", " Central Processing Unit", "Memory", "a duck", "Arithmetic and Logic unit", "Control unit", "A");		
		question4.check();
		MultipleChoiceQuestion.showResults();
	}
}

