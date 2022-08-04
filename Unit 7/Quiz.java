public class Quiz {
    public static void main(String[] args) {
        Question question = new TrueFalseQuestion("California is not in Canada", "Y"); 
        question.check();
        question = new TrueFalseQuestion("The planet Venus has no moons", "N");
        question.check();
        question = new TrueFalseQuestion("Jupiter is composed mostly of iron", "N");
        question.check();
        question = new TrueFalseQuestion("The sun is a star of average size", "Y");
        question.check();
        question = new TrueFalseQuestion("A lunar eclipse occurs when the sun passes", "N");
        question.check();
        question = new MultipleChoiceQuestion("Which is not a correct type of a computer? \n", "Mini Frame Computer", 
        		"Supercomputers", "a duck", "Workstations", "Personal Computers", "C");
        question.check();

        question = new MultipleChoiceQuestion("What is the full form of MU? \n", "Management Unit", "Masked Unit", "a duck", "Main Unit", "Memory Unit", "E");
        question.check();

        question = new MultipleChoiceQuestion("What is the full form of ALU? \n", "Arithmetic Logic Unit", "Arithmetic Local Unit", "a duck", "Advance Logical Unit", "None of these", "A");
        question.check();
        question = new MultipleChoiceQuestion("Which of the following language does the computer understand? \n", " C Language", "Assembly Language", "a duck", "Binary Language", "None of these", "D");
        question.check();
        question = new MultipleChoiceQuestion("Which of the following is the brain of the computer? \n", " Central Processing Unit", "Memory", "a duck", "Arithmetic and Logic unit", "Control unit", "A");
        question.check();
        MultipleChoiceQuestion.showResults();
    }
}