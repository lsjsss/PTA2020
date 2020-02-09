import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		for(int i=0; i<x+y; i++) {
			System.out.print("Wang!");
		}
	}
}
