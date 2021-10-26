package vishnu.assignment7.rodent;
abstract class Rodents
{
    Rodents()
    {
        System.out.println("This class  is about Rodents ");
    }
    public abstract void RodentColor();
    public abstract void ShortLimbs();
    public abstract void RobustBodies();
}
class Mouse extends Rodents
{
    Mouse()
    {
        System.out.println("This class is about Mouse");
    }
    public void RodentColor()
    {
        System.out.println("Mouse generally in black color");
    }
    public void ShortLimbs()
    {
        System.out.println("Mouse have short Limbs");
    }
    public void RobustBodies()
    {
        System.out.println("Mouse have RobustBodies");
    }
}
class Gerbil extends Rodents
{
    Gerbil()
    {
        System.out.println("This class is about Gerbil");
    }
    public void RodentColor()
    {
        System.out.println("Gerbil generally in gold color");
    }
    public void ShortLimbs()
    {
        System.out.println("Gerbil have short Limbs");
    }
    public void RobustBodies()
    {
        System.out.println("Gerbil have RobustBodies");
    }
}class Squirrels extends Rodents
{
    Squirrels()
    {
        System.out.println("This class is about Squirrels");
    }
    public void RodentColor()
    {
        System.out.println("Squirrels generally in brown color");
    }
    public void ShortLimbs()
    {
        System.out.println("Squirrels have short Limbs");
    }
    public void RobustBodies()
    {
        System.out.println("Squirrels have RobustBodies");
    }
}
public class RodentMain
{
  public static void main(String args[])
  {
      Rodents rodent[] = new Rodents[3];
      rodent[0] = new Mouse();
      rodent[1] = new Gerbil();
      rodent[2] = new Squirrels();
      for(Rodents r: rodent)
      {
          r.RodentColor();
          r.ShortLimbs();
          r.RobustBodies();
      }

  }



}


