package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = -10;
		int num2 = 20;
		// +연산자는 부호 그대로이다
		System.out.println(+num1); // -10
		System.out.println(+num2); // 20
		// -연산자는 부호가 바뀐다
		System.out.println(-num1); // 10
		System.out.println(-num2); // -20
		// 결과값이 바뀌진 않는다.
		System.out.println(num1); // -10
		System.out.println(num2); // 20
		
		// 결과값 바꾸게 하는 법(값을 설정해야 한다.)
		num1 = -num1;
		num2 = -num2;
		
		
		// 사칙연산
		int num = 10%3;
		int num22 = 18/3;
		int num3 = 13 + 4;
		int num4 = 15 - 16;
		
		System.out.println(num);
		System.out.println(num22);
		System.out.println(num3);
		System.out.println(num4);
		
		// 대입 연산자
		
		
		
		
	}
}