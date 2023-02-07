import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		String[] poet = new String[line+1];
		String[] poetl;
		String[] poetf = new String[line+1];
		String[] poets = new String[line+1];
		String[] poetfd;
		String[] poetsd;
		
		for(int i=0; i<line+1; i++) {
			poet[i] = input.nextLine();
		}
		
		for(int i=1; i<line+1; i++) {
			poetl = poet[i].split(",");
			poetf[i] = poetl[0];
			poets[i] = poetl[1];
			
			poetfd = poetf[i].split(" ");
			poetsd = poets[i].split(" ");
			
			if(Pattern.matches(".*ong", poetfd[poetfd.length-1]) && Pattern.matches(".*ong.*", poetsd[poetsd.length-1])) {
				poetsd[poetsd.length-3] = "qiao";
				poetsd[poetsd.length-2] = "ben";
				poetsd[poetsd.length-1] = "zhong";
				
				for(int f=0; f<poetfd.length-1; f++) {
					System.out.print(poetfd[f]+" ");
				}
				System.out.print(poetfd[poetfd.length-1]+",");
				
				for(int s=0; s<poetsd.length-1; s++) {
					System.out.print(poetsd[s]+" ");
				}
				System.out.print(poetsd[poetsd.length-1]+".");
				System.out.println();
				
			}else {
				System.out.println("Skipped");
			}
		}
	}
}
