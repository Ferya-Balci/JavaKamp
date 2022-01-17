package hafta3Odev2;

public class Student extends User {

	 String myCourses;
	 
	 public Student() {
		 
	 }

	public Student(String myCourses) {
		super();
		this.myCourses = myCourses;
	}

	public String getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses) {
		this.myCourses = myCourses;
	}
	 
	
}
