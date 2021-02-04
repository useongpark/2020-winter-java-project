package conditionalstatement;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		// 등수에 따른 메달
		
		Scanner scanner = new Scanner (System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = '금';
				System.out.println("금메달");
				break; // break를 쓰지 않으면 case 3의 print문까지 다 출력
			case 2: medalColor = '은';
				System.out.println("은메달");
				break;
			case 3: medalColor = '동';
				System.out.println("동메달");
				break;
			default : medalColor = 'N'; // default를 쓰지 않으면 char medalColor에 지정된 값을 넣어줘야함.
		}
			
		System.out.println(rank + "등은 " + medalColor + "메달입니다");
		
		// 각 월에 따른 한달 날짜 수 (단, 2월은 28일까지)
		
		Scanner sc = new Scanner (System.in);
		
		int month = sc.nextInt();
		int day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 같은 결과의 수행문은 하나로 묶을 수 있다.
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default :
				System.out.println("error");
				day = 0;
		}
		System.out.println(month + "월은 " + day + "일입니다.");
		
		
	}

}
