import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] line = new String[number+1];
		
		for(int i=0; i<number+1; i++) {
			line[i] = input.nextLine();
		}
		
		for(int i=1; i<number+1; i++) {
			String[] sline = line[i].split(" "); 
			
			String name = sline[0];
			int f = Integer.parseInt(sline[1]);
			int m = Integer.parseInt(sline[2]); 
			
			if((f<15 || f>20) || (m<50 || m>70)) {
				System.out.println(name);
			}
		}
	}
}
