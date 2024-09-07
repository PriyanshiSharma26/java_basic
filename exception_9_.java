package exception;

import java.util.Scanner;

class NoDepartmentException extends RuntimeException {
    String msg;
    NoDepartmentException(String msg)
    {
        super(msg);
    }
}
interface college{
    final String college="SGSITS";
    static void showCollege()
    {
      System.out.println("college name is :"+ college);
    }
}
class Department{
    int departmentNumber;
    String departmentName;
    void showDepartmentInfo()
    {
        college.showCollege();
        System.out.println("department no is   "+departmentNumber);
        System.out.println("department name   "+departmentName);
    }
    Department(int departmentNumber,String departmentName)
    {
        this.departmentNumber=departmentNumber;
        this.departmentName=departmentName;
    }

}
class Teacher extends Department implements college{
    Teacher(int departmentNumber,String departmentName)
    {
        super(departmentNumber, departmentName);

    }
    String name;
    void ShowData(String name)
    {
        super.showDepartmentInfo();
        this.name=name;
        System.out.println("teacher name is: "+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter department no ");
        int departmentNum=sc.nextInt();
        sc.nextLine();
        System.out.println("enter department name");
        String departmentName=sc.nextLine();
        if(departmentNum==10||departmentNum==20||departmentNum==30)
        {
            Teacher ob=new Teacher(departmentNum, departmentName);
            ob.ShowData(name);
        }
        else{
            throw new NoDepartmentException("no department is found");
        }
        }
    }

