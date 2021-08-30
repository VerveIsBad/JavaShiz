import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       
	   Customer c1 = new Customer();

	   c1.firstName = firstName;
	   c1.secondName = secondName;
	   c1.age = age;
	   c1.roomNumber = roomNumber;

       customer.saveCustomerInfo();
   }
}

