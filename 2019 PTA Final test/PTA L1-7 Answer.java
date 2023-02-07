import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		int[] sex = new int[line];
		int[] height = new int[line];
		int[] weight = new int[line];
		int err = 0;
		
		if(line<=10) {
			for(int i=0; i<line; i++) {
				sex[i] = input.nextInt();
				height[i] = input.nextInt();
				weight[i] = input.nextInt();
			}
			
			for(int i=0; i<line; i++) {
				if(sex[i]!=0 && sex[i]!=1 && height[i]<=0 && height[i]>200 && weight[i]<=0 && weight[i]>200) {
					err++;
				}
			}
			if(err==0) {
				for(int i=0; i<line; i++) {
					if(sex[i]==0) {
						if(height[i]==129) {
							System.out.print("wan mei! ");
						}else if(height[i]<129) {
							System.out.print("duo chi yu! ");
						}else if(height[i]>129) {
							System.out.print("ni li hai! ");
						}
						if(weight[i]==25) {
							System.out.print("wan mei!");
						}else if(weight[i]<25) {
							System.out.print("duo chi rou!");
						}else if(weight[i]>25) {
							System.out.print("shao chi rou!");
						}
					}else {
						if(height[i]==130) {
							System.out.print("wan mei! ");
						}else if(height[i]<130) {
							System.out.print("duo chi yu! ");
						}else if(height[i]>130) {
							System.out.print("ni li hai! ");
						}
						if(weight[i]==27) {
							System.out.print("wan mei!");
						}else if(weight[i]<27) {
							System.out.print("duo chi rou!");
						}else if(weight[i]>27) {
							System.out.print("shao chi rou!");
						}
					}
					System.out.println();
				}
			}
		}
	}
}
