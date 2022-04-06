import java.util.Locale;

public class StringFun {
    public static void main(String[] args) {
        String s1="Mangalam Tiwari";
        String s2="Mangalam Tiwari";
        if(s1.equals(s2))
        {
            System.out.println("Both have same name");
        }
        else
        {
            System.out.println("Both have not same name");
        }
        for(int i=0;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println();
        if(s1.compareTo(s2)>0)
        {
            System.out.println("The string s1 is greater than s2");
        }
        else
        {
            System.out.println("The string s1 is either equal or less than s2");
        }
        String s3=s1.toLowerCase(Locale.ROOT);
        String s4=s1.toUpperCase(Locale.ROOT);
        System.out.println(s3+" : "+s4);
    }
}
