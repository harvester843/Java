package csci146_hw3_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Bejamin Lipscomb
 * @version 29 March 2016
 * CSCI146 Algorithmic Design II
 * Dr. Brian Canada
 * Assignment 3
 */

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField lcdJTextField;
	
	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}//end catch block
			}//end run method
		});//end EventQueue
	}//end main method

	/**
	 * Creates the frame.
	 */
	public CalculatorFrame() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		StringBuilder lcdBuffer = new StringBuilder();
		
		System.out.printf("%s", lcdBuffer.toString());

		lcdJTextField = new JTextField();
		contentPane.add(lcdJTextField, BorderLayout.NORTH);
		lcdJTextField.setColumns(10);

		JPanel keypadJPanel = new JPanel();
		contentPane.add(keypadJPanel, BorderLayout.CENTER);
		keypadJPanel.setLayout(new GridLayout(4, 4, 5, 5));

		JButton btnNewButton = new JButton("7");
		keypadJPanel.add(btnNewButton);

		//Exercise 1, Step 16: Utilized lambda expression
		btnNewButton.addActionListener((ActionEvent e) ->{
				lcdBuffer.append("7");	//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			
		});//end lambda expression

		JButton btnNewButton_1 = new JButton("8");
		keypadJPanel.add(btnNewButton_1);

		//define and register the event handler by using an
		//anonymous inner class ( a class definition with no name)
		btnNewButton_1.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("8");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		//Exercise 1, Step 16: Utilized lambda expression
		JButton btnNewButton_2 = new JButton("9");
		keypadJPanel.add(btnNewButton_2);

		btnNewButton_2.addActionListener((ActionEvent e) -> {
				lcdBuffer.append("9");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
		});//end lambda expression

		JButton btnNewButton_3 = new JButton("/");
		keypadJPanel.add(btnNewButton_3);

		btnNewButton_3.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("/");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}
		});//end anonymous inner class

		JButton btnNewButton_4 = new JButton("4");
		keypadJPanel.add(btnNewButton_4);

		//Exercise 1, Step 16: Utilized lambda expression
		btnNewButton_4.addActionListener((ActionEvent e) ->{
				lcdBuffer.append("4");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
		});//end lambda expression

		//Exercise 1, Step 16: Utilized lambda expression
		JButton btnNewButton_5 = new JButton("5");
		keypadJPanel.add(btnNewButton_5);

		btnNewButton_5.addActionListener((ActionEvent e) -> {
				lcdBuffer.append("5");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
		});//end lambda expression

		JButton btnNewButton_6 = new JButton("6");
		keypadJPanel.add(btnNewButton_6);

		btnNewButton_6.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("6");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_7 = new JButton("*");
		keypadJPanel.add(btnNewButton_7);

		btnNewButton_7.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("*");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_8 = new JButton("1");
		keypadJPanel.add(btnNewButton_8);

		btnNewButton_8.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("1");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_9 = new JButton("2");
		keypadJPanel.add(btnNewButton_9);

		btnNewButton_9.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("2");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_10 = new JButton("3");
		keypadJPanel.add(btnNewButton_10);

		btnNewButton_10.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("3");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_11 = new JButton("-");
		keypadJPanel.add(btnNewButton_11);

		btnNewButton_11.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("-");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_12 = new JButton("0");
		keypadJPanel.add(btnNewButton_12);

		btnNewButton_12.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("0");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous class

		JButton btnNewButton_13 = new JButton(".");
		keypadJPanel.add(btnNewButton_13);

		btnNewButton_13.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append(".");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous class

		JButton btnNewButton_14 = new JButton("=");
		keypadJPanel.add(btnNewButton_14);

		btnNewButton_14.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("=");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class

		JButton btnNewButton_15 = new JButton("+");
		keypadJPanel.add(btnNewButton_15);

		btnNewButton_15.addActionListener(new ClickListener() {
			public void actionPerformed(ActionEvent e) {
				lcdBuffer.append("+");//appends string literal to lcdBuffer object
				lcdJTextField.setText(lcdBuffer.toString());//explicitly appends the lcdBuffer string literal to lcdJTextField
			}//end actionPerformed method
		});//end anonymous inner class
	}//end CalculatorFrame  constructor
	
	/**
	 * An inner class that can also be used to 
	 * implement the ActionListener interface
	 */
	class ClickListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "5");
		}//end actionPerformed method

	}//end inner class ClickListener

}//end CalculatorFrame class
