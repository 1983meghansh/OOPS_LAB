import java.util.Scanner;

import static java.lang.System.exit;

class address{
    int street_num;
    String city,state,country;
    address(int street_num,String city,String state,String country)
    {
        this.street_num=street_num;
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

class student{
    String usn,name;
    address addr;
    student(String usn,String name,address addr)
    {
        this.name=name;
        this.addr=addr;
        this.usn=usn;
    }
}

class college{
    String name;
    address addr;
    college(String name,address addr) {
        this.addr = addr;
        this.name = name;
    }
}

class employee{
    String empid,name;
    address addr;
    employee(String empid,String name,address addr)
    {
        this.addr=addr;
        this.empid=empid;
        this.name=name;
    }
}


public class prog2 {
    public static void main(String[] args) {

        System.out.println("enter number of objects");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();      //this is done to process enter
        address add[]=new address[n];
        student std[]=new student[n];
        college clg[]=new college[n];
        employee emp[]=new employee[n];
        String usn,name,id;
        for(int i=0;i<n;i++)
        {
            System.out.println("Kindly enter details of student: "+i);
            System.out.println("Name: ");
            name=sc.nextLine();
            System.out.println("USN");
            usn=sc.nextLine();
            System.out.println("enter address of "+name);
            System.out.println("1.street no.\n 2.City\n3.State\n4.Country");

            add[i]=new address(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine());
            std[i]=new student(usn,name,add[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("enter details of employee: "+i);
            System.out.println("employee id: ");
            id=sc.nextLine();
            System.out.println("enter name: ");
            name=sc.nextLine();
            System.out.println("enter the address of "+name);
            System.out.println("1.street no.\n 2.City\n3.State\n4.Country");

            add[i]=new address(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine());
            emp[i]=new employee(id,name,add[i]);
        }
        for (int i=0;i<n;i++)
        {
            System.out.println("enter college details: "+i);
            System.out.println("enter college name: ");
            name=sc.nextLine();
            System.out.println("enter the address of "+name);
            System.out.println("1.street no.\n 2.City\n3.State\n4.Country");
            add[i]=new address(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine());
            clg[i]=new college(name,add[i]);
        }

        while(true){
            System.out.println("1.Student detaols\n2.employee details/n3./college details/nEnter your choice");
            int ch;
            ch=sc.nextInt();
            sc.nextLine();
            switch (ch)
            {
                case 1:
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Name  USN  ADdress");
                        System.out.println(std[i].name+","+std[i].usn+","+std[i].addr.street_num +","+ std[i].addr.state +","+ std[i].addr.city +","+ std[i].addr.country);
                    }
                    break;
                case 2:
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Name  Employee  id  address");
                        System.out.println(emp[i].name+","+emp[i].empid+","+emp[i].addr.street_num+","+emp[i].addr.state+","+emp[i].addr.city+","+emp[i].addr.country);

                    }
                    break;
                case 3:
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("College name  address");
                        System.out.println(clg[i].name+","+clg[i].addr.street_num+","+clg[i].addr.state+","+clg[i].addr.city+","+clg[i].addr.country);
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
