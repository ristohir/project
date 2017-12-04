package Quiz;

public class Answer3 {
	// declaring attribute
		private String actor;
		
		public Answer3(String actor) {
			// defining method
			this.actor = actor;
		}
		
		public String greet() {
			String retval;
			
			if (this.actor.equalsIgnoreCase("Fidelio")) {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}
