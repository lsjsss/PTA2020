import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String times = input.nextLine();
		String[] time = times.split(":");
		int hour = Integer.parseInt(time[0]);
		int minuts = Integer.parseInt(time[1]);
		
		if((hour>=0 && hour<12) || (hour==12 && minuts==0)) {
			if(minuts<10 && hour<10) {
				System.out.printf("Only 0%d:0%d.  Too early to Dang.",hour,minuts);
			}else if(minuts<10) {
				System.out.printf("Only %d:0%d.  Too early to Dang.",hour,minuts);
			}else if(hour<10) {
				System.out.printf("Only 0%d:%d.  Too early to Dang.",hour,minuts);
			}else{
				System.out.printf("Only %d:%d.  Too early to Dang.",hour,minuts);
			}
		}else {
			if(hour==12 && minuts==0) {
				System.out.println("Dang");
			}else if(minuts == 0) {
				for(int i=0; i<hour-12; i++) {
					System.out.print("Dang");
				}
				System.out.println();
			}else {
				for(int i=0; i<hour-11; i++) {
					System.out.print("Dang");
				}
				System.out.println();
			}
		}
	}
}
