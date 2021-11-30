package MultiHilo2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class FInicio extends JFrame {
	
	private Hilo h1,h2,h3;
	JLabel LabelH1 = new JLabel("0");
	JLabel LabelH2 = new JLabel("0");
	JLabel LabelH3 = new JLabel("0");
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FInicio frame = new FInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FInicio() {
		
		h1 = new Hilo(LabelH1);
		h2 = new Hilo(LabelH2);
		h3 = new Hilo(LabelH3);
		
		h1.start();
		h2.start();
		h3.start();
		
		setTitle("Contadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btmHilo1 = new JButton("Detener Hilo 1");
		btmHilo1.setForeground(Color.BLACK);
		btmHilo1.setBackground(Color.CYAN);
		btmHilo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				h1.detener();
			}
		});
		btmHilo1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btmHilo1.setBounds(44, 11, 137, 23);
		contentPane.add(btmHilo1);
		
		JButton btmHilo2 = new JButton("Detener Hilo 2");
		btmHilo2.setBackground(Color.CYAN);
		btmHilo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				h2.detener();
			}
		});
		btmHilo2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btmHilo2.setBounds(44, 34, 137, 23);
		contentPane.add(btmHilo2);
		
		JButton btmHilo3 = new JButton("Detener Hilo 3");
		btmHilo3.setBackground(Color.CYAN);
		btmHilo3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				h3.detener();
			}
		});
		btmHilo3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btmHilo3.setBounds(44, 58, 137, 23);
		contentPane.add(btmHilo3);
		
		JButton btmtodos = new JButton("Detener todos");
		btmtodos.setBackground(Color.CYAN);
		btmtodos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				h1.detener();
				h2.detener();
				h3.detener();
			}
		});
		
		btmtodos.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btmtodos.setBounds(44, 85, 137, 23);
		contentPane.add(btmtodos);
		
		
		LabelH1.setFont(new Font("Verdana", Font.BOLD, 14));
		LabelH1.setBounds(61, 139, 54, 14);
		
		contentPane.add(LabelH1);
		
		
		LabelH2.setFont(new Font("Verdana", Font.BOLD, 14));
		LabelH2.setBounds(61, 164, 54, 14);
	
		contentPane.add(LabelH2);
		
		
		LabelH3.setFont(new Font("Verdana", Font.BOLD, 14));
		LabelH3.setBounds(61, 189, 54, 14);
		
		contentPane.add(LabelH3);
		
		JLabel lblHilo1 = new JLabel("Hilo 1:");
		lblHilo1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHilo1.setBounds(10, 139, 54, 14);
		contentPane.add(lblHilo1);
		
		JLabel lblHilo2 = new JLabel("Hilo 2:");
		lblHilo2.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHilo2.setBounds(10, 164, 54, 14);
		contentPane.add(lblHilo2);
		
		JLabel lblHilo3 = new JLabel("Hilo 3:");
		lblHilo3.setFont(new Font("Verdana", Font.BOLD, 14));
		lblHilo3.setBounds(10, 189, 54, 14);
		contentPane.add(lblHilo3);
		
		
	}
}
