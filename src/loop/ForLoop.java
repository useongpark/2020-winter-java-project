package loop;

public class ForLoop {

	public static void main(String[] args) {
		// for loop
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) { // 횟수만 필요하면 보통 0에서 시작. // i를 많이 씀 
			sum += count;
			count++;
		}
		System.out.println(sum); // 55
		
		// < 를 <= 보다 더 많이 씀. usually
		
		
		// while loop 하고 비교 
		int num = 1;
		int total = 0; 
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total); // 55
		
		
		
	}

}
