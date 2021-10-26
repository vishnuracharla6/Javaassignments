package vishnu.assignment7.innerclass;
class Outer1
{
    String str;
    class Inner1
    {
        Inner1(String s)
        {
          str = s;
          System.out.println(str);
        }
    }
}
class Outer2
{
    class Inner2 extends Outer1.Inner1
    {
        Inner2(String s)
        {
            new Outer1().super(s);
        }
    }
}
public class InnerClass {

    public static void main(String args[])
    {
        Outer2 outer = new Outer2();
        Outer2.Inner2 Obj = outer.new Inner2("this is vishnu");

    }
}
