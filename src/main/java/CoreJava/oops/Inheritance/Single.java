package CoreJava.oops.Inheritance;

class Tiger
{
    public void hunt()
    {
        System.out.println("Tiger is hunting the bear");
        String Name="Vicky";
        System.out.println(Name);

    }

}
class Leapord extends  Tiger
{
    public void Running()
    {
        System.out.println("Leapard is the fastest running animal");
    }
}



public class Single {
    public static void main(String[] args) {
     Leapord l=new Leapord();
     l.Running();
     l.hunt();





    }
}
