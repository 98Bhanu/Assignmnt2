package com.controlstatement;

public class Ladder1 {

	public static void main(String[] args) {
		int a=40;
		
		if (100>a && a>90) {
System.out.println("The student is passed with A grade and with marks "+a);			
		}
		else if (a>60 && a<90) {
			System.out.println("The student passed with B grade and with marks "+a);
		}
		else if (a>33 && a<60) {
			System.out.println("The student passed with C grade and with the marks "+a);
		}
		else {
			System.out.println("The student failed in the exam with F grade with the marks "+a);
		}
	}

}
