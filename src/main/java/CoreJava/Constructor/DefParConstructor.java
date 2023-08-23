package CoreJava.Constructor;

public class DefParConstructor {
    String AccountHolderName;
    Long AccountNo;
    double AccountBalance;

    public  DefParConstructor()//Default constructor
    {
        System.out.println("Welcome to Default Constructor");
        AccountHolderName="Annamalai";
        AccountBalance=8900.0;
        AccountNo=607196538209l;
        System.out.println("AccountHolder is :"+AccountHolderName+"\n AccountBalance :"+AccountBalance+"\n Account Number :"+AccountNo);
    }
    public DefParConstructor(String AccountHolderName,Long Accountno,Double AccountBalance)
    {
        this.AccountHolderName=AccountHolderName;//
        AccountNo=Accountno;
        this.AccountBalance=AccountBalance;
        System.out.println("AccountHolder is :"+AccountHolderName+"\n AccountBalance :"+AccountBalance+"\n Account Number :"+Accountno);
    }
    public static void main(String[] args)
    {
//        Classname objname=bnew Constructorname(or)MethodName;
        DefParConstructor def=new DefParConstructor();//Initialization an object is called constructor
        DefParConstructor def1=new DefParConstructor("SAm",978937837763l,89000.0);

    }

}

