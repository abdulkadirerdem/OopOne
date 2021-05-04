package oopHomeworkOne;

public class Main {

	public static void main(String[] args) {

		Instructors instructor1 = new Instructors(1, "Engin Demiroð");
		Instructors instructor2 = new Instructors(2, "Bill Gates");
		Instructors instructor3 = new Instructors(3, "Elon Musk");

		Instructors[] instructors = { instructor1, instructor2, instructor3 };

		for (Instructors instructor : instructors) {
			System.out.println(instructor.instructor);
		}

		System.out.println("-------------");

		Camps camp1 = new Camps(1, "C# + ANGULAR", instructor2.instructor, 0);
		Camps camp2 = new Camps(2, "Java + REACT", instructor1.instructor, 0);
		Camps camp3 = new Camps(3, "Programlamaya Giriþ", instructor3.instructor, 0);

		Camps[] camps = { camp1, camp2, camp3 };

		for (Camps camp : camps) {
			System.out.println(camp.campName);
		}

		System.out.println("-------------");

		CampManager campManager = new CampManager();

		campManager.joinTheCamp(camp1);
		campManager.joinTheCamp(camp2);
		campManager.leaveTheCamp(camp3);

		System.out.println("-------------");

		Category category1 = new Category();

		category1.id = 1;
		category1.name = "Programlama";

		System.out.println(camp1.campName + ", " + camp2.campName + " ve " + camp3.campName + " " + category1.name
				+ " kategorisinde yer alýr.");
	}

}
