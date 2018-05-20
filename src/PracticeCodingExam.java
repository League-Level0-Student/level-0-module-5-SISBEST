

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class PracticeCodingExam {
	public static void main(String[] args) {
		Robot ExamBob = new Robot();
		String sqnums = JOptionPane.showInputDialog(null, "How many squares?");
		int colorChoice = JOptionPane.showOptionDialog(null, "Choose a color:", "ColorChoice",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Green", "Blue" }, 0);
		int sqnum = Integer.parseInt(sqnums);
		String speedstr = JOptionPane.showInputDialog(null, "Speed?");
		int speed = Integer.parseInt(speedstr);
		ExamBob.setPenWidth(10);
		ExamBob.penDown();
		ExamBob.setSpeed(speed);
		if (colorChoice == 0) {
			ExamBob.setPenColor(255, 0, 0);
			for (int i = 0; i < sqnum; i++) {
				for (int ii = 0; ii < 4; ii++) {
					ExamBob.move(100);
					ExamBob.turn(90);
				}
				System.out.println(i+1);
				ExamBob.penUp();
				ExamBob.turn(90);
				ExamBob.move(200);
				ExamBob.penDown();
			}
		} else if (colorChoice == 1) {
			ExamBob.setPenColor(0, 255, 0);
			for (int i = 0; i < sqnum; i++) {
				for (int ii = 0; ii < 4; ii++) {
					ExamBob.move(100);
					ExamBob.turn(90);
				}
				System.out.println(i+1);
				ExamBob.penUp();
				ExamBob.turn(90);
				ExamBob.move(200);
				ExamBob.penDown();
			}
		} else if (colorChoice == 2) {
			ExamBob.setPenColor(0, 0, 255);
			for (int i = 0; i < sqnum; i++) {
				for (int ii = 0; ii < 4; ii++) {
					ExamBob.move(100);
					ExamBob.turn(90);
				}
				System.out.println(i+1);
				ExamBob.penUp();
				ExamBob.turn(90);
				ExamBob.move(200);
				ExamBob.penDown();
			}
		}
	}
}