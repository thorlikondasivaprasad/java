import javax.swing.*;
public class JCombo
{
 JFrame f=new JFrame("Combobox Example");
  JCombo()
  { 
    String country[]={"India","U.S.A","England","France","Australia"};
    JCombo cb=new JCombo(country);
    cb.setBounds(50,50,100,30);
    f.add(cb);
    f.setLayout(null);
    f.setSize(300,300);
    f.setVisible(true);
  }
public static void main(String args[])
{
   new JCombo();
}
}