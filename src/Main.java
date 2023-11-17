
import java.util.Scanner;
public  class Main{
    public static void main(String[] args) {
        int m1,m2,m3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for m1");
        m1=scanner.nextInt();
        System.out.println("Enter the marks for m2");
        m2=scanner.nextInt();
        System.out.println("Enter the marks for m3");
        m3=scanner.nextInt();
        float average=(float) (m1+m2+m3)/3;
        System.out.println(average);
        if(average>70){
            System.out.println("You got A grade");
        } else if (average<=70 && average>60) {
            System.out.println("You got B grade");
        }
        else if (average<=60 && average>50){
            System.out.println("You got grade C");
        }
        else {
            System.out.println("You are not a good student");
        }
    }
}
