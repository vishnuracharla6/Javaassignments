package vishnu.assignment7.cycle;
class Cycle
{
    void CycleType()
    {
        System.out.println("it is to decide to cycletype");
    }
}
class Unicycle extends Cycle
{
    void CycleType()
    {
        System.out.println("it is UniCycle");
    }
    void Balance()
    {
        System.out.println("It is balanced through one wheel");
    }
}
class Bicycle extends Cycle
{
    void CycleType()
    {
        System.out.println("it is Bicycle");
    }
    void Balance()
    {
        System.out.println("It is balanced through two wheel");
    }
}
class Tricycle extends Cycle
{
    void CycleType()
    {
        System.out.println("it is tricycle");
    }
}
public class CastingExample
{
    public static void main(String args[]) {
        Cycle cycle[] = new Cycle[3];
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();  //upcasting
        //cycle[1].Balance();

        Bicycle bicycle = (Bicycle)cycle[1];    // downCasting

        bicycle.Balance();



    }


}
