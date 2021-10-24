package vishnu.assignment.singleton;

public class SingletonClass {
     String str;
    private SingletonClass(String str)
    {
        this.str = str;
    }
    public static SingletonClass singletonObj(String str)
    {
        return new SingletonClass(str);
    }
    public void printString()
    {
        System.out.println("String value is "+str);
    }
}
