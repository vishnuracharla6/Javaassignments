package vishnu.assignment2;
import java.util.*;
public class Main {
    public static void check(String str)
    {  boolean[] visited = new boolean[26];
        int index = 0;
        int count = 0;
       for(int i = 0;i<str.length();i++)
       {
           if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
               index = str.charAt(i) - 'a';
           } else if (str.charAt(i) <= 'A' && str.charAt(i) <= 'Z') {
               index = str.charAt(i) - 'A';
           }
           if (!visited[index]) {
               visited[index] = true;
               count++;
           }
       }
       if(count == 26)
           System.out.println("String contain all the alphabets ");

       else
           System.out.println("String does n't contain all the alphabets ");

    }
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        check(str);


    }
}
