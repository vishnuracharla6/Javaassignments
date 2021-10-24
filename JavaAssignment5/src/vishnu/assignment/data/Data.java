package vishnu.assignment.data;

public class Data {
    int id;
    char c;
    public void printUnInitialized()
    {
        System.out.println("UnInitialized int member "+id);
        System.out.println("UnInitialized char member "+c);
    }
    public void localMethod()
    {
        int id;
        char ch;
        System.out.println("UnInitialized LocalInt value "+ id);  //must be initialized
        System.out.println("UnInitialized LocalChar member "+ ch); //must be initialized
    }
}
