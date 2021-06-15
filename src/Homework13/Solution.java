package Homework13;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What month were you born ?");
		String jan = "january", feb = "februray", mar = "march", apr = "april", may = "may", jun = "june", jul = "july",
				aug = "august", sep = "september", oct = "october", nov = "november", dec = "december";

		String month = scan.nextLine().toLowerCase();// fixed case
		System.out.print("Enter what day were you born ");
		int day = scan.nextInt();
		if (jan.equals(month)) {
			if (day >= 22) {
				System.out.println("Kova");
			} else {
				System.out.println("Oğlak");
			}
		} else if (feb.equals(month)) {
			if (day >= 20) {
				System.out.println("Balık");
			} else {
				System.out.println("Kova");
			}
		} else if (mar.equals(month)) {
			if (day >= 21) {
				System.out.println("Koc");
			} else {
				System.out.println("Balık");
			}
		} else if (apr.equals(month)) {
			if (day >= 21) {
				System.out.println("Boğa");
			} else {
				System.out.println("Koc");
			}
		} else if (may.equals(month)) {
			if (day >= 22) {
				System.out.println("İkizler");
			} else {
				System.out.println("Boğa");
			}
		} else if (jun.equals(month)) {
			if (day >= 23) {
				System.out.println("Yengec");
			} else {
				System.out.println("İkizler");
			}
		} else if (jul.equals(month)) {
			if (day >= 23) {
				System.out.println("Aslan");
			} else {
				System.out.println("Yengec");
			}
		} else if (aug.equals(month)) {
			if (day >= 23) {
				System.out.println("Başak");
			} else {
				System.out.println("Aslan");
			}
		} else if (sep.equals(month)) {
			if (day >= 23) {
				System.out.println("Terazi");
			} else {
				System.out.println("Başak");
			}
		} else if (oct.equals(month)) {
			if (day >= 23) {
				System.out.println("Akrep");
			} else {
				System.out.println("Terazi");
			}
		} else if (nov.equals(month)) {
			if (day >= 22) {
				System.out.println("Ymonth");
			} else {
				System.out.println("Akrep");
			}
		} else if (dec.equals(month)) {
			if (day >= 22) {
				System.out.println("Oğlak");
			} else {
				System.out.println("Ymonth");
			}
		} else {
			System.out.println("Invalid month :) Please try again later ");
		}
	}

	private static void setLowerCase(String month) {
		month.toUpperCase();
	}
}
