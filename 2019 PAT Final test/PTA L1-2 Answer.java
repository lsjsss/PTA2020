import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String se = "";
		
			se = input.nextLine();
			StringBuilder s = new StringBuilder(se);
			int err=0;
			
			if(s.length()>0&&s.length()<=1000) {
				for(int i=0; i<s.length(); i++) {
					if((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)==' ')) {
						
					}else {
						err++;
					}
				}
			}else {
				err++;
			}
			
			if(err==0) {
				change(s);
			}
		}
	
	public static void change(StringBuilder s) {
		if(s.length()<=1000) {
					int begin=0, end=0;
					for(int i=0; i<s.length(); i++) {
						if(s.charAt(i)=='6') {
							begin = i;
							for(int j=i+1; j<s.length();j++) {
								if(s.charAt(j)=='6') {
									end = j+1;
									if(end==s.length()) {
										i=s.length()-1;
										break;
									}
								}else {
									i=j-1;
									break;
								}
							}
							if(end-begin>3&&end-begin<=9) {
								s.delete(begin, end);
								s.insert(begin, '9');
								i=begin;
							}else if(end-begin>9) {
								s.delete(begin, end);
								s.insert(begin, "27");
								i=begin;
							}
						}
					}
					
					System.out.println(s);
				}
	}
}
