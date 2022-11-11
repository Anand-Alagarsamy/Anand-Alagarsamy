package Student;
import java.util.*;


public class StudentTest {
	
	static Scanner s = new Scanner(System.in);
	static ArrayList<Student> arrayList; 
	static boolean exit=true;
	public static void main(String[] args) {
		arrayList= new ArrayList<Student>();
		
		arrayList.add(new Student(04,"John",21,88));
		arrayList.add(new Student(32,"ken",16,80));
		arrayList.add(new Student(27,"Maddy",18,82));
		arrayList.add(new Student(01,"Mark",23,88));
		arrayList.add(new Student(67,"Musk",20,98));
		arrayList.add(new Student(19,"Brad",19,92));

		
		for (Student object : arrayList) {
			System.out.println(object);
		}
		display();
		
		do {
			System.out.println("Do you want to continue press yes");
			String contin = s.next();
			if (contin.equalsIgnoreCase("yes")) {
				display();
			} else if (contin.equalsIgnoreCase("no")) {
				System.out.println("Thanks for using our app");	
				exit = false;
			} else {
				System.out.println("Please check the input");
			}
			
		} while (exit);
	}
	public static void display() {
		System.out.println("Choose the input which you want to sort in the table");
		System.out.println("1.Choose one for sorting the table by id");
		System.out.println("2.Choose two for sorting the table by name");
		System.out.println("3.Choose three for sorting the table by age");
		System.out.println("4.Choose four for sorting the table by mark");
		System.out.println("5.Exit");
		
		int input = s.nextInt();
		switch (input) {
		case 1 :
				{
				Collections.sort(arrayList,new SortById());
				for (Student studentId : arrayList) {
				System.out.println(studentId);
				}
				break;
				}
			
		case 2 :
				{
				Collections.sort(arrayList,new SortByName());
				for (Student studentName : arrayList) {
				System.out.println(studentName);
				}
				break;
				}
		
		case 3 :
				{
				Collections.sort(arrayList,new SortByAge());
				for (Student studentAge : arrayList) {
				System.out.println(studentAge);	
				}
				break;
				}
				
		case 4 :{	
				Collections.sort(arrayList,new SortbyMark());
				for (Student studentMark : arrayList) {
				System.out.println(studentMark);
				}
				break;
				}
				
		default :
				{
				System.out.println("Please enter the vaild input");
				break;
				}
				
		}
	
	}
}
