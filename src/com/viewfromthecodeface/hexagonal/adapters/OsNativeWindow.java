package com.viewfromthecodeface.hexagonal.adapters;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OsNativeWindow extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel jLabel;

	public OsNativeWindow() {
		initComponents();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Guess Number Game");
		setResizable(true);
		setPreferredSize(new Dimension(400, 100));
		pack();
	}
	
	public void setLabelText(String text) {
		this.jLabel.setText(text);
	}


	private void initComponents() {
		jLabel = new javax.swing.JLabel();

		jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLUE));
		jLabel.setForeground(Color.RED);
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setText("A");

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(jLabel, BorderLayout.CENTER);
	}
}
