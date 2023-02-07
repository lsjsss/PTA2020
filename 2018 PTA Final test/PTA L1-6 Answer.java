import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String sn = input.nextLine();
		
		String[] s = sn.split(" ");
		char ct = s[0].charAt(0);
		Integer line = Integer.parseInt(s[1]);
		String[] sc = new String[line+1];
		int length = 0;
		int err = 0;
		
		for(int i=0; i<line; i++) {
			sc[i] = input.nextLine();
			if(sc[i].length()>length) {
				length = sc[i].length();
			}
		}
		
		char[][] c = new char[line][length];
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<length; j++) {
				c[i][j]=sc[i].charAt(j);
				if(c[i][j]!=' ') {
					c[i][j]=ct;
				}
			}
		}
		
		for(int i=1; i<line; i++) {
			for(int j=1; j<length; j++) {
				if(c[i][j]!=c[line-i-1][length-j-1]) {
					err++;
				}
			}
		}
		
		if(err!=0) {
			for(int i=line-1; i>=0; i--) {
				for(int j=length-1; j>=0; j--) {
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
		}else {
			System.out.println("bu yong dao le");
			for(int i=line-1; i>=0; i--) {
				for(int j=length-1; j>=0; j--) {
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
		}
	}
}
