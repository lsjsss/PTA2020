import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> s = new ArrayList<String>();

		int count = 0;
		while(true) {
			String sc = input.nextLine();
			
			if(sc.equals(".")) {
				break;
			}
			count++;
			s.add(sc);
		}
		
		if(count<2) {
			System.out.println("Momo... No one is for you ...");
		}else if(count>=2 && count<14) {
			System.out.printf("%s is the only one for you...",s.get(1));
		}else {
			System.out.printf("%s and %s are inviting you to dinner...",s.get(1), s.get(13));
		}
	}
}
