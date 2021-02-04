package loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

	/*	int num = 1;
		int sum = 0;
		
		while(num <= 10) { 
			sum += num;
			num++; // 11
		}
		System.out.println(sum); // 55
		System.out.println(num); // 11
		
		
	*/	
		int input;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
			
			
		}
		System.out.println(sum); // output에 0을 넣으면 끝남
		
		
		
		
		
	}

}
