package Homework37;

public class Course {

	private String name;
	private String code;
	private String prefix;
	private int note;
	private int verbalGrade;
	private Teacher courseTeacher;

	public Course() {
	}

	public Course(String name, String code, String prefix) {
		super();
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalGrade = 0;
	}

	public void addTeacher(Teacher teacher) {
		if (this.prefix.equals(teacher.getBranch())) {
			this.setTeacher(teacher);
			System.out.println(teacher.getName() + " added");
		} else {
			System.out.println(teacher.getName() + " doesn't have this branch.");
		}
	}

	public void printTeacher() {
		if (this.getName() != null) {
			System.out.println(courseTeacher.getName() + " is the teacher of the " + this.name + " course");
		} else {
			System.out.println(this.name + " doesn't have a teacjher");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Teacher getTeacher() {
		return courseTeacher;
	}

	public void setTeacher(Teacher teacher) {
		this.courseTeacher = teacher;
	}

	public int getVerbalGrade() {
		return verbalGrade;
	}

	public void setVerbalGrade(int verbalGrade) {
		this.verbalGrade = verbalGrade;
	}

}
