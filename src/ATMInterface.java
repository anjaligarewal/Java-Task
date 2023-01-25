import java.util.Scanner;

public class ATMInterface {
 
    public static void main(String[] args) {
 
        String userName = "Anjali Garewal";
        String password = "anjali@123";
        String bankName = "SBI Bank";
        double userBalance = 10000;
 
        Scanner bank1 = new Scanner(System.in);

        System.out.println("Welcome to " + bankName);
        
        System.out.println("Please Enter Your Bank PIN Number ");
        String enteredPin = bank1.nextLine();
        
        if (enteredPin.equalsIgnoreCase(password)) {
            System.out.println("Account User Name : " + userName);
            System.out.println("Please choose any the following options ");
            
            System.out.println("1 - Display Balance");
            System.out.println("2 - Deposite Amount");
            System.out.println("3 - Withdraw Amount");
            System.out.println("4 - Exit");

            
            int userChoice = bank1.nextInt();
            
            if (userChoice == 1) {
                System.out.println("Your Current Balance is " + userBalance);
            } 
            
            else if (userChoice == 2) {
                System.out.println("Please Enter The Amount To Deposit ");
                double depositAmount = bank1.nextDouble();
                
                userBalance += depositAmount;
                System.out.println("You have successfully deposited " + depositAmount
                        + " \nNow your balance is " + userBalance);
            } 
            
            else if (userChoice == 3) {
                System.out.println("Please Enter the Amount to Witdraw");
                double withdrawAmount = bank1.nextDouble();
                
                if (withdrawAmount > userBalance) {
                    System.out.println("Insufficient Balance. Please Try Again");
                } else {
                    userBalance -= withdrawAmount;
                    System.out.println("You have successfully withdraw " + withdrawAmount
                            + " \nNow your balance is " + userBalance);
                }
            }
            
            else if (userChoice == 4){
                System.exit(0);
            }
        }
 
    }
 
}