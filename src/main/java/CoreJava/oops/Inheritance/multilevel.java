package CoreJava.oops.Inheritance;
class students
{
    public void details()
    {
        String name="Vignesh";
        String Fname="Dhandapani";
    }

}
class College extends students
{
    public void Cdetails()
    {
        String Cname="Karpagam university";
        String Place="Coimbatore";

    }

}
class Degree extends College
{
    public void Course()
    {
        String Degree="BE";
        String Course="Cse";

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
