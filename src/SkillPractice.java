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
// Use pop-ups for the following.
// Ask the user how many dimes they have




// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)




// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 







}

void skill3() { // Get a random number that is less than 20 and print it to the console 



// Get another random number that is less than 10 and print it to the console 



// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



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