package br.com.simplecalc.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import br.com.simplecalc.sys.Operator;
import br.com.simplecalc.sys.SimpleCalcDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Cursor;

import br.com.simplecalc.sys.*;



public class AppWindow {

	private JFrame frmSimplecalc;
	private TextScreen screen = new TextScreen();
	private NumPad numPad = new NumPad();
	private SimpleCalcDAO dao = new SimpleCalcDAO();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frmSimplecalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmSimplecalc = new JFrame();
		frmSimplecalc.setTitle("SimpleCalc");
		frmSimplecalc.setResizable(false);
		frmSimplecalc.getContentPane().setFocusable(false);
		frmSimplecalc.setBounds(100, 100, 341, 438);
		frmSimplecalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimplecalc.getContentPane().setLayout(null);
		
		
		// calculator screen settings
		
		screen.setLocation(10, 24);
		screen.setSize(305, 100);
		frmSimplecalc.getContentPane().add(screen);
		
		
		// numpad config
		
		numPad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		numPad.setLocation(27, 140);
		numPad.setSize(218, 245);
		numPad.setLayout(null);
		frmSimplecalc.getContentPane().add(numPad);
		
		
		// command buttons
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextScreen.setText("");
				SimpleCalcDAO.clearNumbers();
			}
		});
		btnClear.setDefaultCapable(false);
		btnClear.setFocusable(false);
		btnClear.setBackground(SystemColor.window);
		btnClear.setBounds(255, 181, 50, 23);
		frmSimplecalc.getContentPane().add(btnClear);
		
		JButton btnErase = new JButton("<");
		btnErase.setDefaultCapable(false);
		btnErase.setFocusable(false);
		btnErase.setBackground(SystemColor.window);
		btnErase.setBounds(255, 152, 50, 23);
		frmSimplecalc.getContentPane().add(btnErase);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpSignal("/", Operator.DIVISAO);
			}
		});
		btnDivision.setDefaultCapable(false);
		btnDivision.setBackground(SystemColor.window);
		btnDivision.setFocusable(false);
		btnDivision.setBounds(255, 215, 50, 23);
		frmSimplecalc.getContentPane().add(btnDivision);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpSignal("*", Operator.MULTIPLICACAO);
			}
		});
		btnMultiply.setDefaultCapable(false);
		btnMultiply.setBackground(SystemColor.window);
		btnMultiply.setFocusable(false);
		btnMultiply.setBounds(255, 249, 50, 23);
		frmSimplecalc.getContentPane().add(btnMultiply);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpSignal("-", Operator.SUBTRACAO);
			}
		});
		btnMinus.setDefaultCapable(false);
		btnMinus.setBackground(SystemColor.window);
		btnMinus.setFocusable(false);
		btnMinus.setBounds(255, 280, 50, 23);
		frmSimplecalc.getContentPane().add(btnMinus);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpSignal("+", Operator.SOMA);
			}
		});
		btnSum.setDefaultCapable(false);
		btnSum.setBackground(SystemColor.window);
		btnSum.setFocusable(false);
		btnSum.setBounds(255, 314, 50, 23);
		frmSimplecalc.getContentPane().add(btnSum);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setDefaultCapable(false);
		btnEqual.setFocusable(false);
		btnEqual.setBackground(SystemColor.window);
		btnEqual.setBounds(255, 348, 50, 23);
		frmSimplecalc.getContentPane().add(btnEqual);
		
		
	}
	
	private void setOpSignal(String parameter, Operator op) {
		var calc = new Calculator(dao.getNumInteger(), dao.getNumInteger(), op);
		String resultado = Integer.toString(calc.result());
		screen.addText(parameter);
		TextScreen.setText(resultado);
	}
	
}
