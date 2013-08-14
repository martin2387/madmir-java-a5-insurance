import javax.swing.JOptionPane;

public class InsurancePremium {

	public static void main(String[] args) {
		//Declare variables
		int curYear, birthYear, prem;
		
		//User input
		curYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the current year:"));
		birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your birth year:"));
		
		prem = calculatePremium(curYear, birthYear);
		
		JOptionPane.showMessageDialog(null, "Your insurance premium is $" + prem);
					
	}
	
	public static int calculatePremium(int cy, int by) {
		//Declare variables
		int age = cy - by;
		int decades = age / 10;
		int premium = (decades + 15) * 20;
		return premium;
	}

}
