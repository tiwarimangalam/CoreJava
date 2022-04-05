import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Input in=new Input();
        int a1=in.nextInt();
        int a2=in.nextInt();
        int a3=in.nextInt();
        int average=(a1+a2+a3)/3;
        System.out.println("The average of the numbers is: "+average);
    }
}
