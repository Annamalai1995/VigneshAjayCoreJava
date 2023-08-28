package CoreJava.oops.Inheritance;
class students
{
    public void details()
    {
        String name="Vignesh";
        String Fname="Dhandapani";
        System.out.println("Name is:"+name+""+Fname);
    }

}
class College extends students
{
    public void Cdetails()
    {
        String Cname="Karpagam university";
        String Place="Coimbatore";
        System.out.println("College name is :"+Cname+""+Place);

    }

}
class Degree extends College
{
    public void Course()
    {
        String Degree="BE";
        String Course="Cse";
        System.out.println("Degress:"+Degree+""+Course);

    }
}



public class multilevel {
    public static void main(String[] args) {
        Degree dd = new Degree();
        dd.details();
        dd.Cdetails();
        dd.Course();
    }

}
