import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Integer length = 0;
		String nc = input.nextLine();
		String[] ncs = nc.split(" ");
		length = Integer.parseInt(ncs[0]);
		String ch = ncs[1];
		
		if(length<=10000) {
			char c = ch.charAt(0);
			String sc = input.nextLine();
			StringBuilder s = new StringBuilder(sc);
			
			if(sc.length()>=length) {
				String ns = null;
				ns = sc.substring(sc.length()-length, sc.length());
				System.out.println(ns);
			}else if(sc.length()<length){
				StringBuilder ns = null;
				for(int i=0; i<length-sc.length(); i++) {
					ns = s.insert(0, c);
				}
				System.out.println(ns);
			}
		}
	}
}
