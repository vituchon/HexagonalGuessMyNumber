package com.viewfromthecodeface.hexagonal.adapters;

import com.viewfromthecodeface.hexagonal.domain.Display;

public class OsGUIDisplay implements Display {
	private OsNativeWindow window;
	
	public OsGUIDisplay() {
		this.window = new OsNativeWindow();
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				OsGUIDisplay.this.window.setLocationRelativeTo(null);
				OsGUIDisplay.this.window.setVisible(true);
			}
		});
	}

	@Override
	public void show(String text) {
		this.window.setLabelText(text);
	}
}
