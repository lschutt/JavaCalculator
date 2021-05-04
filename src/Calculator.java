package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	
	//for two numbers entered and operator
	double firstNum;
	double secondNum;
	
	private JTextField calcField;
	
	String operator;
	double result;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		
		calcField = new JTextField();
		calcField.setHorizontalAlignment(SwingConstants.RIGHT);
		calcField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		calcField.setForeground(Color.WHITE);
		calcField.setBackground(Color.BLACK);
		calcField.setBounds(10, 11, 275, 44);
		frame.getContentPane().add(calcField);
		calcField.setColumns(10);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcField.setText("");
			}
		});
		btnAC.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnAC.setBackground(Color.GRAY);
		btnAC.setForeground(Color.DARK_GRAY);
		btnAC.setBounds(10, 66, 89, 28);
		frame.getContentPane().add(btnAC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn7.getText();
				calcField.setText(input);
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn7.setBounds(10, 105, 64, 64);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn4.getText();
				calcField.setText(input);
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn4.setBounds(10, 180, 64, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn1.getText();
				calcField.setText(input);
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn1.setBounds(10, 255, 64, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn8.getText();
				calcField.setText(input);
			}
		});
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn8.setBounds(84, 105, 64, 64);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn9.getText();
				calcField.setText(input);
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn9.setBounds(158, 105, 64, 64);
		frame.getContentPane().add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn5.getText();
				calcField.setText(input);
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn5.setBounds(84, 180, 64, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn6.getText();
				calcField.setText(input);
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn6.setBounds(158, 180, 64, 64);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn2.getText();
				calcField.setText(input);
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn2.setBounds(84, 255, 64, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn3.getText();
				calcField.setText(input);
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn3.setBounds(158, 255, 64, 64);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btn0.getText();
				calcField.setText(input);
			}
		});
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn0.setBounds(10, 328, 138, 64);
		frame.getContentPane().add(btn0);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = calcField.getText() + btnPoint.getText();
				calcField.setText(input);
			}
		});
		btnPoint.setBackground(Color.GRAY);
		btnPoint.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnPoint.setBounds(158, 328, 64, 64);
		frame.getContentPane().add(btnPoint);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(calcField.getText());
				calcField.setText("");
				operator = "/";
			}
		});
		btnDiv.setBackground(Color.GRAY);
		btnDiv.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnDiv.setBounds(232, 66, 53, 44);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(calcField.getText());
				calcField.setText("");
				operator = "*";
			}
		});
		btnMult.setBackground(Color.GRAY);
		btnMult.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnMult.setBounds(232, 121, 53, 44);
		frame.getContentPane().add(btnMult);
		
		JButton btnPerc = new JButton("%");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(calcField.getText());
				calcField.setText("");
				operator = "%";
			}
		});
		btnPerc.setBackground(Color.LIGHT_GRAY);
		btnPerc.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnPerc.setBounds(84, 255, 64, 64);
		frame.getContentPane().add(btnPerc);		
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(calcField.getText());
				calcField.setText("");
				operator = "-";
			}
		});
		btnMin.setBackground(Color.GRAY);
		btnMin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnMin.setBounds(232, 176, 53, 44);
		frame.getContentPane().add(btnMin);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(calcField.getText());
				calcField.setText("");
				operator = "+";
			}
		});
		btnPlus.setBackground(Color.GRAY);
		btnPlus.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnPlus.setBounds(232, 231, 53, 44);
		frame.getContentPane().add(btnPlus);
		
		//performs calculations and prints result
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(calcField.getText());
				String ans;
				if(operator == "+")
					result = firstNum + secondNum;
				else if(operator =="-")
					result = firstNum - secondNum;
				else if(operator == "*")
					result = firstNum * secondNum;
				else if(operator == "/")
					result = firstNum / secondNum;
				else
					result = secondNum;
				ans = String.format("%.2f", result);
				calcField.setText(ans);
			}
		});
		btnEquals.setBackground(Color.GRAY);
		btnEquals.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		btnEquals.setBounds(232, 286, 53, 106);
		frame.getContentPane().add(btnEquals);
		
		frame.setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 317, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
