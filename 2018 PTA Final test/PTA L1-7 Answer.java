import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int ga = input.nextInt();
		int gb = input.nextInt();
		
		if( ga>0 && ga<=1000 && gb>0 && gb<=1000 ) {
			int pa = input.nextInt();
			int pb = input.nextInt();
			int pc = input.nextInt();
			
			if((pa==0||pa==1)&&(pb==0||pb==1)&&(pc==0||pc==1)) {
				if(ga > gb) {
					if(pa+pb+pc == 3) {
						System.out.println("The winner is b: "+gb+" + 3");
					}else {
						System.out.println("The winner is a: "+ga+" + "+(3-pa-pb-pc));
					}
				}else {
					if(pa+pb+pc == 0) {
						System.out.println("The winner is a: "+ga+" + 3");
					}else {
						System.out.println("The winner is b: "+gb+" + "+(pa+pb+pc));
					}
				}
			}
		}
	}
}
