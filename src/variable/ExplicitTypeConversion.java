package variable;

public class ExplicitTypeConversion {

	public static void main(String[] args) {

		
		int i = 1000;
	  //byte bNum = i; -> compile type miss 
		byte bNum = (byte)i; // 명시적으로 타입을 써준다.(데이터 유실 발생 할 수 있다.)
		
		System.out.println(bNum); // -24
		
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum; // 1+0=1 -> 데이터 유
		int iNum2 = (int)(dNum1 + fNum); // 2.1 -> 2 (소수점 빠짐)-> 데이터 유
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
		
		
		
		
	}

}
