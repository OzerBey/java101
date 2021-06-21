package Homework37;

public class Student {

	private String name;
	private String stuNo;
	private int classes;
	Course math, english, programming;
	private double average;
	private boolean isPass;

	public Student() {

	}

	public Student(String name, int classes, String stuNo, Course math, Course english, Course programming) {
		super();
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.math = math;
		this.english = english;
		this.programming = programming;
		calcAvarage();
		this.isPass = false; // default false
	}

	void addBulkExamNote(int mathNote, int englishNote, int programmingNote) {
		if (isValid(mathNote)) {
			this.math.setNote(mathNote);
		}
		if (isValid(englishNote)) {
			this.english.setNote(englishNote);
		}
		if (isValid(programmingNote)) {
			this.programming.setNote(programmingNote);
		}
	}

	public void isPassStatus() {
		if (this.math.getNote() == 0 || this.english.getNote() == 0 || this.programming.getNote() == 0) {
			System.out.println("The notes are 0 or None !");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Average : " + this.average);
			if (this.isPass) {
				System.out.println("Passed the class ");
			} else {
				System.err.println("Failed the class !");
			}
		}
	}

	public void calcAvarage() {
		float mathAverage = (float) ((this.math.getNote() * 0.80) + (this.math.getVerbalGrade() * .2));
		float englishAverage = (float) ((this.english.getNote() * 0.80) + (this.english.getVerbalGrade() * .2));
		float programmingAverage = (float) ((this.programming.getNote() * 0.80)
				+ (this.programming.getVerbalGrade() * .2));
		this.average = (mathAverage + englishAverage + programmingAverage) / 3;
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.average > 55; // if average is bigger than 55 this method returns true otherwise it returns
									// false
	}

	public void printNote() {
		System.out.println("=========================");
		System.out.println("Student : " + this.name);
		System.out.println("Their Math grade : " + this.math.getNote());
		System.out.println("Their English grade : " + this.english.getNote());
		System.out.println("Their Programming grade: " + this.programming.getNote());
	}

	boolean isValid(int note) {
		boolean result = false;
		if (note >= 0 && note <= 100) {
			result = true;
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public Course getMath() {
		return math;
	}

	public void setMath(Course math) {
		this.math = math;
	}

	public Course getEnglish() {
		return english;
	}

	public void setEnglish(Course english) {
		this.english = english;
	}

	public Course getProgramming() {
		return programming;
	}

	public void setProgramming(Course programming) {
		this.programming = programming;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

}
