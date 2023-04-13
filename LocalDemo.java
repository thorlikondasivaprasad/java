import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo" width=300 height=200></applet>*/
public class LabelDemo extends Applet 
{
Lable one,two,three;
public void init() 
{
one = new Label("One",Label.RIGHT);
two = new Label("Two");
three = new Label("Three");
add(one);
add(two);
add(three);
}
}
