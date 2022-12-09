class Myemployee
{
  String ename;
  int id;
  int esalary;
  Myemployee()
{
 id=0;
ename="chandni";
esalary=2000;
}
Myemployee(int i,String nm,int salary)
{
 id=i;
 ename=nm;
 esalary=salary;
}
public void display()
{
 System.out.println("employee name: " +ename);
 System.out.println("employee id: "  +id);
 System.out.println("employee salary: "+esalary);
}
}

class EmployeeData
{
  public static void main(String args[])
    {
      System.out.println("the employee details are:");
      Myemployee e1=new Myemployee(1,"sumita",3000);
      Myemployee e2=new Myemployee(2,"ritu",4000);
      Myemployee e3=new Myemployee();
     e1.display();
     e2.display();
     e3.display();
  }
}