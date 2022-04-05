import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age<18)
        {
            System.out.println("You are under age");
        }
        else
        {
            System.out.println("You are eligible for voting");
        }
    }
}
