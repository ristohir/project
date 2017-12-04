package Quiz;

public class Answer5 {
	// declaring attribute
		private String actor;
		
		public Answer5(String actor) {
			// defining method
			this.actor = actor;
		}
		
		public String greet() {
			String retval;
			
			if (this.actor.equalsIgnoreCase("Paris")) {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}
