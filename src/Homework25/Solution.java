package Homework25;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 100;
		AtmSimulation(scan, balance);
		// lectureMethod();
	}

	private static void AtmSimulation(Scanner scan, int balance) {
		String userName;
		String password;
		int choise;

		boolean isActive = true, isExit = true;

		while (isActive) {
			System.out.println("Enter your userName");
			userName = scan.nextLine();
			System.out.println("Enter your password");
			password = scan.nextLine();
			if (userName.equals("ozer") && password.equals("123")) {
				System.out.println("Welcome, OzerBank :)");
				isActive = false;
			} else {
				isActive = true;
			}
		}

		while (isExit) {
			System.out.println("1.Deposite money\n" + "2.Withdraw money\n" + "3.Show balance\n" + "4.Exit");
			System.out.print("Please select the process you want to do \n");
			choise = scan.nextInt();
			switch (choise) {
			case 1:
				System.out.println("Enter the amount of money to deposit");
				int priceDeposit = scan.nextInt();
				balance += priceDeposit;
				System.err.println("Current balance :" + balance + " ₺");
				break;

			case 2:
				System.out.println("Your balance :" + balance + " ₺");
				System.out.println("Enter the amount of money to withdraw");
				int priceWithdraw = scan.nextInt();
				if (priceWithdraw > balance) {
					System.err.println("Insufficient balance");
				} else {
					balance -= priceWithdraw;
					System.err.println("Current balance :" + balance + " ₺");
				}
				break;
			case 3:
				System.err.println("Your balance :" + balance + " ₺");
				break;

			case 4:
				System.err.println("Don't forget your creditCard");
				isExit = false;
				break;
			default:
				System.err.println("Invalid operation");
				break;
			}
		}
	}

	private static void lectureMethod() {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		while (right > 0) {
			System.out.print("Kullanıcı Adınız :");
			userName = input.nextLine();
			System.out.print("Parolanız : ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
				do {
					System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					select = input.nextInt();
					if (select == 1) {
						System.out.print("Para miktarı : ");
						int price = input.nextInt();
						balance += price;
					} else if (select == 2) {
						System.out.print("Para miktarı : ");
						int price = input.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= price;
						}
					} else if (select == 3) {
						System.out.println("Bakiyeniz : " + balance);
					}
				} while (select != 4);
				System.out.println("Tekrar görüşmek üzere.");
				break;
			} else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
				} else {
					System.out.println("Kalan Hakkınız : " + right);
				}
			}
		}
	}

}
