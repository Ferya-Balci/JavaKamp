package hafta3Odev2;

public class Instructor extends User {

	
	String givenCourses;
	
	public  Instructor() {
		
	}
	
	 public Instructor(String givenCourses) {
			super();
			this.givenCourses = givenCourses;
		}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	
	
}
