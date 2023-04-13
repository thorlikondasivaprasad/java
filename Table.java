import javax.swing.*;
public class Table
{
   JFrame f=new JFrame();
   Table()
   {
     String data[][]={{"117","sampath","100000"},
					  {"113","sam","200000"},
					  {"104","sachin","200400"}};
		String column[]={"ID","NAME","SALARY"};
    JTable jt=new JTable(data,column);
    jt.setBounds(30,30,50,50);	
	JScrollPane sp=new JScrollPane(jt);
	f.add(sp);
	f.setSize(100,100);
	f.setVisible(true);
   }
   public static void main(String args[])
  {
    new Table();
  }
}