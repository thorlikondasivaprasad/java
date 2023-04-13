/*<applet code="MyApplet2" width=300 height=300></applet>*/

import java.awt.*;
import java.io.*;
import java.applet.*;


public class MyApplet2 extends Applet
{
public void init()
{
   System.out.println("init");
}
public void start()
{
System.out.println("start");
}
public void paint(Graphics g)
{
  System.out.println("paint method");
}
public void stop()
{
System.out.println("stop");
}
public void destroy()
{
System.out.println("destroy");
}
}