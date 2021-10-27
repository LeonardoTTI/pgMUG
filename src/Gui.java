package pgMUG;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame{
    private static final String titolo = "pgMUG";
    private static final int w = 1000, h = 1000;
    private static final JPanel topB = new JPanel(new FlowLayout());

    private static final JPanel centerP = new JPanel(new GridLayout(1,1));
    private static final JLabel queryConsoleL = new JLabel("Console");
    private static final JTextArea consoleA = new JTextArea(20, 50);
    private static final JScrollPane scrollConsole = new JScrollPane(consoleA);

    private static final JPanel eastP = new JPanel(new GridLayout(1,1));
    private static final JTextArea report = new JTextArea(10,50);

    private static final JPanel bottomB = new JPanel(new FlowLayout());
    private static final JButton runB = new JButton("Run");

	public Gui() {
        super(titolo);
		this.setSize(w,h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		topB.add(queryConsoleL);
		centerP.add(scrollConsole);
		eastP.add(report);
		bottomB.add(runB);
		//
		Container frmContentPane = this.getContentPane();
		frmContentPane.add(topB, BorderLayout.NORTH);
		frmContentPane.add(centerP, BorderLayout.CENTER);
		frmContentPane.add(eastP, BorderLayout.EAST);
		frmContentPane.add(bottomB, BorderLayout.SOUTH);
		//
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
