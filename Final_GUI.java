import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JScrollBar;


public class Final_GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTextField textField_3;
	private JTextField textField_4;
	public static Map map=new Map();
	public static int round=0;
	public static int time=0;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final_GUI window = new Final_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Final_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("Final Project");
		frame.setBounds(100, 100, 975, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 40, 923, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea txtrPleaseEnterThe = new JTextArea();
		txtrPleaseEnterThe.setEditable(false);
		txtrPleaseEnterThe.setText("Please enter the number of the cycles jump.");
		txtrPleaseEnterThe.setBounds(24, 15, 361, 27);
		panel.add(txtrPleaseEnterThe);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 84, 730, 500);
		
		
		
		panel.add(textArea);
		
		
		JButton btnSubmit = new JButton("Initial ");
		//edit here is very important , this is a button listener 
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userInput = textField_2.getText(); //get the number from user
				
				
				map.initializeEarth();
				map.growGrass();
			
				Scanner input=new Scanner(System.in);
				
				time= Integer.parseInt(userInput);
				
				textArea.append("Initia state: ");
				textArea.append("\n");
				
				
				//textArea.setText("\n");
				
				for(int i=0;i<900;i++){
					if(i!=0&&i%30==0)
					{
						textArea.append("\n");
					}
					textArea.append(map.printEarth().get(i)+"     "); 
			
				}
				
				
				
			
				
				//initialize the map on GUI
				
	
			
	
				
				
			}
		});
		btnSubmit.setBounds(526, 13, 123, 29);
		panel.add(btnSubmit);
		
		textField_2 = new JTextField();
		textField_2.setBounds(415, 15, 96, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("");
				
				map.resetAttribute();
				map.growGrass();
				map.Eat();
				map.Move();
				map.Eat();
				map.Reproduce();
				map.Time();
				map.Die();
				round+=1;
				textArea.append("Cycle: "+round*time);
				textArea.append("\n");
				//time-=1;
				
				
				for(int i=0;i<900;i++){
					if(i!=0&&i%30==0)
					{
						textArea.append("\n");
					}
					textArea.append(map.printEarth().get(i)+"     ");  
			
				}
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			for(int i=0;i<900;i++){
				if(i!=0&&i%30==0)
				{
					textArea.append("\n");
				}
				textArea.append(map.printEarth().get(i)); 
		
			}
			System.out.println("Ended this round!");
			}
		});
		btnNext.setBounds(664, 10, 123, 29);
		panel.add(btnNext);
		
		textField_5 = new JTextField();
		textField_5.setBounds(24, 605, 730, 27);
		textField_5.setText("'*'indicated sand;      '^'indicated plants;      '&'indicated Herbivore;      '@'indicated Carnivore.");
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		
		
		
		
		
		
		
		
		
	
		
	
		
	
		
	
		
	
	}
}
