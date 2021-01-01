package operator;

public class OperatorEx2 {

	public static void main(String[] args) {

		// short circuit evaluation(단락 회로 평가)
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10)<10) && ((i = i + 2)<10);
		// 앞에 껏만 봐도 평가가 된다 -> short circuit evaluation
		System.out.println(num1);
		System.out.println(i);
		System.out.println(value); // false
		
		// 삼항 연산자
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3)? num2: num3;
		
		System.out.println(max); 
		
		
		
		
		
		
		
	}

}
