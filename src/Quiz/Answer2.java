package Quiz;

public class Answer2 {
	// declaring attribute
		private String actor;
		
		public Answer2(String actor) {
			// defining method
			this.actor = actor;
		}
		
		public String greet() {
			String retval;
			
			if (this.actor.equalsIgnoreCase("Prunella Scale")) {
				retval = "Correct";
			} else {
				retval = "False";
			}
			return retval;
		}
	}
