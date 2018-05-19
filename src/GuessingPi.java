
import javax.swing.JOptionPane;
public class GuessingPi {
	public static void main(String[] args) {
		String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502";
					for (int i = 0; i<10; i++) {
						
						String guess = JOptionPane.showInputDialog(null, "What's the next digit of pi?");
						System.out.println(pi.charAt(i));
						if (guess.charAt(0) == (pi.charAt(i))){
							System.out.println("Correct!");
						}
						else {
							System.out.println("INCORRECT! It was " + (pi.charAt(i)));
							System.exit(i);
						}
					}
	}
}
