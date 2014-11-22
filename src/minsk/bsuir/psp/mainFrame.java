package minsk.bsuir.psp;

import java.awt.*;

import javax.swing.*;

public class mainFrame extends Frame {
	public mainFrame(final String Name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Toolkit KIT = Toolkit.getDefaultToolkit();
				Dimension screenSize = KIT.getScreenSize();
				JFrame Frame = new JFrame();
				Frame.setSize(screenSize.width / 4, screenSize.height * 3 / 5);
				Frame.setLocationByPlatform(true);
				Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Frame.setVisible(true);
				Frame.setResizable(false);
				Frame.setTitle(Name);
			}
		});
	}
};
