package variable;

public class IntegerTest {

	public static void main(String[] args) {
	
	
		byte bs = -128; // 표현할 수 있는 범위안에서 가능 byte = -128 ~ 127
		
		int iVal = -2147483; // int = -2147483648 ~ -2147483647
		
		long Ival = 12345678900L; // value 끝에 L or ㅣ -> long으로 취급
		
		System.out.println(bs);
		System.out.println(iVal);
		System.out.println(Ival);
		
		
	}
	
}