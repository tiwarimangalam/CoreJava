import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String s1="Mangalam Tiwari";
        String s2="Mangalam Tiwari";
        String s3=s1.toLowerCase(Locale.ROOT);// convert the string into lowerCase
        String s4=s1.toUpperCase(Locale.ROOT);// convert the string into upperCase
        System.out.println(s3+" : "+s4);
        int loc=s1.indexOf('a');
        System.out.println("The location of the char a is: "+loc);
        String s5=s1.substring(3);
        System.out.println("The substring starting from index 3 is: "+s5);
    }
}
