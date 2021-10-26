package vishnu.assignment7.interfaceinheritance;
interface Interface_1{
    void method_1();
    void method_2();
}
interface Interface_2 {
    void method_3();
    void method_4();
}
interface Interface_3 {
    void method_5();
    void method_6();
}
interface Combined_Interface extends Interface_1,Interface_2,Interface_3{
    public void new_method();
}
class Concrete_class {
    public void print(){
        System.out.println("This is a concrete class method");
    }
}
class NewClass extends Concrete_class implements Combined_Interface{

    @Override
    public void new_method() {
        System.out.println("new method");
    }

    @Override
    public void method_1() {
        System.out.println("method 1");
    }

    @Override
    public void method_2() {
        System.out.println("method 2");
    }

    @Override
    public void method_3() {
        System.out.println("method 3");
    }

    @Override
    public void method_4() {
        System.out.println("method 4");
    }

    @Override
    public void method_5() {
        System.out.println("method 5");
    }

    @Override
    public void method_6() {
        System.out.println("method 6");
    }
    public void parameterizedMethod1(Interface_1 interface1){
        interface1.method_1();
    }
    public void parameterizedMethod2(Interface_2 interface_2){
        interface_2.method_3();
    }
    public void parameterizedMethod3(Interface_3 interface_3){
        interface_3.method_5();
    }
    public void parameterizedMethod4(Combined_Interface combined_interface){
        combined_interface.new_method();
    }
}
public class Main {
    public static void main(String args[])
    {
        NewClass newclass = new NewClass();
        newclass.parameterizedMethod1(newclass);
        newclass.parameterizedMethod2(newclass);
        newclass.parameterizedMethod3(newclass);
    }
}
