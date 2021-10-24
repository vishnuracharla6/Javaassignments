package vishnu.assignment8;
import java.util.*;
import java.lang.Exception;
class ExceptionOne extends Exception
{
    ExceptionOne(String str)
    {
        super(str);
    }
}
class ExceptionTwo extends Exception
{
    ExceptionTwo(String str)
    {
        super(str);
    }
}
class ExceptionThree extends Exception
{
    ExceptionThree(String str)
    {
        super(str);
    }
}
public class Main {
     static void checkException(int l) throws Exception
     {   if(l==1)
          {
                   throw new ExceptionOne("exception one");
          }
          if(l==2)
          {
                     throw new ExceptionTwo("exception two");
          }
          if(l>=3)
          {
                      throw new ExceptionThree("exception three");
          }
          else
                       throw new NullPointerException();
     }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = null;
        try
        {    //str = sc.next();
             checkException(str.length());
        }
        catch(Exception e)
        {
            System.out.println("catch block executed");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block executed");
        }

    }
}
