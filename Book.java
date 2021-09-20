import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Book extends JFrame 
{
	JPanel panel1,panel2,panel3,panel4,panel5;
	ImageIcon ii = new ImageIcon("tit.png");
	ImageIcon i2 = new ImageIcon("mid.png");
	JLabel l2=new JLabel(ii);
	JLabel l3=new JLabel(i2);
	
	JComboBox cbox1,cbox2,cbox3,cbox4,cbox5;
	String fiction[]={"Select Fiction Books","Four Badges","1984","The Book Thief","The Lord Of Rings"};
	String horror[]={"Select Horror Books","Amity Ville Horror","House Of Shadows"," The Sleep Room"};
	String auto[]={"Select Autobiographies","Benjamin Franklin","Miles to Go"};
	String fairy[]={"Select Books On Fairies","Chocolate Dreams","Rainbow Swirl"};
	String religion[]={"Select Religious Books","Foreign Affairs","Terror and Error"};
	Book()
		{ 
			super("Book Store Software !!!");
			Container c=getContentPane();
			c.setLayout(new BorderLayout());
			
				panel1=new JPanel();
				panel2=new JPanel();
				panel3=new JPanel();
				panel4=new JPanel();
				panel5=new JPanel();
				
			panel2.setLayout(new GridLayout(5,1));
			panel4.setLayout(new GridLayout(4,1));
	
				
		panel1.setBackground(Color.GREEN);
		panel2.setBackground(Color.YELLOW);
		panel3.setBackground(Color.BLACK);
		panel4.setBackground(Color.YELLOW);
		panel5.setBackground(Color.BLACK);
		
		panel1.add(l2);
		panel3.add(l3);
	
		
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
		panel4.add(cbox4);
		panel4.add(cbox5);
		
		c.add("North",panel1);
		c.add("West",panel2);
		c.add("Center",panel3);
		c.add("East",panel4);
		c.add("South",panel5);
		}
		public static void main(String args[])
{
	Book ob=new Book();
	ob.setSize(1350,800);
	ob.setVisible(true);
	}
	
			}