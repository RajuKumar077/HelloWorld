package org.studyeasy;

class Two{
	float salary = 40000;
}

class Programmer1 extends Two {
	int bonus = 10000;

	public static void main(String args[]) {
		Programmer1 p = new Programmer1();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}