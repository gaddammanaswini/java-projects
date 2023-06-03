package QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Login extends JFrame implements ActionListener{
	JTextField tfname;
	JButton next;
	JButton back;
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login2.jpg"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,0,500,500);
		add(image);
		
		JLabel heading =new JLabel("Welcome to TalentBattle");
		heading.setBounds(600,40,500,40);
		heading.setForeground(Color.blue);
		heading.setFont(new Font("viner Hand ITC",Font.BOLD,35));
		add(heading);
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(750, 120, 300, 20);
		name.setForeground(Color.black);
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(name);
		
		tfname = new JTextField();
		tfname.setBounds(700, 160, 300, 25);
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(tfname);
		
		back = new JButton("Back");
		back.setBounds(730, 220, 90, 30);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		next = new JButton("next");
		next.setBounds(870, 220, 90, 30);
		next.setBackground(Color.blue);
		next.setForeground(Color.white);
		next.addActionListener(this);
		add(next);
		
		
		setVisible(true);
		setSize(1100,500);
		setLocation(200,150);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == next) {
			String name = tfname.getText();
			if(name.equals("") || name.equals(null)) {
				tfname.setBackground(Color.red);
				try {
					Thread.sleep(2000);
				} catch(Exception e) {}
				tfname.setBackground(Color.white);
			} else {
				setVisible(false);
				new Next(name);	
			}
		} else if(ae.getSource() == back) {
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		new Login();

	}

}
