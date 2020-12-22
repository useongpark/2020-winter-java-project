package variable;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double dNum = 3.14; // 3.14는 int인데ㅔ double 타입으로 저장된다.
		
		float fNum = 3.14f; // 3.14는 float로 저장될 수 없다.(double이기 때문에) -> 3.14f or 3.14F를 써준다. 
		
		System.out.println(dNum);		
		System.out.println(fNum);
		
		
		// 실수의 오차범위 
		double eNum = 1;
		
		for( int i = 0; i < 10000; i++) {  // i가 0부터 시작해서 10000보다 작은동안 하나씩 증가시켜라
		
			eNum = eNum + 0.1;		
		}
		
		System.out.println(eNum);
		
		
	}

}
