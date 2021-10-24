package vishnu.assignment.main;
import vishnu.assignment.singleton.SingletonClass;
import vishnu.assignment.data.Data;
public class Main {

    public static void main(String[] args)
    {
        Data d = new Data();
        d.printUnInitialized();
        d.localMethod();  // shows the error
        SingletonClass s1 = SingletonClass.singletonObj("Hi vishnu");
        s1.printString();

    }

}
