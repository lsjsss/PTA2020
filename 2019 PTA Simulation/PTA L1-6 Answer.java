import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int line = 0;
		line = input.nextInt();
		if( line<=100 && line>0 ) {
			String[] sa = new String[line+1];
			String password = "";
			
			for(int i=0; i<line+1; i++) {
				sa[i] = input.nextLine();
			}
			
			for(int i=1; i<line+1; i++) {
				String[] sbr = sa[i].split(" ");//选项

				for(int j=0; j<sbr.length; j++) {//单个选项查找
					for(int k=0; k<sbr[j].length(); k++) {//单个选项字母
						if(sbr[j].charAt(k)=='T') {
							int num = 0;
							if(sbr[j].charAt(0)=='A') {
								num = 1;
							}else if(sbr[j].charAt(0)=='B') {
								num = 2;
							}else if(sbr[j].charAt(0)=='C') {
								num = 3;
							}else if(sbr[j].charAt(0)=='D') {
								num = 4;
							}
							password = password+num;
						}
					}
				}
			}
			System.out.println(password);
		}
	}
}
