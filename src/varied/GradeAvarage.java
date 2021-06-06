package varied;

import java.util.Scanner;

public class GradeAvarage {
	
	public static void main(String[] args) {
		//Receive a student's name with their respective 2 grades, then calculate the student's average 
		//and present at the end the calculated average and the student's approval status.
		//(approved with average> = 6).

		//Testing with 3 students.
		//Calculate and show the overall class average
				
		
		Scanner read = new Scanner(System.in);
		
		String student;
		
		int i;
		
		float grade1, grade2, average, sum, classAverage;
		
		sum = 0;
		for(i = 0; i<3; i++) {
			
			System.out.print("Student's name: \n");
			student = read.nextLine();
			
			System.out.print("Grade 1 : \n");
			grade1 = read.nextFloat();
			
			System.out.print("Grade 2: \n");
			grade2 = read.nextFloat();
			
			read.nextLine();
			
			average = (grade1 + grade2)/2;
			sum = sum + average;
			
			System.out.printf("The " + student +"'s average is: %.1f\n", average);
			
			if (average >= 6) {
				System.out.println("Aproved. Congratulations\n");
			}
			else 
				System.out.println("Disapproved. You should study more\n");
		}
		
		
		classAverage = sum/3;
		System.out.printf("The class average is: %.1f\n", classAverage);
		
		
	}

}
