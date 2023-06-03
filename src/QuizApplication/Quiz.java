package QuizApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
	String questions[][]=new String[10][5];
	String answers[]=new String[10];
	String useranswers[][]=new String[10][1];
	JRadioButton optn1,optn2,optn3,optn4;
	ButtonGroup groupoptions;
	JButton next,submit;
	JLabel qno, question;
	
	public static int count = 0;
	public static int timer = 15;
	public static int score=0;
	public static int ans_given=0;
	String name;
	
	Quiz(String name){
		this.name=name;
		setLayout(null);
		getContentPane().setBackground(new Color(187,196,227));
		
		setBounds(50,5,1200,700);
		
		
		ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
		JLabel image=new JLabel(i2);
		image.setBounds(0,0,1180,280);
		add(image);
		
		qno=new JLabel();
		qno.setBounds(100,400,50,30);
		qno.setFont(new Font("Thahoma ",Font.PLAIN,27));
		add(qno);
		
		question=new JLabel();
		question.setBounds(150,400,1200,30);
		question.setFont(new Font("Thahoma",Font.PLAIN,27));
		add(question);
		
		
		
		questions[0][0] = "Who is the father of C language?";
        questions[0][1] = "Steve Jobs";
        questions[0][2] = "James Gosling";
        questions[0][3] = "Dennis Ritchie";
        questions[0][4] = "Charles Babbage";

        questions[1][0] = "Which of the following cannot be variable name in C?";
        questions[1][1] = "int";
        questions[1][2] = "export";
        questions[1][3] = "friend";
        questions[1][4] = "1010";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is used to prevent any changes in variable within a C program?";
        questions[5][1] = "short";
        questions[5][2] = "immutable";
        questions[5][3] = "const";
        questions[5][4] = "volatile";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is an example of iteration in C?";
        questions[8][1] = "for";
        questions[8][2] = "while";
        questions[8][3] = "do-while";
        questions[8][4] = "all the above";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";	
        
        answers[0]= "Dennis Ritchie";
        answers[1] = "int";
        answers[2] = "java.util package";
        answers[3] = "Marker Interface";
        answers[4] = "Heap memory";
        answers[5] = "const";
        answers[6] = "import";
        answers[7] = "Java Archive";
        answers[8] = "all the above";
        answers[9] = "Bytecode is executed by JVM";
		
		optn1=new JRadioButton();
		optn1.setBounds(170,470,700,30);
		optn1.setBackground(new Color(187,198,226));
		optn1.setFont(new Font("Dialog",Font.PLAIN,27));
		add(optn1);
		
		optn2=new JRadioButton();
		optn2.setBounds(170,510,700,30);
		optn2.setBackground(new Color(187,198,226));
		optn2.setFont(new Font("Dialog",Font.PLAIN,27));
		add(optn2);
		
		optn3=new JRadioButton();
		optn3.setBounds(170,550,700,30);
		optn3.setBackground(new Color(187,198,226));
		optn3.setFont(new Font("Dialog",Font.PLAIN,27));
		add(optn3);
		
		optn4=new JRadioButton();
		optn4.setBounds(170,590,700,30);
		optn4.setBackground(new Color(187,198,226));
		optn4.setFont(new Font("Dialog",Font.PLAIN,27));
		add(optn4);
		
		groupoptions=new ButtonGroup();
		groupoptions.add(optn1);
		groupoptions.add(optn2);
		groupoptions.add(optn3);
		groupoptions.add(optn4);
		
		
		next=new JButton("NEXT");
		next.setBounds(950,500,90,30);
		next.setBackground(new Color(30,144,254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(950,550,90,30);
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.setEnabled(false);
		submit.addActionListener(this);
		add(submit);
		
		start(count);
		setVisible(true);

	}
	public void start(int count) {
		qno.setText("" + (count + 1) +". ");
		question.setText(questions[count][0]);
		optn1.setText(questions[count][1]);
		optn1.setActionCommand(questions[count][1]);
		optn2.setText(questions[count][2]);
		optn2.setActionCommand(questions[count][2]);
		optn3.setText(questions[count][3]);
		optn3.setActionCommand(questions[count][3]);
		optn4.setText(questions[count][4]);
		optn4.setActionCommand(questions[count][4]);
		groupoptions.clearSelection();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String time = "Time left- "+timer+" seconds";
		g.setColor(Color.red);
		g.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		if(timer > 0) {
			g.drawString(time, 900, 400);
			
		} else {
			g.drawString("Times up!!", 900, 400);
		}
		timer--;
		try {
			Thread.sleep(1000);
			repaint();
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(ans_given==1) {
			ans_given=0;
			timer=15;
		}
		else if(timer<0) {
			timer=15;
			if(count==8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			if(count==9)//submit button
			{
				if(groupoptions.getSelection()==null) {
					useranswers[count][0]="";
				}
				else {
					useranswers[count][0]=groupoptions.getSelection().getActionCommand();
				}
				for(int i=0;i<useranswers.length;i++) {
				
					if(useranswers[i][0].equals(answers[i]))
					{
						score+=10;
					}
					else {
						score+=10;
					}
					
				}
				setVisible(false);
				new Score(name,score);
				
			}
			else {
				if(groupoptions.getSelection()==null) {
					useranswers[count][0]="";
				}
				else
				{
					useranswers[count][0]=groupoptions.getSelection().getActionCommand();
				}
				count++;
				start(count);
			}
			
		}
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==next) {
			timer = 15;
			repaint();
			ans_given= 1;
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
			}
			else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			if(count==8){
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			count++;
			start(count);
		}
		if(ae.getSource()==submit)
		{
			ans_given= 1;
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
			}
			else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			for(int i=0;i<useranswers.length;i++) {
				if(useranswers[i][0] .equals(answers[i]))
				{
					score+=10;
				}
				else {
					score+=0;
				}
			}
			setVisible(false);
			count = 0;
			 timer = 15;
			 score=0;
			 ans_given=0;
			new Score(name,score);

		}
		
	}
	public static void main(String[] args) {
		new Quiz("user");

	}

}
