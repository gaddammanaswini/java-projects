package QuizApplication;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{
	
	Score(String name,int score){
		setVisible(true);
		setLayout(null);
		setBounds(300,100,800,600);
		getContentPane().setBackground(new Color(187,198,226));
		
		ImageIcon i1=new  ImageIcon(ClassLoader.getSystemResource("icons/trophy.jpg"));
		JLabel image=new JLabel(i1);
		image.setBounds(0,100,500,400);
		add(image);
		
		JLabel heading =new JLabel("Thankyou "+ name+".");
		heading.setBounds(50,30,600,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel title=new JLabel("Congratulation");
		title.setBounds(525,120,300,30);
		title.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(title);
		JLabel lblscore=new JLabel("Your score is "+score);
		lblscore.setBounds(525,150,320,30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lblscore);
		
		JButton submit =new JButton("Play Again");
		submit.setBounds(525,300,150,30);
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
		
		}
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}

	public static void main(String[] args) {
					new Score("user",0);
				
			
		
	}

}
