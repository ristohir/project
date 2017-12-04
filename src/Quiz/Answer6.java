package Quiz;

public class Answer6 {
	// declaring attribute
	private String answer;
	
	public Answer6(String answer) {
		// defining method
		this.answer = answer;
	}
	
	public String greet() {
		String retval;
		
		if (this.answer == "George Orwell") {
			retval = "Correct";
		} else {
			retval = "False";
		}
		return retval;
	}
}