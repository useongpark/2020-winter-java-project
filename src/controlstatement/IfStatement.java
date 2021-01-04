package controlstatement;

import java.util.Scanner; // JAVA Scanner class

public class IfStatement {

	public static void main(String[] args) {

		// example of if statement
		char gender = 'F';
		
		if (gender == 'F') {
			System.out.println("She is female");
		}
		else {
			System.out.println("She is not female");
		}
		
		
		// 입장료 계산
		
		Scanner sc = new Scanner(System.in);  // JAVA Scanner class
	
		int age = sc.nextInt(); // 입력문 
		
		int charge = 0;
		
		if (age < 8 ) {
			charge = 1000;
		}
		else if (age < 14) {
			charge = 1500;
		}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		System.out.println("age : " + age);
		System.out.println("charge : " + charge);
		
		
		// 학점 계산
		
		Scanner scanner = new Scanner(System.in);  // JAVA Scanner class
		
		double GPA = scanner.nextDouble(); // 입력문 
		
		char grade = ' ';
		
		if (GPA >= 4.0) {
			grade = 'A';
		}
		else if (GPA <= 3.0) {
			grade = 'B';
		}
		else if (GPA <= 2.0) {
			grade = 'C';
		}
		else if (GPA <= 1.0) {
			grade = 'D';
		}
		else {
			System.out.println("retaking");
		}
		System.out.println("GPA : " + GPA);
		System.out.println("grade : " + grade);
	}

}



