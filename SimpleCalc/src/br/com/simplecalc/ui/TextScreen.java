package br.com.simplecalc.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class TextScreen extends JPanel {
	
	private static JTextField textScreen = new JTextField();

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TextScreen() {
		
		initialize();
	}
	
	public void initialize() {
		
		var screenBorder = new LineBorder(new Color(64, 128, 128), 10, true);
		setLayout(null);
		
		textScreen = new JTextField();
		textScreen.setFont(new Font("Arial Black", Font.BOLD, 40));
		textScreen.setToolTipText("");
		textScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		textScreen.setForeground(SystemColor.desktop);
		textScreen.setBackground(SystemColor.control);
		textScreen.setFocusable(false);
		textScreen.setBorder(screenBorder);
		textScreen.setBounds(0, 0, 304, 100);
		textScreen.setEditable(false);
		textScreen.setColumns(10);
		add(textScreen);
		
	}
	
	
	public String getText() {
		return textScreen.getText();	
	}
	
	public static void setText(String parameter) {
		try {
			textScreen.setText(parameter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addText(String parameter) {
		textScreen.setText(textScreen.getText()+parameter);
	}
	

}
