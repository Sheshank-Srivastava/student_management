package studentManage;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.*;

public class mainPage extends JFrame {
	JMenu mainMenu;
	JMenuItem mi1,mi2,mi3;
	JMenuBar mb;
	public mainPage() {
		mainMenu = new JMenu("file");
		mi1 = new JMenuItem("New");
		mi2 = new JMenuItem("New");
		mi3 = new JMenuItem("New");
		mainMenu.add(mi1);mainMenu.add(mi2);mainMenu.add(mi3);
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		setTitle("SMS-HOME PAGE");
		setBounds(0,0,600,600);
		setResizable(true);
		setLayout(null);
	}

}
