package vishnu.assignment7.cyclefactory;
interface Cycle
{
    void NoOfWheels();
}
class UniCycle implements Cycle
{
    public void NoOfWheels()
    {
        System.out.println("It contains only one wheel");
    }
}

class UniCycleFactory
{
    UniCycle Manufacturing()
    {
        return new UniCycle();
    }
}

class BiCycle implements Cycle
{
    public void NoOfWheels()
    {
        System.out.println("It contains Two wheels");
    }
}

class BiCycleFactory
{
    BiCycle Manufacturing()
    {
        return new BiCycle();
    }
}

class TriCycle implements Cycle
{
    public void NoOfWheels()
    {
        System.out.println("It contains  Three wheels");
    }
}

class TriCycleFactory
{
    TriCycle Manufacturing()
    {
        return new TriCycle();
    }
}

public class CyclesFactory{

    public static void main(String[] args)
    {
        UniCycleFactory u1 = new UniCycleFactory();
        u1.Manufacturing().NoOfWheels();
        BiCycleFactory B1 = new BiCycleFactory();
        B1.Manufacturing().NoOfWheels();
        TriCycleFactory T1 = new TriCycleFactory();
        T1.Manufacturing().NoOfWheels();
    }
}
