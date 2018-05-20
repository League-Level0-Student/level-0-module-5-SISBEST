import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		String nums = JOptionPane.showInputDialog("How many Fibonacci numbers?");
		int Nums = Integer.parseInt(nums);
		int a = 0;
		int b = 1;
		for (int i = 0; i<Nums; i++) {
			int next = a+b;
			a = b;
			b = next;
			System.out.println(next);
		}
	}
}
 