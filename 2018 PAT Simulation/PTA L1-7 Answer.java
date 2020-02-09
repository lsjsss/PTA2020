import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int[] height = new int[number];
    int[] weight = new int[number];
      if(number<=20 && number>0) {
        for(int i=0; i<number; i++) {
          height[i] = input.nextInt();
          weight[i] = input.nextInt();
        }
        for(int i=0; i<number; i++) {
        if(height[i]>120 && height[i]<200 && weight[i]>50 && weight[i]<=300) {
          double fweight = (height[i]-100)*0.9*2;
          if(Math.sqrt(Math.pow(weight[i]-fweight, 2))<fweight*0.1) {
              System.out.println("You are wan mei!");
          }else if(weight[i]-fweight>0){
              System.out.println("You are tai pang le!");
          }else if(weight[i]-fweight < 0) {
              System.out.println("You are tai shou le!");
          }
        }
      }
    }
  }
}
