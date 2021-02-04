package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			
		}while(num <= 10);
		
		
		System.out.println(sum); //55
		System.out.println(num); //11
		
	}*/
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		do {
			
			input = scanner.nextInt();
			sum += input;	
			
		}while(input != 0);
		
		System.out.println(sum); // output에 0 넣으면 끝
		
		
	}
}
