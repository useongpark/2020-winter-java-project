package variable;

public class ImplicitTypeConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum); // 정상 출
		
		
		int iNum2 = 20; // 20.0으로 출력됌 
		float fNum = iNum2;
		
		System.out.println(fNum);
		System.out.println(iNum2);
		
		
		/*	
		 
		double dNum;
		dNum - fNum + iNum; // 두번의 형변환 일어남 (정수->float->double)
				
		System.out.println(dNum); // 30.0 출력
		
		*/
	
	}

}
