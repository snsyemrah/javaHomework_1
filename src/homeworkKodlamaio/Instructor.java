package homeworkKodlamaio;

public class Instructor extends User{
	
	private String branch;
	
	public Instructor() {
		
	}

	public Instructor(String branch) {
		super();
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
