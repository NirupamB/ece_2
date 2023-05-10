package ECE_C_APPS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOM {

	private JFrame frame;
	int i=0;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOM window = new ECOM();
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
	public ECOM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 1174, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RAAZU BOOK STORE\r\n\r\n");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.PLAIN, 60));
		lblNewLabel.setBounds(234, 26, 549, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\boook3.jpg"));
		lblNewLabel_1.setBounds(99, 82, 150, 245);
		frame.getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setBounds(435, 257, 1, 1);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\boook2.jpg"));
		lblNewLabel_2.setBounds(421, 82, 183, 245);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\boook4.jpg"));
		lblNewLabel_3.setBounds(754, 82, 141, 245);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("$5\r\n");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(142, 317, 44, 61);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("$5\r\n");
		lblNewLabel_4_1.setForeground(Color.ORANGE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4_1.setBounds(461, 317, 50, 61);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("$5\r\n");
		lblNewLabel_4_2.setForeground(Color.ORANGE);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4_2.setBounds(799, 317, 50, 61);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Paperback", "Kindle", "PDF", "jai balayya"}));
		comboBox.setBounds(99, 377, 150, 37);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Paperback", "Kindle", "PDF"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setBounds(421, 377, 158, 37);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Paperback", "Kindle", "PDF"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_2.setBounds(754, 377, 141, 37);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART : 0\r\n\r\n");
		lb.setForeground(new Color(255, 200, 0));
		lb.setFont(new Font("Sitka Subheading", Font.PLAIN, 30));
		lb.setBounds(857, 26, 127, 61);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to cart\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(99, 450, 150, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddToCart = new JButton("\r\nAdd to cart\r\n");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnAddToCart.setForeground(Color.BLACK);
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddToCart.setBounds(412, 454, 170, 23);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnAddToCart_1 = new JButton("Add to cart\r\n");
		btnAddToCart_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART :"+i);
			}
		});
		btnAddToCart_1.setForeground(Color.BLACK);
		btnAddToCart_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAddToCart_1.setBounds(754, 454, 150, 23);
		frame.getContentPane().add(btnAddToCart_1);
		
		JButton btnNewButton_1 = new JButton("remove from\r\n cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				lb.setText("CART :"+ -i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(76, 513, 213, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("remove from\r\n cart");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				lb.setText("CART :"+ -i);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(402, 513, 191, 61);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("remove from\r\n cart");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				lb.setText("CART :"+ -i);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(734, 513, 191, 61);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}
}
