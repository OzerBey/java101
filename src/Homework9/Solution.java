package Homework9;

import java.util.Scanner;

/*
 * Ödev
Eğer kullanıcı adı yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre
oluşturuldu" yazan programı yazınız.*/
public class Solution {

	static String userName = "Yasin";
	static String password = "12345";
	static String newPassword = "";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username please");
		String enUserName = scan.nextLine();
		System.out.println("Enter your password please");
		String enPassword = scan.nextLine();
		if (enUserName.equals(userName) && enPassword.equals(password)) {
			System.out.println("Login successfully");
		} else {
			System.err.println("Invalid username or password please try again later");
			System.out.println("Do you want reset your password ?");
			System.out.println("Yes or No (y/n)");
			char choise = scan.next().charAt(0);
			switch (choise) {
			case 'y':
				System.out.println("Please enter your new password");
				newPassword = scan.nextLine();
				if (newPassword == password || newPassword == enPassword) {
					System.err.println(
							"Your new password can't be the same as your old password :), please try another password\n Enter your new password");
					newPassword = scan.nextLine();

				} else {
					System.out.println("Your password changed successfully");
					password = newPassword;
				}
				break;
			case 'n':
				System.out.println("Eee o zaman :) please try to login again later ");
				break;

			default:
				System.err.println("Invalid value please enter valid value");
				break;
			}
		}

	}

}
