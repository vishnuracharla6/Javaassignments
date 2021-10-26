package vishnu.assignment6;

public class Overloaded {
    private int value;
    Overloaded(){
        this(10);
        System.out.println("Overloaded constructor without parameters");
    }
    Overloaded(int value){
        this.value=value;
        System.out.println("Overloaded constructor called with value:"+value);
    }
}
