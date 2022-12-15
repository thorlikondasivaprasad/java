
abstract class Shape
{
double d1=2,d2=5;
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
double d3=d1*d2;
System.out.println("the area of rect is"+d3);
}
} 

class Triangle extends Shape
{

void printArea()
{
double d3=(1/2)*d1*d2;
System.out.println("the area of triangle is"+d3);
}
}

class Circle extends Shape
{

void printArea()
{
double d3=(3.14)*d1*d1;
System.out.println("the area of circle is"+d3);
}
}


class absdemo
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();

Triangle t=new Triangle();

Circle c=new Circle();
r.printArea();
t.printArea();
c.printArea();
}
}



