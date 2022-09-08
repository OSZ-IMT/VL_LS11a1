/*
 * Created on 09.05.2022 by Kay Patzwald
 */
package de.oszimt.ls11a1.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 * Main window of the app
 * 
 * @author Kay Patzwald
 *
 */
public class MainWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4224163010102513869L;
	private final JPanel contentPane;
	private final JLabel lblHeader;

	public MainWindow() {
		this.setTitle("Handwerker Service Eulenstein GmbH");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);

		lblHeader = new JLabel("Header");
		lblHeader.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setBackground(SystemColor.windowBorder);
		contentPane.add(lblHeader, BorderLayout.NORTH);
	}
	
	/**
	 * Launch the application.
	 */
	public void init() {
		setVisible(true);
	}
	
	public void setActivePanel(String header, JPanel panel) {
		lblHeader.setText(header);
		lblHeader.invalidate();
		if (contentPane.getComponentCount() >= 2)
			contentPane.remove(1);
		contentPane.invalidate();
		contentPane.add(panel, BorderLayout.CENTER);

	}
}
