import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class JokenPo extends JFrame
{

	int jogador = 0;
	private JPanel contentPane;
	private JButton btn_Pedra;
	private JButton btn_Papel;
	private JButton btn_Tesoura;
	private JLabel lbl_Jogador;
	private JLabel lbl_Maquina;
	private JPanel panel;
	private JTextField txtJokenpo;
	private JTextField txtJogador;
	private JTextField txtMquina;
	private JTextField txt_Vencedor;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JokenPo frame = new JokenPo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	private void player()
	{
		int computador = (int)(Math.random() * 3 + 1);
		
		switch (computador) 
		{
			case 1:
				System.out.println("Computador escolheu PEDRA");
				lbl_Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pcpedra.png")));
				break;
			case 2:
				System.out.println("Computador escolheu PAPEL");
				lbl_Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pcpapel.png")));
				break;
			case 3: 
				System.out.println("Computador escolheu TESOURA");
				lbl_Maquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pctesoura.png")));
				break;
		}
		
		switch ((int) jogador)
		{
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			lbl_Jogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pcpedra.png")));
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			lbl_Jogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pcpapel.png")));
			break;
		case 3: 
			System.out.println("Jogador escolheu TESOURA");
			lbl_Jogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pctesoura.png")));
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		if (jogador == computador)
		{
			System.out.println("EMPATE");
			txt_Vencedor.setText("Empatou");
		}
		else
		{
			if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2)
			{
				System.out.println("JOGADOR VENCEU");
				txt_Vencedor.setText("Jogador venceu");
			} else {
				System.out.println("COMPUTADOR VENCEU");
				txt_Vencedor.setText("Máquina venceu");
			}
		}
	}

	/**
	 * Create the frame.
	 */
	public JokenPo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn_Pedra = new JButton("");
		btn_Pedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				player();
			}
		});
		btn_Pedra.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/pedra.png")));
		btn_Pedra.setBounds(10, 115, 64, 64);
		contentPane.add(btn_Pedra);
		
		btn_Papel = new JButton("");
		btn_Papel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				player();
			}
		});
		btn_Papel.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/papel.png")));
		btn_Papel.setBounds(84, 115, 64, 64);
		contentPane.add(btn_Papel);
		
		btn_Tesoura = new JButton("");
		btn_Tesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				player();
			}
		});
		btn_Tesoura.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/tesoura.png")));
		btn_Tesoura.setBounds(158, 115, 64, 64);
		contentPane.add(btn_Tesoura);
		
		lbl_Jogador = new JLabel("");
		lbl_Jogador.setBounds(10, 199, 171, 139);
		contentPane.add(lbl_Jogador);
		lbl_Jogador.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/pc.png")));
		
		lbl_Maquina = new JLabel("");
		lbl_Maquina.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/pc.png")));
		lbl_Maquina.setBounds(380, 199, 171, 139);
		contentPane.add(lbl_Maquina);
		
		panel = new JPanel();
		panel.setBounds(10, 0, 541, 41);
		contentPane.add(panel);
		
		txtJokenpo = new JTextField();
		txtJokenpo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtJokenpo.setHorizontalAlignment(SwingConstants.CENTER);
		txtJokenpo.setText("JokenPo");
		panel.add(txtJokenpo);
		txtJokenpo.setColumns(10);
		
		txtJogador = new JTextField();
		txtJogador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtJogador.setHorizontalAlignment(SwingConstants.CENTER);
		txtJogador.setText("Jogador");
		txtJogador.setBounds(73, 60, 96, 28);
		contentPane.add(txtJogador);
		txtJogador.setColumns(10);
		
		txtMquina = new JTextField();
		txtMquina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMquina.setHorizontalAlignment(SwingConstants.CENTER);
		txtMquina.setText("M\u00E1quina");
		txtMquina.setColumns(10);
		txtMquina.setBounds(415, 64, 96, 28);
		contentPane.add(txtMquina);
		
		txt_Vencedor = new JTextField();
		txt_Vencedor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txt_Vencedor.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Vencedor.setBounds(205, 241, 151, 43);
		contentPane.add(txt_Vencedor);
		txt_Vencedor.setColumns(10);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(JokenPo.class.getResource("/Icons/interrogation.png")));
		label.setBounds(432, 115, 64, 64);
		contentPane.add(label);
	}
	
}
