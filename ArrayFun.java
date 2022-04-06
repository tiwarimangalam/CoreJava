import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFun {
    public static void main(String[] args) {
        int [] array;
        array=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array: ");
        for(int i=0;i<array.length;i++)
        {
            int val=sc.nextInt();
            array[i]=val;
        }
        System.out.print("The array is: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        ArrayList<String> name=new ArrayList<>();
        name.add("Mangalam");
        name.add("Tiwari");
        name.add("GLB");
        for (int i=0;i<name.size();i++)
        {
            System.out.print(name.get(i)+" ");
        }
        String s="202";
        System.out.println();
        int n=Integer.parseInt(s)+10;
        System.out.println(n);
    }
}
