
import org.jointheleague.graphical.robot.Robot;
public class CircleRing {
	public static void main(String[] args) throws Exception {
		Robot ILoveCirclesBob = new Robot("batman");
		ILoveCirclesBob.setX(150);
		ILoveCirclesBob.setY(200);
		ILoveCirclesBob.penDown();
		ILoveCirclesBob.setSpeed(100000);
		for (int i = 0; i < 361; i++) {
			ILoveCirclesBob.move(3);
			ILoveCirclesBob.turn(1);
			if (i%20 == 0) {
				for (int j = 0; j<361; j++) {
					ILoveCirclesBob.move(1);
					ILoveCirclesBob.turn(1);
				}
			}
		}
	}
}
