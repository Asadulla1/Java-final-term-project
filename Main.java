import java.lang.*;
import Classes.*;
import Interfaces.*;
import java.util.*;
import java.util.Scanner ;
import fileio.*;
public class Main{
	public static void main(String[] args){
		System.out.println("Welcome To Student Portal");
		boolean select = true;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		StudentPortal sp = new StudentPortal();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		while(select)
		{
			
			System.out.println("1. Student Management");
			System.out.println("2. Registration");
			System.out.println("3. Payment");
			System.out.println("4. Exit\n");
			System.out.print("Select Your Desire Option : ");
			int selection1 = input.nextInt();
			switch(selection1){
				case 1: 
					System.out.println("You have selected Student Management");
					System.out.println("	1. Register New Student");
					System.out.println("	2. Remove Existing Student");
					System.out.println("	3. See All Students");
					System.out.println("	4. Go Back\n");
					System.out.print("Select Your Desire Option : ");
					int subSelection1 = input.nextInt();
					switch(subSelection1){
						case 1:
							System.out.println("You have Selected Student Registration");
							System.out.println("Enter Student Name:");
							String studentName = input2.nextLine();
							System.out.println("Enter Student Id:");
							String studentId = input.next();
							System.out.println("Enter Student Program:");
							String studentProgram = input2.nextLine();
							System.out.println("Enter Student Session:");
							String studentSession = input.next();
							Student s = new Student();
							s.setName(studentName);
							s.setId(studentId);
							s.setProgram(studentProgram);
							s.setSession(studentSession);
							
							sp.insertStudent(s);
							break;
							
						case 2:
							System.out.println("You have Selected to remove an existing Student");
							System.out.print("Enter Student Name: ");
							String name = input2.nextLine();
							sp.removeStudent(sp.getStudent(name));
							break;
						case 3:
							System.out.println("You have Selected to see all Students");
							sp.ShowAllStudents();
						break;
						case 4:
							System.out.println("You have Selected to Go Back");
							break;
						default:
							System.out.println("Invalid Selection");
							break;
					}
						break;
				case 2:
						System.out.println("Welcome to Registration");
						Registration p =new Registration();
						Student s = new Student();
						System.out.println("Enter Your Program:");
						String studentProgram = input2.nextLine();
						/*s.setProgram(studentProgram);
						p.setStudentProgram(s);*/
						if(studentProgram.equals("CSE")){
							System.out.println("CSE is Selected");
							System.out.println("Choose Your Slot");
							System.out.println("1.All Upto 18-*****-3");
							System.out.println("2.19-*****-1 to 19-*****-3");
							System.out.println("3.20-*****-3 to 20-*****-3");
							System.out.println("4.21-*****-3 to 21-*****-3");
							int slotSelection = input.nextInt();
							System.out.println("You Selected :"+ slotSelection);
							switch(slotSelection){
								case 1:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForCseSlot1();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc = new StoreCourses();
									sc.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation = input.next();
									if(confirmation.equals("Yes")||confirmation.equals("Confirm")){
										sc.showRegisteredCourses();
									}
									break;
								case 2:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForCseSlot2();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc1 = new StoreCourses();
									sc1.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation1 = input.next();
									if(confirmation1.equals("Yes")||confirmation1.equals("Confirm")){
										sc1.showRegisteredCourses();
									}
									break;
								case 3:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForCseSlot3();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc2 = new StoreCourses();
									sc2.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation2 = input.next();
									if(confirmation2.equals("Yes")||confirmation2.equals("Confirm")){
										sc2.showRegisteredCourses();
									}
									break;
								case 4:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForCseSlot4();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc3 = new StoreCourses();
									sc3.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation3 = input.next();
									if(confirmation3.equals("Yes")||confirmation3.equals("Confirm")){
										sc3.showRegisteredCourses();
									}
									break;
								default:
									System.out.println("Invalid Selection");
							}
							break;
							
						}
						//For EEE Courses
						else if(studentProgram.equals("EEE")){
							System.out.println("Welcome to EEE Department");
							System.out.println("CSE is Selected");
							System.out.println("Choose Your Slot");
							System.out.println("1.All Upto 18-*****-3");
							System.out.println("2.19-*****-1 to 19-*****-3");
							System.out.println("3.20-*****-3 to 20-*****-3");
							System.out.println("4.21-*****-3 to 21-*****-3");
							int slotSelection1 = input.nextInt();
							System.out.println("You Selected :"+ slotSelection1);
							switch(slotSelection1){
								case 1:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForEeeSlot1();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc = new StoreCourses();
									sc.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation = input.next();
									if(confirmation.equals("Yes")||confirmation.equals("Confirm")){
										sc.showRegisteredCourses();
									}
									break;
								case 2:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForEeeSlot2();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc1 = new StoreCourses();
									sc1.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation1 = input.next();
									if(confirmation1.equals("Yes")||confirmation1.equals("Confirm")){
										sc1.showRegisteredCourses();
									}
									break;
								case 3:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForEeeSlot3();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc2 = new StoreCourses();
									sc2.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation2 = input.next();
									if(confirmation2.equals("Yes")||confirmation2.equals("Confirm")){
										sc2.showRegisteredCourses();
									}
									break;
								case 4:
									System.out.println("------------------------Available Courses-------------------------------");
									p.showAvailableCoursesForEeeSlot4();
									System.out.println("------------------------End Of Available Courses------------------------");
									StoreCourses sc3 = new StoreCourses();
									sc3.setCourses();
									System.out.println("Registration Complete. If you want to see your registered courses then type Yes Or Confirm.");
									String confirmation3 = input.next();
									if(confirmation3.equals("Yes")||confirmation3.equals("Confirm")){
										sc3.showRegisteredCourses();
									}
									break;
							}
							break;
						}
						break;
				case 3:
									Payment p1 = new Payment();
									System.out.println("Welcome to Payment Section");
									p1.SetUser();
									p1.greetingsUser();
									System.out.println("1. Cash Payment");
									System.out.println("2. Online Payment");
									int userInput = input.nextInt();
							switch (userInput){
								case 1:
									p1.checkCgpa();
									break;
								case 2:
								OnlinePayment op = new OnlinePayment();
								op.setOnlinePayAbleAmount();
								break;
							}
						break;
					case 4:
							System.out.println("You have selected to exit the application");
							System.out.println("Thank you for using Student Portal");
							select = false;
							break;
						default:
							System.out.println("Invalid Input");
							break;
			}
		}
	}
}