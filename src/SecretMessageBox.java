import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password = "muna";
		String secretmessage;
		 secretmessage = JOptionPane.showInputDialog("Write a secret message");
JOptionPane.showInputDialog("Guess the password and you'll be able to see the secret message");
if(password.equals ("muna")) {
	JOptionPane.showMessageDialog(null, secretmessage);
	}
if(password.equals(null));
JOptionPane.showMessageDialog(null, "INTRUDER");
	}
}
