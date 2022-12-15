import java.util.Scanner;
class fact
{
int f=1;
int sum=0;
int n;
int res;
Scanner s=new Scanner(System.in);
System.out.println("enter the n value::");
n=s.nextInt();
int factorial(int n)
{

if (n==0 ||n==1)
     return 1;
res=n*(n-1);
return res;

}
void print()
{
System.out.println("the ans is : "+res);
}

public static void main(String[] args)
{
int n;
fact f=new fact();
f.factorial(n);

}
}