import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Age implements ActionListener {
	static JFrame f;
	static JPanel p;
	static JButton b,b1;
	static JLabel l1,l2,l3,l4;
	static JTextField t1,t2,t3;
	
	
	Age(){
		//FRAME
				JPanel img = new JPanel();
				img.setBounds(200, 210, 300, 300);
				img.add(new JLabel(new ImageIcon("Ds/11.png")));
				img.setBackground(new Color(0, 0, 0, 0));
		  
				f = new JFrame("AGE");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(500,450);
				f.setLocation(470,100);	
				
				//PANEL	
				p = new JPanel();
				p.setLayout(null);
				//p.setBackground(Color.DARK_GRAY);
				
				p.setBackground(new Color(188,156,105));
				
				 
				
				b = new JButton("COMPUTE");
				b.setBounds(190,180,100,30);
				b.setBackground(new Color(245,245,220));
				
				
				b1 = new JButton("<<");
				b1.setBounds(400,20,50,30);
				b1.setBackground(new Color(245,245,220));
				b1.addActionListener(this);
				 b.addActionListener(this);
			
				
				l1 = new JLabel("AGE COMPUTATION");
				l1.setBounds(120,10,300,25);
				l1.setFont(new Font("Helvetica",Font.BOLD,25));
				l1.setForeground (Color.white);
				
				l2 = new JLabel("Birth Year");
				l2.setBounds(100,75,100,25);
				l2.setFont(new Font("Helvetica",Font.ITALIC,18));
				l2.setForeground (Color.white);
				
				l3 = new JLabel("Present Year");
				l3.setBounds(290,75,150,25);
				l3.setFont(new Font("Helvetica",Font.ITALIC,18));
				l3.setForeground (Color.white);
				
				l4 = new JLabel("Your Age!!");
				l4.setBounds(197,220,100,25);
				l4.setFont(new Font("Helvetica",Font.ITALIC,18));
				l4.setForeground (Color.white);
				
				
				 t1 = new JTextField();
				 t1.setBounds(90,100,100,35);
				 t2 = new JTextField();
				 t2.setBounds(290,100,100,35);
				
				 t3 = new JTextField();
				 t3.setBounds(190,250,100,35);
				 
				 
				   
				 
				p.add(img);
				 p.add(b);
				 p.add(b1);
				 p.add(l1);
				 p.add(l2);
				 p.add(l3);
				 p.add(l4);
				 p.add(t1);
				 p.add(t2);
				 p.add(t3);
				 f.add(p);
			   	f.show();
		
		
	}
	
	public static void main(String[] args) {
		Age a = new Age();}
		

	    public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	    	
	    	if (e.getSource() == b) {
				 int a1 = Integer.valueOf(t1.getText());
				 int a2 = Integer.valueOf(t2.getText());
				 int a3 = a2 - a1;
				 t3.setText(String.valueOf(a3));}
		
	    	
			if (e.getSource() == b1) {
				Mainpage Mainp = new Mainpage();
				f.dispose();}
		
			
			
	}
}
