package homeworkKodlamaio;

public class Student extends User{
	
	private String school;
	private String depertman;
	
	public Student() {
		
	}
	
	public Student(String school, String depertman) {
		super();
		this.school = school;
		this.depertman = depertman;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepertman() {
		return depertman;
	}

	public void setDepertman(String depertman) {
		this.depertman = depertman;
	}
	
}
