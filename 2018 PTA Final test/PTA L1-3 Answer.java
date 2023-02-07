import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int price = input.nextInt();
		int distount = input.nextInt();
		
		if(price<=10000 && price>0 && distount>=1 && distount<=9) {
			System.out.printf("%.2f", price * distount * 0.1);
		}
	}
}
