package Quiz;

public class Answer4 {
	// declaring attribute
private String answer;
	
	public Answer4(String answer) {
		// defining method
		this.answer = answer;
	}
	
	public String greet() {
		String retval;
		
		if (this.answer == "Joanna Lumley") {
			retval = "Correct";
		} else {
			retval = "False";
		}
		return retval;
	}
}

