package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		// 비트 연산자
		
		int num1 = 0B00001010; // 이진수 = 10
		int num2 = 0B00000101; // 이진수 = 5
		
		System.out.println(num1 & num2); // 0 (둘다 1인 비트가 없어서)
		System.out.println(num1 | num2); // 15 
		System.out.println(num1 ^ num2); // 15 
		
		System.out.println(num2 << 1); //10
		System.out.println(num2 << 2); //20
		System.out.println(num2 << 3); //40
		System.out.println(num2 << 4); //80
		
		System.out.println(num2 >> 1); //2
		System.out.println(num2 >> 2); //1
		System.out.println(num2 >> 3); //0
		System.out.println(num2 >> 4); //0
		
		
	}

}
