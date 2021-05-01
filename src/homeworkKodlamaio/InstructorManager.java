package homeworkKodlamaio;

public class InstructorManager extends UserManager{
	public void changeTheBranch(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()  + " isimli egitmenin bransi " + instructor.getBranch() + "'dir! ");
	}

}
	