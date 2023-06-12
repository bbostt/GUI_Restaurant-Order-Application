import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Restaurant extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant frame = new Restaurant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		input.setText(input.getText() + " " +str);
		
	}

	/**
	 * Create the frame.
	 */
	public Restaurant() {
		setType(Type.UTILITY);
		setTitle("MealChoice");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(0, 11, 319, 97);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(new Color(204, 153, 51));
		input.setForeground(new Color(0, 0, 0));
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setFont(new Font("Tahoma", Font.BOLD, 20));
		input.setBounds(10, 0, 299, 97);
		screen.add(input);
		input.setColumns(10);
		
		JPanel control = new JPanel();
		control.setBounds(10, 119, 309, 142);
		contentPane.add(control);
		control.setLayout(new GridLayout(3, 3, 20, 20));
		
		JButton btnSoup = new JButton("Soup");
		btnSoup.setBackground(new Color(255, 102, 0));
		btnSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//input.setText(input.getText() + e.getActionCommand()); input.setText metin alanýnda gösterilecek kýsým.
				addInput(e.getActionCommand());
			}
		});
		btnSoup.setFont(new Font("Tahoma", Font.BOLD, 12));
		control.add(btnSoup);
		
		JButton btnSnack = new JButton("Snack");
		btnSnack.setBackground(new Color(153, 204, 0));
		btnSnack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnSnack.setFont(new Font("Tahoma", Font.BOLD, 12));
		control.add(btnSnack);
		
		JButton btnMainCourse = new JButton("SeaFood");
		btnMainCourse.setBackground(new Color(0, 204, 204));
		btnMainCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnMainCourse.setFont(new Font("Tahoma", Font.BOLD, 12));
		control.add(btnMainCourse);
		
		JButton btnNewButton = new JButton("Beverage");
		btnNewButton.setBackground(new Color(102, 102, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		control.add(btnNewButton);
		
		JButton btnDessert = new JButton("Dessert");
		btnDessert.setBackground(new Color(255, 0, 0));
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnDessert.setFont(new Font("Tahoma", Font.BOLD, 12));
		control.add(btnDessert);
		
		JButton btnNewButton_5_1 = new JButton("C");
		btnNewButton_5_1.setBackground(new Color(204, 153, 153));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_5_1);
		
		JButton btnNewButton_5 = new JButton("Send");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Choices :"+input.getText());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		control.add(btnNewButton_5);
	}
}
