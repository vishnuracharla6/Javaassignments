package vishnu.assignment1;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
           System.out.println("Required regular expression");
           String regexp = sc.next();
           FileNameSearch f1 = new FileNameSearch();
           f1.search("C:\\Users\\VISHNU\\Documents\\JavaAssignment1\\",regexp);
        }
    }
}

