import javax.swing.*;  
public class JCheckBox1
{  
JCheckBox1()
{  
JFrame f= new JFrame("CheckBox Example");  

JCheckBox checkBox1 = new JCheckBox("PYTHON");  
        checkBox1.setBounds(100,50, 50,50);  

JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,100, 50,50);  
JCheckBox checkBox3 = new JCheckBox("C ", true);  
        checkBox3.setBounds(100,150, 50,50);  
f.add(checkBox1);  
f.add(checkBox2);  
f.add(checkBox3);  
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);  
     }  
       public static void main(String args[])  
    {  
       new JCheckBox1();  
    }
}  
