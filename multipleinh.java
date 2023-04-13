import java.util.*;
interface student
{
  void getvalues();
}
interface department extends student
{
  void getattendence();
}
class studentdetails implements department
{
   public String sno,name,sec;
   public double attendence;
public void getvalues()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the register no,,name ,section of student:");
 sno=sc.nextLine();
 name=sc.nextLine();
  sec=sc.nextLine();
}
public void getattendence()
{
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter attendence of student out of 250 classes:");
   attendence=sc.nextDouble();
}
}

class Exam extends studentdetails
{
  double calattendence()
{
 double totalatt=(attendence*100)/250;
 return totalatt;
}
 void booleligible()
{
  if(calattendence() > 75.0)
{
 System.out.println("total attendence is :"+calattendence());
 System.out.println(name +" is eligible for exam");
}
else
{
 System.out.println("total attendence is :"+calattendence());
  System.out.println(name +"is not eligible for exam");
}
}
}
class multipleinh
{
public static void main(String[] args)
{
   Scanner s=new Scanner(System.in);
 System.out.println("Enter no.of students:");
	int n=s.nextInt();
	Exam e[]=new Exam[n];
	for(int i=0;i<n;i++)
	{
	 e[i]=new Exam();
	 e[i].getvalues();
	e[i].getattendence();
	e[i].calattendence();
	e[i].booleligible();
	}
}
}




 