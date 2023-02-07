import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		if(H>100 && H<=300) {
			double weight = (H-100)*0.9*2;
			System.out.printf("%.1f\n",weight);
		}
	}
}
