import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		int newday = 0;
		
		if(day<=7 && day>=1) {
			newday = day+2;
			if(newday>7) {
				newday = newday-7;
				System.out.println(newday);
			}else {
				System.out.println(newday);
			}
		}
	}
}
