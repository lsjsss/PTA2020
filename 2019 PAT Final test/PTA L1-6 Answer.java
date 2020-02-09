import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int err=0;
		
		if(num<=100) {
			int[] number = new int[num];
			
			for(int i=0; i<num; i++) {
				number[i] = input.nextInt();
				if(number[i]<=100000 && number[i]>=999999) {
					err++;
				}
			}
			
			for(int i=0; i<num; i++) {
				int[] nums = new int[6];
				
				for(int j=0; j<nums.length; j++) {
					nums[j] = (int) ((number[i]/Math.pow(10, j))%10);
				}
				
				if(nums[0]+nums[1]+nums[2]==nums[3]+nums[4]+nums[5]) {
					System.out.println("You are lucky!");
				}else {
					System.out.println("Wish you good luck.");
				}
			}
		}
	}
}
