import javax.swing.*;  
public class SwingApp implements ActionListener
{  
SwingApp(){  
JFrame f = new JFrame();  
  
JLabel firstName = new JLabel("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
JLabel lastName = new JLabel("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  

  
JTextField firstNameTF = new JTextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
JPasswordField lastNameTF = new JPasswordField();  
lastNameTF.setBounds(120, 80, 100, 20);  

sbmt = new JButton("Submit");  
sbmt.setBounds(20, 160, 100, 30);  
  
  
f.add(firstName);  
f.add(lastName);  
f.add(firstNameTF);  
f.add(lastNameTF);    
f.add(sbmt);  
  
f.setSize(300,300);  
f.setLayout(null);  

sbmt.addActionListener(this);
f.setVisible(true); 

}  
public void actionPerformed(ActionEvent ae){
	System.out.println("The name is: "+firstNameTF.getText());
		System.out.println("The name is: "+lastNameTF.getText());
}
}
class Appli{
public static void main(String[] args) {  
// TODO Auto-generated method stub  
SwingApp s = new SwingApp();  
} 
} 
