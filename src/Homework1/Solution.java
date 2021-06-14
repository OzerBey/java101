package Homework1;

import java.util.Scanner;

/*
* Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
* ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/
public class Solution {
	static double getAverage(double grade1, double grade2) {
		return grade1 * .4 + grade2 * .6;
	}

	public static void main(String[] args) {
		System.out.println("Fizik Ort:");
		checkGrade();
		System.out.println("--------------");

		System.out.println("Kİmya Ort:");
		checkGrade();
		System.out.println("--------------");

		System.out.println("Matematik Ort:");
		checkGrade();
		System.out.println("--------------");

		System.out.println("Türkçe Ort:");
		checkGrade();
		System.out.println("--------------");

		System.out.println("Tarih Ort:");
		checkGrade();
		System.out.println("--------------");

		System.out.println("Müzik Ort:");
		checkGrade();

	}

	private static void checkGrade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first grade value");
		double not1 = scan.nextDouble();
		System.out.println("Enter second grade value");
		double not2 = scan.nextDouble();
		double result = getAverage(not1, not2);
		System.out.println(result);
		System.out.println(result >= 60 ? "Sınıfı geçti" : " Sınıfta kaldı"); // ternary operator
	}

}
