package Classes;
import java.util.Scanner;
public class Payment extends CashPayment{
	String userName[] = new String[20];
	Scanner sc = new Scanner(System.in);
	public  void SetUser(){
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        for(int i=0;i< userName.length;i++){
            if(userName[i] == null){
                userName[i] =name;
            }
        }
    }
	public void greetingsUser(){
		System.out.println("Hello, "+userName[0]);
        System.out.println("Select your desire Option:");
	}
	
}