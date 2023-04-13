import java.util.Random;
import java.lang.Math.*;
class Square extends Thread
{
 int x;
 Square(int n)
 {
 x = n;
 }
 public void run()
 {
 int sqr = x * x;
 System.out.println("Square of " + x + " = " + sqr );
 }
}
class Cube extends Thread
{
 int x;
 Cube(int n)
 {
    x = n;
 }
 public void run()
 {
 int cub = x * x * x;
 System.out.println("Cube of " + x + " = " + cub );
 }
}
class Number extends Thread
{
 public void run()
 {
 Random random = new Random();
 for(int i =0; i<2; i++)
 {
 int num= random.nextInt(10);
 System.out.println("Random Integer generated : " + num);
 Square s = new Square(num);
 s.start();
 Cube c = new Cube(num);
 c.start();
Squareroot s1 = new Squareroot(num);
 s1.start();
 try {
 Thread.sleep(1000);
} catch (InterruptedException ex) {
 System.out.println(ex);
}
 }
 }
}
public class mulThr {
 public static void main(String args[])
 {
 Number n=new Number();
  n.start();
 }
}