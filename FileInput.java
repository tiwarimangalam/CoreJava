import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        Scanner infile;
        int sum=0;
        try
        {
            infile=new Scanner(new File("input.txt"));
            while (infile.hasNext())
            {
                int n=infile.nextInt();
                //System.out.print(n+" ");
                sum+=n;
            }
            System.out.println("The sum is: "+sum);
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
