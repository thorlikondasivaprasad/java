import javax.swing.*; 

class JLabelExample
{  
public static void main(String args[])  
{  
JFrame f= new JFrame("JLabel Example"); 

JLabel l1,l2,l3;  

    l1=new JLabel("THORLIKONDA");  
    l1.setBounds(50,50, 100,20);  

    l2=new JLabel("SIVA");  
    l2.setBounds(70,70, 100,30); 

    l3=new JLabel("PRASAD.");  
    l3.setBounds(90,90, 100,40); 

f.add(l1); 
f.add(l2); 
f.add(l3);

f.setSize(300,300);  
f.setLayout(null); 
f.setVisible(true);  
}  
}  
