package Homework22;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ent3r number");
		int number = scan.nextInt();
		int digit = 0, result = 0;

		while (number != 0) {
			digit = getMod(number);
			number /= 10;
			result += digit;
			System.out.print(digit + " ");
		}
		System.out.println("\nResult :" + result);

	}

	/*static int getExponantial(int base, int power) {
		return (int) Math.pow(base, power);
	}*/

	static int getMod(int number) {
		int temp = 0;
		temp = number % 10;
		return temp;
	}
	
	/*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

    }*/
}
