package bloodDonation;

import javax.swing.JOptionPane;

public class BloodDonation {
	
	//Form for blood donation intention in a city
	
	public static void main(String[] args) {

		int sampleSize = 0, canDonate = 0, cantDonate = 0, notInterested = 0, cantDonateYet = 0, nextPerson = 0;

		System.out.println(
				"Helo!\n" + "We are applying a survey of interest in blood donation in cities across the country.");

		String city = JOptionPane.showInputDialog(null, "Insert the city: ");

		String state = JOptionPane.showInputDialog(null, "Insert the state: ");

		int cityPopulation = Integer
				.parseInt(JOptionPane.showInputDialog(null, "What is the population of the " + city + "? "));
			
		int ages[] = new int[cityPopulation];
		String firstNames[] = new String[cityPopulation], lastNames[] = new String[cityPopulation], emails[] = new String[cityPopulation];
		
		do {

			while (canDonate < cityPopulation) {

				String firstName = JOptionPane.showInputDialog(null, "Insert your first name: ");

				String lastName = JOptionPane.showInputDialog(null, "Insert your last name: ");

				sampleSize++;

				int yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"Are you interested in donationg blood? Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry. Press 1 for YES and 2 for NO."));

				}

				if (yesno == 2) {
					JOptionPane.showMessageDialog(null, "Thank you for your time! Please, share this survey and help us find blood donators around the country.");
					notInterested++;
					break;
				}

				int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert your age: "));

				if (age < 16) {
					JOptionPane.showMessageDialog(null,"You need to be above 16 years old to donate blood. Plese, come back in"+ (16-age) +" year(s)!");
					cantDonateYet++;
					break;

				} else if (age > 69) {
					JOptionPane.showMessageDialog(null,
							"You need to be under 69 years old to donate blood. Thank you for your time. Please, share this survey and help us find blood donators around the country.");
					cantDonate++;
					break;
				}

				yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you weight more than 50 kg? Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry. Press 1 for YES and 2 for NO."));

				}

				if (yesno == 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"You need to be over 50 kg to donate blood. Thank you for your time.Please, share this survey and help us find blood donators around the country."));
					cantDonateYet++;
					break;
				}

				yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you have tattos? Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry. Press 1 for YES and 2 for NO."));
				}

				if (yesno == 1) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"Has it been over 1 year since you got tattooed? Press 1 for YES and 2 for NO."));
				}

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry.Press 1 for YES and 2 for NO."));
				}

				if (yesno == 1) {
					JOptionPane.showMessageDialog(null,"You can't donate blood if you got tattooed in the last 12 months. Thank you for your time. Please, share this survey and help us find blood donators around the country.");
					cantDonateYet++;
					break;
				}

				yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"Have you had hepatitis?Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry.Press 1 for YES and 2 for NO."));
				}

				if (yesno == 1) {
					JOptionPane.showMessageDialog(null,"You can't donate blood if you had hepatitis. Thank you for your time. Please, share this survey and help us find blood donators around the country.");
					cantDonate++;
					break;
				}

				yesno = Integer.parseInt(JOptionPane.showInputDialog(null,"Have you been diagnosed with any STIs or Chagas disease? Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry. Press 1 for YES and 2 for NO."));
				}

				if (yesno == 1) {
					JOptionPane.showMessageDialog(null,"You can't donate blood you have been diagnosed with these deseases. Thank you for your time. Please, share this survey and help us find blood donators around the country.");
					cantDonate++;
					break;
				}

				yesno = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Have you ever done drug injection? Press 1 for YES and 2 for NO."));

				while (yesno != 1 && yesno != 2) {
					yesno = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry. Press 1 for YES and 2 for NO."));
				}

				if (yesno == 1) {
					JOptionPane.showMessageDialog(null,"You can't donate blood if you have done drug injection. Thank you for your time. Please, share this survey and help us find blood donators around the country.");
					cantDonate++;
					break;
				}

				
				String email = JOptionPane.showInputDialog(null,"That's great!!! You can donate blood! Please, insert your email address: ");

				firstNames[canDonate] = firstName;
				lastNames[canDonate] = lastName;
				ages[canDonate] = age;
				emails[canDonate] = email;

				canDonate++;

				break;

			}

		nextPerson = Integer.parseInt(JOptionPane.showInputDialog(null,"Continue to the next person? Press 1 for YES and 2 for NO."));

		while (nextPerson != 1 && nextPerson != 2) {
				nextPerson = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid Entry.Press 1 for YES and 2 for NO."));
			}

		
		} while (nextPerson != 2);

		JOptionPane.showMessageDialog(null,"This survey was applied in " + city + " - " + state + ", a city with a population of " + cityPopulation + " people." + "\n" + "We got " + sampleSize + " answers." + "\n" + "Amount of people who can and want to donate blood: " + canDonate + "\n" + "Amount of people that are not interested in donating blood:" + notInterested + "\n" + "Amount of people who want to donate blood, but are not capable at this moment (temporary):" + cantDonateYet + "\n" + "Amount of people who want to donate blood, but are not allowed by regulation (not temporary):" + cantDonate + "\n" +"The survey indicates that it is possible to collect approximately " + ((float) canDonate / 2) + " liters of blood (" + canDonate + " bags) at the moment.");
		JOptionPane.showMessageDialog(null, "List of people who can and want to donate blood:");

		for (int i = 0; i < canDonate; i++) {
			JOptionPane.showMessageDialog(null, firstNames[i] + " " + lastNames[i] + ", " + ages[i] + " years old, " + emails[i]);
		}
	}
}

