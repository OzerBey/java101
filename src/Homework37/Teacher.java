package Homework37;

public class Teacher {
	private String name;
	private String mpNo;
	private String branch;

	public Teacher() {

	}

	public Teacher(String name, String mpNo, String branch) {
		super();
		this.name = name;
		this.mpNo = mpNo;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMpno() {
		return mpNo;
	}

	public void setMpno(String mpNo) {
		this.mpNo = mpNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
