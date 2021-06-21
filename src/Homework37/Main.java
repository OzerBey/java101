package Homework37;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Course math = new Course("Math", "MAT101", "MAT");
		Course english = new Course("English", "EN101", "ENG");
		Course programming = new Course("Programming", "PRG101", "PRG");

		math.setVerbalGrade(100);
		english.setVerbalGrade(80);
		programming.setVerbalGrade(50);

		Teacher yasinTeacher = new Teacher("Yasin Özer", "905063659971", "MAT");
		Teacher ozerTeacher = new Teacher("Ozer Yasin ", "905063659972", "ENG");
		Teacher otherTeacher = new Teacher("deneme 2", "905063659973", "PRG");

		math.addTeacher(yasinTeacher);
		english.addTeacher(ozerTeacher);
		programming.addTeacher(otherTeacher);

		Student s1 = new Student("Zeynep", 4, "140144015", math, english, programming);
		s1.addBulkExamNote(80, 20, 40);
		s1.isPassStatus();

		Student s2 = new Student("Gizem", 4, "2211133", math, english, programming);
		s2.addBulkExamNote(100, 50, 40);
		s2.isPassStatus();

		Student s3 = new Student("Osman", 4, "221121312", math, english, programming);
		s3.addBulkExamNote(50, 20, 40);
		s3.isPassStatus();
	}
}
