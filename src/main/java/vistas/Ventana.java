package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import logica.Logica;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	//Instanciamos la logica para usar sus metodos
	private static Logica logica = new Logica();
	//Botones
	private static JButton btn0;
	private static JButton btn1;
	private static JButton btn2;
	private static JButton btn3;
	private static JButton btn4;
	private static JButton btn5;
	private static JButton btn6;
	private static JButton btn7;
	private static JButton btn8;
	private static JButton btn9;
	private static JButton btn10;
	private static JButton btn11;
	private static JButton btn12;
	private static JButton btn13;
	private static JButton btn14;
	private static JButton btn15;
	
	private boolean cartaBocaArriba = false;
	private ImageIcon imgIcon;
	private ImageIcon imgIcon2;
	private JButton[] arrayButton = new JButton[2];
	private boolean esIgual = false;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//Lanza la vista
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					ordenarCartas();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Crea la vista de la aplicacion
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn0 = new JButton("");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn0);
			}
		});
		btn0.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn0.setContentAreaFilled(false);
		btn0.setBorder(null);
		btn0.setFocusable(false);
		btn0.setBorderPainted(false);
		btn0.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn0.setBounds(3, 0, 74, 105);
		contentPane.add(btn0);
		
		btn1 = new JButton("");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn1);
			}
		});
		btn1.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn1.setContentAreaFilled(false);
		btn1.setBorder(null);
		btn1.setFocusable(false);
		btn1.setBorderPainted(false);
		btn1.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn1.setBounds(73, 0, 74, 105);
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn2);
			}
		});
		btn2.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn2.setContentAreaFilled(false);
		btn2.setBorder(null);
		btn2.setFocusable(false);
		btn2.setBorderPainted(false);
		btn2.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn2.setBounds(146, 0, 74, 105);
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn3);
			}
		});
		btn3.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn3.setContentAreaFilled(false);
		btn3.setBorder(null);
		btn3.setFocusable(false);
		btn3.setBorderPainted(false);
		btn3.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn3.setBounds(217, 0, 74, 105);
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn4);
			}
		});
		btn4.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn4.setContentAreaFilled(false);
		btn4.setBorder(null);
		btn4.setFocusable(false);
		btn4.setBorderPainted(false);
		btn4.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn4.setBounds(3, 104, 74, 105);
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn5);
			}
		});
		btn5.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn5.setContentAreaFilled(false);
		btn5.setBorder(null);
		btn5.setFocusable(false);
		btn5.setBorderPainted(false);
		btn5.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn5.setBounds(73, 104, 74, 105);
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn6);
			}
		});
		btn6.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn6.setContentAreaFilled(false);
		btn6.setBorder(null);
		btn6.setFocusable(false);
		btn6.setBorderPainted(false);
		btn6.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn6.setBounds(146, 104, 74, 105);
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn7);
			}
		});
		btn7.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn7.setContentAreaFilled(false);
		btn7.setBorder(null);
		btn7.setFocusable(false);
		btn7.setBorderPainted(false);
		btn7.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn7.setBounds(217, 104, 74, 105);
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn8);
			}
		});
		btn8.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn8.setContentAreaFilled(false);
		btn8.setBorder(null);
		btn8.setFocusable(false);
		btn8.setBorderPainted(false);
		btn8.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn8.setBounds(3, 207, 74, 105);
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn9);
			}
		});
		btn9.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn9.setContentAreaFilled(false);
		btn9.setBorder(null);
		btn9.setFocusable(false);
		btn9.setBorderPainted(false);
		btn9.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn9.setBounds(73, 207, 74, 105);
		contentPane.add(btn9);
		
		btn10 = new JButton("");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn10);
			}
		});
		btn10.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn10.setContentAreaFilled(false);
		btn10.setBorder(null);
		btn10.setFocusable(false);
		btn10.setBorderPainted(false);
		btn10.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn10.setBounds(146, 207, 74, 105);
		contentPane.add(btn10);
		
		btn11 = new JButton("");
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn11);
			}
		});
		btn11.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn11.setContentAreaFilled(false);
		btn11.setBorder(null);
		btn11.setFocusable(false);
		btn11.setBorderPainted(false);
		btn11.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn11.setBounds(217, 207, 74, 105);
		contentPane.add(btn11);
		
		btn12 = new JButton("");
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn12);
			}
		});
		btn12.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn12.setContentAreaFilled(false);
		btn12.setBorder(null);
		btn12.setFocusable(false);
		btn12.setBorderPainted(false);
		btn12.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn12.setBounds(3, 310, 74, 105);
		contentPane.add(btn12);
		
		btn13 = new JButton("");
		btn13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn13);
			}
		});
		btn13.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn13.setContentAreaFilled(false);
		btn13.setBorder(null);
		btn13.setFocusable(false);
		btn13.setBorderPainted(false);
		btn13.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn13.setBounds(73, 310, 74, 105);
		contentPane.add(btn13);
		
		btn14 = new JButton("");
		btn14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn14);
			}
		});
		btn14.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn14.setContentAreaFilled(false);
		btn14.setBorder(null);
		btn14.setFocusable(false);
		btn14.setBorderPainted(false);
		btn14.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn14.setBounds(146, 310, 74, 105);
		contentPane.add(btn14);
		
		btn15 = new JButton("");
		btn15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				compararCarta();
			}
		});
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activarCarta(btn15);
			}
		});
		btn15.setRolloverIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCardSelected.png")));
		btn15.setContentAreaFilled(false);
		btn15.setBorder(null);
		btn15.setFocusable(false);
		btn15.setBorderPainted(false);
		btn15.setIcon(new ImageIcon(Ventana.class.getResource("/images/ReverseCard.png")));
		btn15.setBounds(217, 310, 74, 105);
		contentPane.add(btn15);
		setTitle("Formar parejas");
		setResizable(false);
	}
	
	//Obtiene el array y coloca las imagenes en el orden del array en los botones(cuando estan deshabilitados)
	public static void ordenarCartas() {
		int[] arrayNumeros = logica.obtenerArray();		
		try {
			btn0.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[0] + ".png")));
			btn1.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[1] + ".png")));
			btn2.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[2] + ".png")));
			btn3.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[3] + ".png")));
			btn4.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[4] + ".png")));
			btn5.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[5] + ".png")));
			btn6.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[6] + ".png")));
			btn7.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[7] + ".png")));
			btn8.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[8] + ".png")));
			btn9.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[9] + ".png")));
			btn10.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[10] + ".png")));
			btn11.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[11] + ".png")));
			btn12.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[12] + ".png")));
			btn13.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[13] + ".png")));
			btn14.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[14] + ".png")));
			btn15.setDisabledIcon(new ImageIcon(Ventana.class.getResource("/images/" + arrayNumeros[15] + ".png")));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	//Giramos una carta
	private void activarCarta(JButton btn) {
		
		if(!cartaBocaArriba) {
			btn.setEnabled(false);
			imgIcon = (ImageIcon) btn.getDisabledIcon();
			arrayButton[0] = btn; //Guardamos en el array la posicion de la carta
			cartaBocaArriba = true;
			esIgual = false;
		} else {
			btn.setEnabled(false);
			imgIcon2 = (ImageIcon) btn.getDisabledIcon();
			arrayButton[1] = btn; //Guardamos en el array la posicion de la carta
			esIgual = true;
		}
	}
	//Compara las cartas 
	private void compararCarta() {
		if(esIgual && cartaBocaArriba) {
			
			if(imgIcon.getDescription().compareTo(imgIcon2.getDescription()) != 0) { //
				arrayButton[0].setEnabled(true);
				arrayButton[1].setEnabled(true);
			}
			cartaBocaArriba = false;
		}
	}

}
