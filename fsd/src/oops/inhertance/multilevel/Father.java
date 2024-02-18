package oops.inhertance.multilevel;

public class Father extends Grandfather{
		// TODO Auto-generated constructor stub
		String name="Prasanna";
		public Father(int Dob ) {
			super(Dob);
		}
		public String getName() {
			return name;
		}
		@Override
		public void setDob(int dob) {
		// TODO Auto-generated method stub
		super.setDob(dob);
		}
		
	}
