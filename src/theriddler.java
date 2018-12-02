import javax.swing.JOptionPane;

public class theriddler {
	public static void main(String[] args) {
		int playerscore = 0;
		String planet;
	planet = JOptionPane.showInputDialog("What's the red planet?");
		if(planet.equals("mars")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		playerscore = 1;
		}

	if(null != null) {
		JOptionPane.showMessageDialog(null, "Wrong! The correct answer is " + planet);
	}
	}
}
