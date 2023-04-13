import java.applet.*;
import java.awt.*;
import java.io.*;
/*<applet code="ParamDemo" width=300  height=100 >
<param name="name" value="SivaPrasad">
<param name="designation" value="Student">
<param name="department" value="CSE">
<param name="college" value="RVR&JC">
<param name="salary"  value=100000>
</applet>*/
public class ParamDemo extends Applet
{
public void paint(Graphics g)
{
setBackground(Color.cyan);
int d=0;
g.drawString("name :"+getParameter("name"),50,50);
g.drawString("designation :"+getParameter("designation"),50,100);
g.drawString("department :"+getParameter("department"),50,150);
g.drawString("college :"+getParameter("college"),50,200);
d=Integer.parseInt(getParameter("salary"));
g.drawString("salary :"+d,50,250);
}
}
