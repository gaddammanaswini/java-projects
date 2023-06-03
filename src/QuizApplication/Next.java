package QuizApplication;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;


public class Next extends JFrame implements ActionListener{
	
	String guideLines = "<html>"+"1.Read all the following instructions properly. keep your Admit card with you"+"<br><br>"
	+"2.you should not use mobile phones while attending the quiz."+"<br><br>"
			+"3.Hear all the quetions are compulsory."+"<br><br>"
	+"4.each question have a limit, if you are not submitting it with in the time limit it will move to the next question."+"<br><br>"
			+"5.Any kind of mall practice will not be encouraged. And you'll be disqualified."+"<br><br>"
	+"6.All the best for your complition, Goodluck!!!"+"</html>";
	
	JButton next;
	JButton back;
	String name;
	
	Next(String name) {
		this.name=name;
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading = new JLabel("Well come "+name+" To talent battle quiz");
		heading.setBounds(50,20,350,40);
		heading.setForeground(Color.blue);
		heading.setFont(new Font("viner Hand ITC",Font.BOLD,18));
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(30, 50, 600, 400);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rules.setText(guideLines);
		add(rules);
		
		next = new JButton("Start");
		next.setBounds(320, 400, 90, 30);
		next.setBackground(Color.blue);
		next.setForeground(Color.white);
		next.addActionListener(this);
		add(next);
		
		back = new JButton("Back");
		back.setBounds(100, 400, 90, 30);
		back.setBackground(Color.blue);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		setVisible(true);
		setSize(1100,500);
		setLocation(200,150);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == back) {
			setVisible(false);
			new Login();
		} else if(ae.getSource() == next) {
			setVisible(false);
			new Quiz(name);
		}
	}
	public static void main(String[] args) {
		new Next("User");
	}
}
