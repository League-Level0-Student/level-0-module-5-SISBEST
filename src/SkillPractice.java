import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dimesint  = Integer.parseInt(dimes);
JOptionPane.showMessageDialog(null, "That's " + dimesint*10 + " cents!");
String tall =JOptionPane.showInputDialog("How tall are you? (inches please!)");
int inttall = Integer.parseInt(tall);
if (inttall< 36) 
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}

void skill2() { 
	for (int i = 0; i<30; i++) {
		if (i%3 == 0) {
			System.out.println(i);
		}
	}
}

void skill3() {
Random iamagenerator = new Random();
int num1 = iamagenerator.nextInt(21);
int num2 = iamagenerator.nextInt(11);
JOptionPane.showMessageDialog(null, "Random Number <20 - <10 = " + (num1 - num2));
}

void skill4() {
String city = JOptionPane.showInputDialog(null, "Where do you live?");
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego!");
}
String cars = "2";
if (cars.equals("0")) {
	System.out.println("Bet you use public transport a lot!");
}
else if (cars.equals("1")){
	System.out.println("It's a Camry. Toyota.");
}
int carsint = Integer.parseInt(cars);
if (carsint > 1){
	System.out.println("Our cars have " + 4*carsint + " wheels!");
}
}
void skill5() {
String school = JOptionPane.showInputDialog(null, "What's your school?");
JOptionPane.showMessageDialog(null, "Oh! I've heard of " + school + "! It's a fantastic school, right?");
}
}