 package prog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class calcolatrice extends JFrame {

	private JPanel contentPane;
	private JTextField PrimoOP;
	private JTextField DispSegno;
	private JTextField SecondoOP;
	logic_class data = new logic_class(false);
	private JTextField RIS;
	private JTextField Uguale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcolatrice frame = new calcolatrice();
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
	public calcolatrice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 184, 280, 323);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Bottone7 = new JButton("7");
		Bottone7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone7, PrimoOP);
				}else {
					data.inserimento(Bottone7, SecondoOP);
				}
			}

		});
		Bottone7.setBounds(10, 23, 54, 43);
		panel.add(Bottone7);
		
		JButton Bottone8 = new JButton("8");
		Bottone8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone8, PrimoOP);
				}else {
					data.inserimento(Bottone8, SecondoOP);
				}
			}
		});
		Bottone8.setBounds(74, 23, 54, 43);
		panel.add(Bottone8);
		
		JButton Bottone9 = new JButton("9");
		Bottone9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone9, PrimoOP);
				}else {
					data.inserimento(Bottone9, SecondoOP);
				}
			}
		});
		Bottone9.setBounds(138, 23, 54, 43);
		panel.add(Bottone9);
		
		JButton Bottone4 = new JButton("4");
		Bottone4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone4, PrimoOP);
				}else {
					data.inserimento(Bottone4, SecondoOP);
				}
			}
		});
		Bottone4.setBounds(10, 77, 54, 43);
		panel.add(Bottone4);
		
		JButton Bottone5 = new JButton("5");
		Bottone5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone5, PrimoOP);
				}else {
					data.inserimento(Bottone5, SecondoOP);
				}
			}
		});
		Bottone5.setBounds(74, 77, 54, 43);
		panel.add(Bottone5);
		
		JButton Bottone6 = new JButton("6");
		Bottone6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone6, PrimoOP);
				}else {
					data.inserimento(Bottone6, SecondoOP);
				}
			}
		});
		Bottone6.setBounds(138, 77, 54, 43);
		panel.add(Bottone6);
		
		JButton Bottone1 = new JButton("1");
		Bottone1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone1, PrimoOP);
				}else {
					data.inserimento(Bottone1, SecondoOP);
				}
				
			}
		});
		Bottone1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Bottone1.setBounds(10, 131, 54, 43);
		panel.add(Bottone1);
		
		JButton Bottone2 = new JButton("2");
		Bottone2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone2, PrimoOP);
				}else {
					data.inserimento(Bottone2, SecondoOP);
				}
			}
		});
		Bottone2.setBounds(74, 131, 54, 43);
		panel.add(Bottone2);
		
		JButton Bottone3 = new JButton("3");
		Bottone3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					data.inserimento(Bottone3, PrimoOP);
				}else {
					data.inserimento(Bottone3, SecondoOP);
				}
			}
		});
		Bottone3.setBounds(138, 131, 54, 43);
		panel.add(Bottone3);
		
		JButton BottoneCE = new JButton("CE");
		BottoneCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottoneCE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrimoOP.setText("");
				SecondoOP.setText("");
				RIS.setText("");
				DispSegno.setText("");
				Uguale.setText("");
				data.Operatore1 = PrimoOP.getText();
				data.Operatore2 = SecondoOP.getText();
				data.Risultato = RIS.getText();
				data.Segno = DispSegno.getText();
				data.it=false;
			}
		});
		BottoneCE.setBounds(202, 23, 68, 43);
		panel.add(BottoneCE);
		
		JButton BottonePlus = new JButton("+");
		BottonePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottonePlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				data.inserimento_plus(BottonePlus, DispSegno, PrimoOP);
			}

		});
		BottonePlus.setBounds(202, 77, 68, 43);
		panel.add(BottonePlus);
		
		JButton BottoneMeno = new JButton("-");
		BottoneMeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottoneMeno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				data.Operatore1 = PrimoOP.getText();
				System.out.println(data.Operatore1);
				data.it=true;
				DispSegno.setText(BottoneMeno.getText());
				data.Segno = BottoneMeno.getText();
			}
		});
		BottoneMeno.setBounds(202, 131, 68, 43);
		panel.add(BottoneMeno);
		
		JButton BottoneUg = new JButton("=");
		BottoneUg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Uguale.setText("=");
				data.Operatore2 = SecondoOP.getText();
				data.Op1 = Integer.valueOf(data.Operatore1);
				data.Op2 = Integer.valueOf(data.Operatore2);
				if(data.Segno.equals("+")) {
					data.Ris = data.Op1 + data.Op2;
				}if(data.Segno.equals("-")){
					data.Ris = data.Op1 - data.Op2;
				}if(data.Segno.equals("%")) {
					data.Ris = data.Op1 / data.Op2;
				}if(data.Segno.equals("x")) {
					data.Ris = data.Op1 * data.Op2;
				}
				data.Risultato = String.valueOf(data.Ris);
				RIS.setText(data.Risultato);
				
			}
		});
		BottoneUg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottoneUg.setBounds(202, 243, 68, 68);
		panel.add(BottoneUg);
		
		JButton BottonePer = new JButton("x");
		BottonePer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				data.Operatore1 = PrimoOP.getText();
				System.out.println(data.Operatore1);
				data.it=true;
				DispSegno.setText(BottonePer.getText());
				data.Segno = BottonePer.getText();
			}
		});
		BottonePer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottonePer.setBounds(138, 243, 54, 68);
		panel.add(BottonePer);
		
		JButton BottoneDiv = new JButton("%");
		BottoneDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BottoneDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				data.Operatore1 = PrimoOP.getText();
				System.out.println(data.Operatore1);
				data.it=true;
				DispSegno.setText(BottoneDiv.getText());
				data.Segno = BottoneDiv.getText();
			}
		});
		BottoneDiv.setBounds(74, 243, 54, 68);
		panel.add(BottoneDiv);
		
		JButton BottoneC = new JButton("C");
		BottoneC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					PrimoOP.setText("");
				}else {
					SecondoOP.setText("");
				}
			}
		});
		BottoneC.setBounds(10, 243, 54, 68);
		panel.add(BottoneC);
		
		JButton Bottone0 = new JButton("0");
		Bottone0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!data.it) {
					PrimoOP.setText(PrimoOP.getText()+Bottone0.getText());
				}else {
					SecondoOP.setText(SecondoOP.getText()+Bottone0.getText());
				}
			}
		});
		Bottone0.setBounds(10, 185, 260, 47);
		panel.add(Bottone0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 11, 280, 162);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		PrimoOP = new JTextField();
		PrimoOP.setFont(new Font("Tahoma", Font.BOLD, 31));
		PrimoOP.setEditable(false);
		PrimoOP.setBackground(Color.BLACK);
		PrimoOP.setForeground(Color.WHITE);
		PrimoOP.setBounds(10, 11, 211, 39);
		panel_1.add(PrimoOP);
		PrimoOP.setColumns(10);
		
		DispSegno = new JTextField();
		DispSegno.setFont(new Font("Tahoma", Font.BOLD, 31));
		DispSegno.setEditable(false);
		DispSegno.setBackground(Color.BLACK);
		DispSegno.setForeground(Color.WHITE);
		DispSegno.setBounds(231, 11, 39, 39);
		panel_1.add(DispSegno);
		DispSegno.setColumns(10);
		
		SecondoOP = new JTextField();
		SecondoOP.setFont(new Font("Tahoma", Font.BOLD, 31));
		SecondoOP.setEditable(false);
		SecondoOP.setBackground(Color.BLACK);
		SecondoOP.setForeground(Color.WHITE);
		SecondoOP.setBounds(10, 61, 211, 39);
		panel_1.add(SecondoOP);
		SecondoOP.setColumns(10);
		
		RIS = new JTextField();
		RIS.setFont(new Font("Tahoma", Font.BOLD, 31));
		RIS.setForeground(Color.WHITE);
		RIS.setEditable(false);
		RIS.setColumns(10);
		RIS.setBackground(Color.BLACK);
		RIS.setBounds(10, 111, 211, 39);
		panel_1.add(RIS);
		
		Uguale = new JTextField();
		Uguale.setForeground(Color.WHITE);
		Uguale.setFont(new Font("Tahoma", Font.BOLD, 31));
		Uguale.setEditable(false);
		Uguale.setColumns(10);
		Uguale.setBackground(Color.BLACK);
		Uguale.setBounds(231, 61, 39, 39);
		panel_1.add(Uguale);
	}
	
	
	
}
