package MultiHilo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pelota extends JFrame {
	JLabel O = new JLabel("O");
	Mov mov = new Mov(O);
	JButton btm2 = new JButton("Reanudar Hilo");
	JButton btm1 = new JButton("Parar Hilo");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pelota frame = new Pelota();
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
	public Pelota() {
		mov.start();
		setTitle("Pelota");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 284, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		btm1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mov.suspend();
				btm1.setVisible(false);
				btm2.setVisible(true);
			}
		});
		btm1.setFont(new Font("Verdana", Font.BOLD, 15));
		btm1.setBounds(65, 11, 140, 23);
		panel.add(btm1);
		
		
		btm2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mov.resume();
				btm2.setVisible(false);
				btm1.setVisible(true);
			}
		});
		btm2.setFont(new Font("Verdana", Font.BOLD, 15));
		btm2.setBounds(65, 11, 140, 23);
		panel.add(btm2);
		
		if(btm1.isVisible()) {
			btm2.setVisible(false);
		}else {
			btm2.setVisible(true);
		}
		
		O.setFont(new Font("Verdana", Font.BOLD, 18));
		O.setBounds(0, 140, 46, 23);
		
		O = mov.returnpelota();
		panel.add(O);
	}
}
