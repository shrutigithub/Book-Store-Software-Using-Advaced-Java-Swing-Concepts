import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Book9 extends JFrame implements ActionListener 
{
	JPanel panel1,panel2,panel3,panel4,panel5;
	JDesktopPane jdp=new JDesktopPane();
	
	ImageIcon ii = new ImageIcon("tit.png");
	ImageIcon i2 = new ImageIcon("mid.png");
	ImageIcon i3 = new ImageIcon("tit1.png");
	
	JLabel l2=new JLabel(ii);
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
		JPanel panela=new JPanel();
		JPanel panelb=new JPanel();
		JPanel panelc=new JPanel();
	
	
	JComboBox cbox1,cbox2,cbox3,cbox4,cbox5;
	String fiction[]={"Select Fiction Books","Four Badges","1984","The book Thief","The Lord Of Rings"};
	String horror[]={"Select Horror Books","Amity Ville Horror","House of Shadows","Sleep Room"};
	String auto[]={"Select Autobiographies","Benjamin Franklin","Miles To Go"};
	String fairy[]={"Select Books On Fairies","Chocolate Dreams","Rainbow Swirl"};
	String religion[]={"Select Religious Books","Foreign Affairs","Terror and Error"};
	
	
	Book9()
		{ 
		super("Book Store Software !!!");
		add(jdp);
				
			jdp.setLayout(new BorderLayout());
			

			
			
		
				panel1=new JPanel();
				panel2=new JPanel();
				panel3=new JPanel();
				panel4=new JPanel();
				panel5=new JPanel();
				
			panel2.setLayout(new GridLayout(6,1));
			panel4.setLayout(new GridLayout(5,1));
	
				
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
		
		
		
		
		cbox1.addActionListener(this);
		cbox2.addActionListener(this);
		cbox3.addActionListener(this);
		cbox4.addActionListener(this);
		cbox5.addActionListener(this);
		btn.addActionListener(this);
		
		
		}
		
		public void actionPerformed(ActionEvent e)
	{	
	 	JComboBox cb = (JComboBox)e.getSource();
		String bookname = (String)cb.getSelectedItem();
		if(e.getSource()==cb)
		{
		txt5.setText(bookname);
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
		panelc.setBackground(Color.GREEN);
			
			
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
			if(e.getSource()==btn)
			{
				int bookcost=0;
				bookcost+=Integer.parseInt(txt2.getText());
				txt3.setText(String.valueOf(bookcost));
			}
		
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
		
		
		public static void main(String args[])
{
	Book9 ob=new Book9();
	ob.setSize(1350,800);
	ob.setVisible(true);
	}
	
			}