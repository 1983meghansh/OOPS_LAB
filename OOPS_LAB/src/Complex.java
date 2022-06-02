import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real and imaginary part of 1st number: ");
        int tempReal=sc.nextInt();
        int tempimag=sc.nextInt();
        Complex1 C1=new Complex1(tempReal,tempimag);
        C1.display();
        System.out.println("enter real and imaginary part of 2nd number: ");
         tempReal=sc.nextInt();
         tempimag=sc.nextInt();
        Complex1 C2=new Complex1(tempReal,tempimag);
        C2.display();
        System.out.println("after addition: ");
        Complex1 ans=new Complex1();
        ans=ans.addn(C1,C2);
        ans.display();

    }
}
class Complex1
{
    int real,imag;  //member variables
    Complex1()   //empty/non parameterised constructor
    {

    }
    Complex1(int real1,int imag1)            //parameterised constructor ->initialise the data members
    {
        real=real1;
        imag=imag1;
    }
    Complex1 addn(Complex1 C1,Complex1 C2)          //add method by passing object as parameter
    {
        Complex1 obj=new Complex1();
        obj.real=C1.real+ C2.real;
        obj.imag=C1.imag+ C2.imag;
        return obj;
    }

    void display()
    {
        System.out.println("Complex NUmber:"+real+"+"+imag+"i");
    }
}

