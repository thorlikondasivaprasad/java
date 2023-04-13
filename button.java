import java.util.*;
import javax.swing.*;

class Application 
{
    Application()
    {
        JFrame jf=new JFrame("Demo");
	
        JButton b1=new JButton("Pavan");
	
	t1.setBounds(0,100,50,50);
	JLabel l=new JLabel("LOGIN FORM",Label.CENTER);
	b1.setBounds(100,100,150,50);
        JButton b2=new JButton("santosh");
	b2.setBounds(100,150,150,50);        
	JButton b3=new JButton("Sai");
	b3.setBounds(100,200,150,50);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
	jf.add(l);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(300,300);
    }
    public static void main(String args[]){
        new Application();
    }
}

