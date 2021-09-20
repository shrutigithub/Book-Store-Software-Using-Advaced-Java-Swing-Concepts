import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
class Bk5 extends JFrame implements ActionListener 
{
	
	JDesktopPane jdp=new JDesktopPane();
	
	
	//Image icons
	ImageIcon ii = new ImageIcon("tit.png");
	ImageIcon i2 = new ImageIcon("mid.png");
	ImageIcon i3 = new ImageIcon("tit1.png");
	
	ImageIcon ia=new ImageIcon("Four Badges.jpg");
	ImageIcon ib=new ImageIcon("1984.jpg");
	ImageIcon ic=new ImageIcon("The book Thief.jpg");
	ImageIcon id=new ImageIcon("The Lord Of Rings.jpg");
	
	ImageIcon ie=new ImageIcon("Amity Ville Horror.jpg");
	ImageIcon ig=new ImageIcon("House of Shadows.jpg");
	ImageIcon ih=new ImageIcon("Sleep Room.jpg");
	
	ImageIcon ij=new ImageIcon("Benjamin Franklin.jpg");
	ImageIcon ik=new ImageIcon("Miles To Go.jpg");
	
	ImageIcon il=new ImageIcon("Foreign Affairs.jpg");
	ImageIcon im=new ImageIcon("Terror and Error.jpg");
	
	ImageIcon in=new ImageIcon("Chocolate Dreams.jpg");
	ImageIcon io=new ImageIcon("Rainbow Swirl.jpg");
	
	JLabel l2=new JLabel(ii);
	
	
	JLabel la=new JLabel(ia);
	JLabel lb=new JLabel(ib);
	JLabel lc=new JLabel(ic);
	JLabel ld=new JLabel(id);
	JLabel le=new JLabel(ie);
	JLabel lg=new JLabel(ig);
	JLabel lh=new JLabel(ih);
	JLabel lj=new JLabel(ij);
	JLabel lk=new JLabel(ik);
	JLabel ll=new JLabel(il);
	JLabel lm=new JLabel(im);
	JLabel ln=new JLabel(in);
	JLabel lo=new JLabel(io);
	
	JLabel l9=new JLabel(i3);
	
	JLabel l3=new JLabel(i2);
	JLabel l4=new JLabel("Selected Book");
	JTextArea txt2=new JTextArea(5,5);
	JLabel l5=new JLabel("Cost of the book");
	JTextArea txt1=new JTextArea(5,5);
	JButton btn=new JButton("ORDER");
	JLabel l6=new JLabel("Total Amount is Rs");
	JTextField txt3=new JTextField(20);
	JLabel l7=new JLabel("Selected Book is");
		JTextField txt5=new JTextField(20);
		JButton btn1=new JButton("PURCHASE");
		
		
		
			// panels for main frame
			
			JPanel panel1=new JPanel();
			JPanel panel2=new JPanel();
				JPanel panel3=new JPanel();
				JPanel panel4=new JPanel();
				JPanel panel5=new JPanel();
		
		
			// panels for internal frame
			JPanel panela=new JPanel();
			JPanel panelb=new JPanel();
			JPanel panelc=new JPanel();
			JPanel paneld=new JPanel();
	
			//comboBox with their contents
			JComboBox cbox1,cbox2,cbox3,cbox4,cbox5;
			String fiction[]={"Select Fiction Books","Four Badges","1984","The book Thief","The Lord Of Rings"};
			String horror[]={"Select Horror Books","Amity Ville Horror","House of Shadows","Sleep Room"};
			String auto[]={"Select Autobiographies","Benjamin Franklin","Miles To Go"};
			String fairy[]={"Select Books On Fairies","Chocolate Dreams","Rainbow Swirl"};
			String religion[]={"Select Religious Books","Foreign Affairs","Terror and Error"};
	
	
	Bk5()
		{ 
		super("Book Store Software !!!");
			
			//adding desktopPane
			add(jdp);
			jdp.setLayout(new BorderLayout());
				
				panel2.setLayout(new GridLayout(6,1));
				panel4.setLayout(new GridLayout(5,1));
	
				//Coloring panels of main frame
				panel1.setBackground(Color.GREEN);
				panel2.setBackground(Color.YELLOW);
				panel3.setBackground(Color.BLACK);
				panel4.setBackground(Color.YELLOW);
				panel5.setBackground(Color.GREEN);
		
		
		
		
				panel1.add(l2);
				panel3.add(l3);
				panel4.add(l4);
				panel4.add(txt1);
				panel4.add(l5);
				panel4.add(txt2);
				panel4.add(btn);
				panel5.add(l6);
				panel5.add(txt3);
		
				cbox1= new JComboBox(fiction);
				cbox2= new JComboBox(horror);
				cbox3= new JComboBox(auto);
				cbox4= new JComboBox(fairy);
				cbox5= new JComboBox(religion);
				
				cbox2.setBackground(Color.PINK);
				cbox2.setForeground(Color.RED);
				cbox3.setBackground(Color.CYAN);
				cbox3.setForeground(Color.RED);
				cbox1.setBackground(Color.CYAN);
				cbox1.setForeground(Color.RED);
				cbox4.setBackground(Color.CYAN);
				cbox4.setForeground(Color.RED);
				cbox5.setBackground(Color.PINK);
				cbox5.setForeground(Color.RED);
		
		
		panel2.add(cbox1);
		panel2.add(cbox2);
		panel2.add(cbox3);
		panel2.add(cbox4);
		panel2.add(cbox5);
		
		
		jdp.add("North",panel1);
		jdp.add("West",panel2);
		jdp.add("Center",panel3);
		jdp.add("East",panel4);
		jdp.add("South",panel5);
		
		
		txt1.setBackground(Color.ORANGE);
		txt2.setBackground(Color.ORANGE);
		txt1.setEditable(false);
		txt2.setEditable(false);
		
		
		
		
		cbox1.addActionListener(this);
		cbox2.addActionListener(this);
		cbox3.addActionListener(this);
		cbox4.addActionListener(this);
		cbox5.addActionListener(this);
		btn.addActionListener(this);
		btn1.addActionListener(new Helper());
		
		//Pay Button
		JButton bpay=new JButton("Pay");
		bpay.addActionListener(new Helper());
		
		
		
		
		
		
		
		
		}
		
		public void actionPerformed(ActionEvent e)
	{	
	 	JComboBox cb = (JComboBox)e.getSource();
		String bookname = (String)cb.getSelectedItem();
		
		if(e.getSource()==cb)
		{
		txt5.setText(bookname);
		txt5.setEditable(false);
		JInternalFrame jf=new JInternalFrame(bookname,true,true,true,true);
		jf.setLayout(new BorderLayout());
		panela.setBackground(Color.RED);
		panelb.setBackground(Color.GREEN);
		jf.add("West",panela);
		panela.add(l7);
		jf.add("East",panelb);
		panelb.add(txt5);
		jf.add("North",panelc);
		panelc.add(l9);
		panelb.add(btn1);
		
		jf.add("Center",paneld);
		if(bookname.equals("Four Badges"))
		{ paneld.removeAll();
		paneld.add(la);
		}
		else
		if(bookname.equals("1984"))          
		{
		paneld.removeAll();
		paneld.add(lb);
		
		}
		else
		if(bookname.equals("The book Thief"))          
		paneld.add(lc);
		else
		if(bookname.equals("The Lord Of Rings")) 
			{
		paneld.removeAll();
		paneld.add(ld);
		}
		else
		if(bookname.equals("Amity Ville Horror"))  
		{
		paneld.removeAll();
		 paneld.add(le);
		}
		else
		if(bookname.equals("House of Shadows"))  
		{
		paneld.removeAll();
		 paneld.add(lg);
		}
		else
		if(bookname.equals("Sleep Room"))
		{
		paneld.removeAll();
		          
		paneld.add(lh);
		}
		else
		if(bookname.equals("Benjamin Franklin"))  
		{
		paneld.removeAll();
		        
		paneld.add(lj);
		}
		else
		if(bookname.equals("Miles To Go")) 
		{
		paneld.removeAll();
		         
		paneld.add(lk);
		}
		else
		if(bookname.equals("Foreign Affairs"))
		{
		paneld.removeAll();
		          
		paneld.add(ll);
		}
		else
		if(bookname.equals("Terror and Error"))      
		{
		paneld.removeAll();
		    
		paneld.add(lm);
		}
		else
		if(bookname.equals("Chocolate Dreams"))  
		{
		paneld.removeAll();
		        
		paneld.add(ln);
		}
		else
		if(bookname.equals("Rainbow Swirl")) 
		{
		paneld.removeAll();
		         
		paneld.add(lo);
		}
			panelc.setBackground(Color.GREEN);
			paneld.setBackground(Color.YELLOW);
			
			jdp.add(jf);
			jf.setVisible(true);
			jf.setSize(100,100);
		
	}
        txt1.setText(txt1.getText()+"\n"+bookname);
		
		
		
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;

try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","960909");

		System.out.println("connected");

		stmt=con.createStatement();
		
		rs=stmt.executeQuery("Select price from book where bookname='"+bookname+"'");
		while(rs.next())
		{
			int cost=rs.getInt(1);
			
			txt2.setText(txt2.getText()+"\n"+cost);
			/*if(str.equals("btn"))
			{
				int bookcost=0;
				bookcost+=Integer.parseInt(txt2.getText());
				txt3.setText(String.valueOf(bookcost));
			}*/
		
		}
	}
		catch(ClassNotFoundException ex)
	{
		System.out.println(ex);
	}
	catch(SQLException ex)
	{
		System.out.println(ex);
	}
	


}		

class Helper implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("PURCHASE"))

{
JInternalFrame jf2=new JInternalFrame("PURCHASE",true,true,true,true);
jf2.setLayout(null);

JLabel lname=new JLabel("Enter your name");
JLabel lbooks=new JLabel("Book Selected");
JLabel ltcost=new JLabel("Total Amount to be paid");
JLabel ladd=new JLabel("Enter your address");





JTextField tname=new JTextField(20);
JTextField tbooks=new JTextField(20);
JTextArea tadd=new JTextArea(5,5);

tbooks.setEditable(false);
JTextField ttcost=new JTextField(20);
ttcost.setEditable(false);


JButton bpay=new JButton("Pay");

lname.setBounds(20,20,100,30);
jf2.add(lname);
tname.setBounds(150,20,100,30);
jf2.add(tname);
lbooks.setBounds(20,70,100,30);
jf2.add(lbooks);
tbooks.setBounds(150,70,100,30);
jf2.add(tbooks);
ltcost.setBounds(20,120,100,30);
jf2.add(ltcost);
ttcost.setBounds(150,120,100,30);
jf2.add(ttcost);
ladd.setBounds(20,170,100,30);
jf2.add(ladd);
tadd.setBounds(150,170,100,100);
jf2.add(tadd);


jf2.setSize(700,700);
jf2.setBackground(Color.RED);



			jdp.add(jf2);

			jf2.setVisible(true);
			jf2.setSize(50,50);
} 

}		

}

	
	

		
		public static void main(String args[])
{
	Bk5 ob=new Bk5();
	ob.setSize(1350,800);
	ob.setVisible(true);
	}
	
			}