import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteNamesInFile {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Mangalam");
        al.add("Tiwari");
        al.add("Zemoso");
        al.add("Labs");
        try
        {
            PrintWriter pw=new PrintWriter("names.txt");
            for(String s: al)
            {
                pw.println(s);
            }
            pw.close();
        }
        catch (FileNotFoundException exp)
        {
            System.out.println(exp.getMessage());
        }
        Scanner infile;
        try
        {
            infile=new Scanner(new File("names.txt"));
            while (infile.hasNext())
            {
                String n=infile.next();
                System.out.print(n+" ");

            }
            //System.out.println("The sum is: "+sum);
            infile.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Not found");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException mex)
        {
            System.out.println("Mismatch");
            System.out.println(mex.getMessage());
        }
    }
}
