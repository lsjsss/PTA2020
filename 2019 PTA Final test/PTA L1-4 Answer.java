import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x>0 && x<=100 && y>0 && y<=100 && x>y) {
			int area = 5000 - (100-x)*y - ((100-x)*(100-y))/2 - (x*y)/2;
			System.out.println(area);
		}
	}
}
