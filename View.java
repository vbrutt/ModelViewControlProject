
import java.io.IOException;

import javax.swing.*;

public class View extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JSlider jsld = new JSlider();

	/**
	 * 
	 */
	public View() {
		setTitle("Thermonitor");
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jl.setIcon(new ImageIcon("C:\\Users\\verab\\Documents\\Schule\\AE\\Thermostat\\knob.png"));
		jp.add(jl);
		jp.add(jsld);

		add(jp);

		validate();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {	
		String source = "";
		Controller c = new Controller(source);
		int anzahlheizungen = c.getHeizungen().size();
		new View();
	}
}