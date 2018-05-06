import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String selectnum = JOptionPane.showInputDialog(null, "Give me a number!");
		int SelectNum = Integer.parseInt(selectnum);

		for (int i = 2; i < SelectNum; i++) {
			if (SelectNum % i == 0) {
				JOptionPane.showMessageDialog(null, "That's NOT prime.");
				System.exit(2);
			}
		}
		JOptionPane.showMessageDialog(null, "PRIME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
