import javax.swing.*;
public class JComboBox
{
 JFrame f=new JFrame("Combobox Example");
  JComboBox()
  { 
    String country[]={"India","U.S.A","England","France","Australia"};
    JComboBox cb=new JComboBox(country);
    cb.setBounds(50,50,100,30);
    f.add(cb);
    f.setLayout(null);
    f.setSize(300,300);
    f.setVisible(true);
  }
public static void main(String args[])
{
   new JComboBox();
}
}