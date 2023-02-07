import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		
		while(input.hasNext()) {
			x = input.nextInt();
			y = input.nextInt();
			
			if(x<=1000 && y<=1000 && x>0 && y>0) {
				ada(x, y);
			}
		}
	}
	
	public static void ada(int x,int y) {
		int add = x * y;
		String s = ""+add;
		String newadd = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			newadd = newadd + s.charAt(i);
		}
		int a = Integer.parseInt(newadd);
		
		System.out.println(a);
	}
}
