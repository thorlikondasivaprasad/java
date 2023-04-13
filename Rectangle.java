import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangle" width=300 height=200>
</applet>
*/
public class Rectangle extends Applet {
public void paint(Graphics g) 
{
setBackground(Color.pink);
g.drawRect(10, 10, 60, 90);
g.fillRect(100, 10, 60, 90);
g.drawRoundRect(190, 10, 60, 50, 15, 15);
g.fillRect(70, 90, 60, 100);
}
}
