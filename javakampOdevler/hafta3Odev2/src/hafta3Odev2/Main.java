package hafta3Odev2;

public class Main {

	public static void main(String[] args) {
		
		Instructor egitmen1=new Instructor();
		egitmen1.setEmail("egitmen1@gmail.com");
		egitmen1.setFirstName("Engin");
		egitmen1.setLastName("Demiroğ");
		egitmen1.setGivenCourses("Java Kamp");
		
		
		Student student1=new Student();
		student1.setEmail("student1@gmail.com");
		student1.setFirstName("Ferya");
		student1.setLastName("Balcı");
		student1.setMyCourses("Java kamp");
		
		UserManager userManager=new UserManager();
		
		User[] users= {egitmen1,student1};
		userManager.addMultiple(users);
		userManager.loginMultiple(users);
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.addCourse(egitmen1);
		
		StudentManager studentManager=new StudentManager();
		studentManager.courseList(student1);
	
	}

}
