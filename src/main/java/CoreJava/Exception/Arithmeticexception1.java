package CoreJava.Exception;

public class Arithmeticexception1 {
    public static void main(String[] args) {
      try
      {
          int a=100;
          int b=0;
          int c=a/b;
          System.out.println(c);


      }
      catch (ArithmeticException e)
      {
          System.out.println(e);
      }
    }
}
