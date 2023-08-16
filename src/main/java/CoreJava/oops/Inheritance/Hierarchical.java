package CoreJava.oops.Inheritance;
class Father
{
    public void family()
    {
        String name="Dhandapani";
        String mother="sasikala";
        System.out.println(name);
        System.out.println(mother);
    }
}

class child extends  Father
{
    public void detail()
    {
        String Sname="Vignesh";
        String Sistername="Preethika";
        System.out.println(Sname);
        System.out.println(Sistername);
    }
}
class realtives extends Father
{
    public void Relativedetails()
    {
        int age=25;
        String Rname="Vetrive";
        System.out.println(age);
        System.out.println(Rname);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
//        Father f= new Father();
//        f.family();
        realtives r = new realtives();
        r.Relativedetails();
        r.family();
    }
}
