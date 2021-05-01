package homeworkKodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Emrah");
		student.setLastName("Sensoy");
		student.setEmailAddress("emrah@Gmail.com");
		student.setUserName("snsyemrah");
		student.setSchool("ATATURK");
		student.setDepertman("Sayisal");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmailAddress("engin@gmail.com");
		instructor.setUserName("engindemirog");
		instructor.setBranch("Java");
		
		
		//UserManager userManager= new UserManager();
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student);
		instructorManager.changeTheBranch(instructor);
		
		
		

	}

}
