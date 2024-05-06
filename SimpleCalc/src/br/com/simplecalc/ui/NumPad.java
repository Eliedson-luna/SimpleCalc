package br.com.simplecalc.ui;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.simplecalc.sys.NumberCalc;
import br.com.simplecalc.sys.SimpleCalcDAO;



public class NumPad extends JPanel {
	
	private SimpleCalcDAO dao = new SimpleCalcDAO();
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public NumPad() {
		Initialize();
	}
	private void Initialize() {
		JButton btnNumZero = new JButton("0");
		btnNumZero.setDefaultCapable(false);
		btnNumZero.setBackground(SystemColor.window);
		btnNumZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(0);
				}
		});
		setLayout(null);
		btnNumZero.setFocusable(false);
		btnNumZero.setBounds(77, 186, 60, 50);
		add(btnNumZero);
		
		JButton btnNumOne = new JButton("1");
		btnNumOne.setDefaultCapable(false);
		btnNumOne.setBackground(SystemColor.window);
		btnNumOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(1);
			}
		});
		btnNumOne.setFocusable(false);
		btnNumOne.setBounds(10, 128, 60, 50);
		add(btnNumOne);
		
		JButton btnNumTwo = new JButton("2");
		btnNumTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(2);
			}
		});
		btnNumTwo.setDefaultCapable(false);
		btnNumTwo.setBackground(SystemColor.window);
		btnNumTwo.setFocusable(false);
		btnNumTwo.setBounds(77, 128, 60, 50);
		add(btnNumTwo);
		
		JButton btnNumThree = new JButton("3");
		btnNumThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(3);
			}
		});
		btnNumThree.setDefaultCapable(false);
		btnNumThree.setBackground(SystemColor.window);
		btnNumThree.setFocusable(false);
		btnNumThree.setBounds(144, 128, 60, 50);
		add(btnNumThree);
		
		JButton btnNumFour = new JButton("4");
		btnNumFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(4);
			}
		});
		btnNumFour.setDefaultCapable(false);
		btnNumFour.setBackground(SystemColor.window);
		btnNumFour.setFocusable(false);
		btnNumFour.setBounds(10, 69, 60, 50);
		add(btnNumFour);
		
		JButton btnNumFive = new JButton("5");
		btnNumFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(5);
			}
		});
		btnNumFive.setDefaultCapable(false);
		btnNumFive.setBackground(SystemColor.window);
		btnNumFive.setFocusable(false);
		btnNumFive.setBounds(77, 69, 60, 50);
		add(btnNumFive);
		
		JButton btnNumSix = new JButton("6");
		btnNumSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(6);
			}
		});
		btnNumSix.setDefaultCapable(false);
		btnNumSix.setBackground(SystemColor.window);
		btnNumSix.setFocusable(false);
		btnNumSix.setBounds(144, 69, 60, 50);
		add(btnNumSix);
		
		JButton btnNumSeven = new JButton("7");
		btnNumSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(7);
			}
		});
		btnNumSeven.setDefaultCapable(false);
		btnNumSeven.setBackground(SystemColor.window);
		btnNumSeven.setFocusable(false);
		btnNumSeven.setBounds(10, 11, 60, 50);
		add(btnNumSeven);
		
		JButton btnNumEigth = new JButton("8");
		btnNumEigth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(8);
			}
		});
		btnNumEigth.setDefaultCapable(false);
		btnNumEigth.setBackground(SystemColor.window);
		btnNumEigth.setFocusable(false);
		btnNumEigth.setBounds(77, 11, 60, 50);
		add(btnNumEigth);
		
		JButton btnNumNine = new JButton("9");
		btnNumNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onPress(9);
			}
		});
		btnNumNine.setDefaultCapable(false);
		btnNumNine.setBackground(SystemColor.window);
		btnNumNine.setFocusable(false);
		btnNumNine.setBounds(144, 11, 60, 50);
		add(btnNumNine);
	}
	
	private void onPress(int num) {
		NumberCalc numCalc = new NumberCalc(num);
		dao.addNumber(numCalc);
		TextScreen.setText(dao.getNumToString());
	}
	
	
}
