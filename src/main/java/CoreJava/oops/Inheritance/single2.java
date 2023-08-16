package CoreJava.oops.Inheritance;

public class single2  extends single1{
    public void leopard()
    {
        System.out.println("fast animal");
    }
    public static void main(String[] args) {
        single2 s= new single2();
        s.leopard();
        s.tiger();
    }
}
