import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Ab extends JFrame implements ItemListener,ActionListener
{
	
	JDesktopPane jdp;
	
	
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
	
	//Labels embedding with images
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
	
	JLabel lcost=new JLabel("Cost of the Book is");
	
	JTextField txt3=new JTextField(20);
	JLabel l7=new JLabel("Selected Book is");
	JTextField txt5=new JTextField(20);
	JTextField tcost=new JTextField(20);
		
		
		
			// panels for main frame
			
				JPanel panel1=new JPanel();
				JPanel panel2=new JPanel();
				JPanel panel3=new JPanel();
				JPanel panel4=new JPanel();
				JPanel panel5=new JPanel();
		
		
			// panels for internal frame
			JPanel peast=new JPanel();
			JPanel pwest=new JPanel();
			JPanel pnorth=new JPanel();
			JPanel psouth=new JPanel();
			JPanel pcenter=new JPanel();
	
			//comboBox with their contents
			JComboBox cbox1,cbox2,cbox3,cbox4,cbox5;
			String fiction[]={"Select Fiction Books","Four Badges","1984","The book Thief","The Lord Of Rings"};
			String horror[]={"Select Horror Books","Amity Ville Horror","House of Shadows","Sleep Room"};
			String auto[]={"Select Autobiographies","Benjamin Franklin","Miles To Go"};
			String fairy[]={"Select Books On Fairies","Chocolate Dreams","Rainbow Swirl"};
			String religion[]={"Select Religious Books","Foreign Affairs","Terror and Error"};
	
	
	Ab()
		{ 
				super("Book Store Software !!!");
		
				jdp=new JDesktopPane();
				jdp.setLayout(new BorderLayout());
			
			//adding desktopPane
				add(jdp);
			
			//Coloring panels of main frame
				panel1.setBackground(Color.GREEN);
				panel2.setBackground(Color.YELLOW);
				panel3.setBackground(Color.BLACK);
				panel4.setBackground(Color.YELLOW);
				panel5.setBackground(Color.GREEN);
		
		
			//Adding Components to the main Frame
				
				panel2.setLayout(new GridLayout(6,1));
				panel4.setLayout(new GridLayout(5,1));
				
				panel1.add(l2);
				panel3.add(l3);
				panel4.add(l4);
				panel4.add(txt1);
				panel4.add(l5);
				panel4.add(txt2);
				panel4.add(btn);
				panel5.add(l6);
				panel5.add(txt3);
		
		
			//Assigning values to the Comboboxes
	
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
			
		
		
		
				cbox1.addItemListener(this);
				cbox2.addItemListener(this);
				cbox3.addItemListener(this);
				cbox4.addItemListener(this);
				cbox5.addItemListener(this);
				btn.addActionListener(this);
		
		
		
		
		}
		
	public void itemStateChanged(ItemEvent e)
		{	
	 	
			pwest.setLayout(new GridLayout(4,1));
		
		
		
			String bookname = (String)e.getItem();
			txt5.setText(bookname);
		
			txt5.setEditable(false);
			JInternalFrame jf=new JInternalFrame(bookname,true,true,true,true);
			JButton purchase=new JButton("PURCHASE");
			purchase.addActionListener(this);
		
			peast.add(purchase);
		
		
			jf.setLayout(new BorderLayout());
		
			jf.add("West",pwest);
			pwest.add(l7);
			jf.add("East",peast);
			pwest.add(txt5);
			pwest.add(lcost);
			pwest.add(tcost);
			tcost.setEditable(false);
		
			jf.add("North",pnorth);
			pnorth.add(l9);
		
			jf.add("Center",pcenter);
			if(bookname.equals("Four Badges"))
			{ 
				pcenter.removeAll();
				pcenter.add(la);
		
			}	
		else
			if(bookname.equals("1984"))          
			{
				pcenter.removeAll();
				pcenter.add(lb);
			}
		else
		if(bookname.equals("The book Thief")) 
			{
				pcenter.removeAll();
				pcenter.add(lc);
			}
		else
		if(bookname.equals("The Lord Of Rings")) 
			{
				pcenter.removeAll();
				pcenter.add(ld);
			}
		else
		if(bookname.equals("Amity Ville Horror"))  
			{
				pcenter.removeAll();
				pcenter.add(le);
			}
		else
		if(bookname.equals("House of Shadows"))  
		{
			pcenter.removeAll();
			pcenter.add(lg);
		}
		else
		if(bookname.equals("Sleep Room"))
		{
			pcenter.removeAll();
		    pcenter.add(lh);
		}
		else
		if(bookname.equals("Benjamin Franklin"))  
		{
			pcenter.removeAll();
		    pcenter.add(lj);
		}
		else
		if(bookname.equals("Miles To Go")) 
		{
			pcenter.removeAll();
		    pcenter.add(lk);
		}
		else
		if(bookname.equals("Foreign Affairs"))
		{
			pcenter.removeAll();
		    pcenter.add(ll);
		}
		else
		if(bookname.equals("Terror and Error"))      
		{
			pcenter.removeAll();
		    pcenter.add(lm);
		}
		else
		if(bookname.equals("Chocolate Dreams"))  
		{
			pcenter.removeAll();
		    pcenter.add(ln);
		}
		else
		if(bookname.equals("Rainbow Swirl")) 
		{
			pcenter.removeAll();
		    pcenter.add(lo);
		}
		
		
	
			pnorth.setBackground(Color.GREEN);
			pcenter.setBackground(Color.PINK);
			pwest.setBackground(Color.YELLOW);
			peast.setBackground(Color.YELLOW);
			tcost.setBackground(Color.YELLOW);
			txt5.setBackground(Color.YELLOW);
			txt5.setForeground(Color.RED);
			tcost.setForeground(Color.RED);
			pwest.setForeground(Color.RED);
			
			
			jdp.add(jf);
			jf.setVisible(true);
			jf.setSize(20,20);
		
	
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
			tcost.setText(String.valueOf(cost));
			
			txt2.setText(txt2.getText()+"\n"+cost);
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

public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btn)
			{
				txt3.setText("Hello");
			}
		}

		
	
		
		
		public static void main(String args[])
		{
			Ab ob=new Ab();
			ob.setSize(1350,800);
			ob.setVisible(true);
		}
	
}