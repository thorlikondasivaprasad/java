import java.util.Scanner;
interface student
{
	void getvalue();
}
interface department extends student
{
	int getattendence();
}
class Exam implements department
{
	public String sno,sname,classsec;
	public int attendence,att;
	Scanner s=new Scanner(System.in);
	public void getvalue()
	{
	   System.out.println("Enter the s.no, sname ,class of student::");
	   sno=s.nextLine();
	   sname=s.nextLine();
	   classsec=s.nextLine();
	}
	
	public int getattendence()
	{ 
	   System.out.println("Enter the  attendence::");
	   
	   attendence=s.nextInt();
		return attendence;
	}
	
	String calculateattendence(int a)
	{
	  if (a>75)
		{
			String z="eligible";
			return z;
		}
	  else 
		{
			String z=" not eligible ";
			return z;
		}
	}
	void booleligible(String d)
	{
	    System.out.println(sname+"is"+d);
	}
}
class Interfaces
{
public static void main(String[] args)
{
int a;
String d;
Exam e=new Exam();
e.getvalue();
a=e.getattendence();
d=e.calculateattendence(a);
e.booleligible(d);
}
}












 