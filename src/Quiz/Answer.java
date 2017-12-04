package Quiz;

public class Answer {
	// declaring attribute
		private String answer;
		
		public Answer(String answer) {
			// defining method
			this.answer = answer;
		}
		
		public String greet() {
			String retval;
			
			if (this.answer == "Mrs Hudson") {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}
