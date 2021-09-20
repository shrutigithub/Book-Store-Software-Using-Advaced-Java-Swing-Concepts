import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class nbook2 extends JFrame implements ActionListener
	{
		JMenuBar menubar;
		JMenu menu1, menu2,menu3;
		JMenuItem i1,i2,i3,i4,i5;
		JDesktopPane jdp;
		ImageIcon ii = new ImageIcon("mid.png");
		nbook2()
		{
			super("new Book");
		
			jdp=new JDesktopPane();
			add(jdp);
			
			JLabel l1=new JLabel(ii);
			jdp.add(l1);
			
			menubar=new JMenuBar();
			menu1=new JMenu("File");
			menu2=new JMenu("View");
			menu3=new JMenu("Purchase");
			
			i1=new JMenuItem("Register New User");
			i2=new JMenuItem("Sign in");
			i3=new JMenuItem("Horror Books");
			i4=new JMenuItem("Fiction Books");
			i5=new JMenuItem("Purchase the Book");
			
			menu1.add(i1);
			menu1.add(i2);
			menu2.add(i3);
			menu2.add(i4);
			menu3.add(i5);
			
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			
			setJMenuBar(menubar);
			
			

			i1.addActionListener(this);
			i2.addActionListener(this);
			i3.addActionListener(this);
			i4.addActionListener(this);
			i5.addActionListener(this);
			
			}
	public void actionPerformed(ActionEvent ae)
	{
		
		JMenuItem jmi=(JMenuItem)ae.getSource();

		if(jmi==i1)
		{
		JInternalFrame jf=new JInternalFrame("Registrtion",true,true,true,true);
	
			jdp.add(jf);
			JLabel lname=new JLabel("Name");
			JLabel lid=new JLabel("email id");
			JLabel lno=new JLabel("Mobile no");
			JTextField t1=new JTextField(20);
			JTextField t2=new JTextField(20);
			JTextField t3=new JTextField(20);
			JButton b1=new JButton("Submit");
			jf.setLayout(new FlowLayout());
			jf.add(lname);
			jf.add(t1);
			jf.add(lid);
			jf.add(t2);
			jf.add(lno);
			jf.add(t3);
			jf.add(b1);

			jf.setVisible(true);
			jf.setBackground(Color.CYAN);
			jf.setSize(300,300);
		}
		else
		if(jmi==i2)
		{
		JInternalFrame jf2=new JInternalFrame("Sign in",true,true,true,true);
	
			jdp.add(jf2);

			jf2.setVisible(true);
			jf2.setSize(300,300);
		}	
		else
		if(jmi==i3)
		{
		JInternalFrame jf3=new JInternalFrame("Horror Books",true,true,true,true);
			jdp.add(jf3);

			jf3.setVisible(true);
			jf3.setSize(300,300);
			}
			else
		if(jmi==i4)
			{
		JInternalFrame jf4=new JInternalFrame("Fiction Books",true,true,true,true);
	
			jdp.add(jf4);
			jf4.setVisible(true);
			jf4.setSize(300,300);
		}	
		else
		if(jmi==i5)
		{
		JInternalFrame jf5=new JInternalFrame("PURCHASE",true,true,true,true);
			jdp.add(jf5);
			jf5.setVisible(true);
			jf5.setSize(300,300);
		}	
	}

			public static void main(String args[])
		{
			nbook2 obj=new nbook2();
			obj.setSize(500,500);
			obj.setVisible(true);		
		
		}
}	
		
		