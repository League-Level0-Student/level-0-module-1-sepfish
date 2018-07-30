import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday? Input mm/dd, e.g. 04/23");
		if (birthday.equals("07/30")) {
			JOptionPane.showMessageDialog(null, "Well, happy birthday!");
			} else {
			JOptionPane.showMessageDialog(null, "Well, I hope you have a very merry unbirthday!");
			}
		}
	}

