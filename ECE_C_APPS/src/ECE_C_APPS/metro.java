package ECE_C_APPS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class metro {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1179, 813);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING\r\n");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Sitka Display", Font.PLAIN, 60));
		lblNewLabel.setBounds(196, 47, 642, 79);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :\r\n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(33, 187, 123, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FROM :\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(33, 262, 108, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO     :\r\n");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(33, 331, 108, 45);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(152, 187, 380, 45);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setForeground(SystemColor.textHighlight);
		c1.setFont(new Font("Sitka Banner", Font.PLAIN, 35));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "NAGOLE", "UPPAL", "STADIUM", "NGRI", "HABSIGUDA"}));
		c1.setBounds(156, 262, 376, 38);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setForeground(SystemColor.textHighlight);
		c2.setFont(new Font("Sitka Heading", Font.PLAIN, 36));
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "NAGOLE ", "UPPAL ", "STADIUM ", "NGRI", "HABSIGUDA"}));
		c2.setBounds(151, 340, 381, 41);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("NO OF TICKETS :\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 412, 170, 69);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Sitka Display", Font.PLAIN, 36));
		c3.setForeground(SystemColor.textHighlight);
		c3.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c3.setBounds(174, 426, 363, 46);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) c3.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int cost=0;
			  
					JOptionPane.showMessageDialog(btnNewButton,"DONE"); 
	
					
				
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Sitka Heading", Font.PLAIN, 30));
		btnNewButton.setBounds(174, 543, 201, 69);
		frame.getContentPane().add(btnNewButton);
	}
}
