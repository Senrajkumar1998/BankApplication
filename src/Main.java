import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name, Enter your password and initial amount");
        String name= sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIAccount rajuAcc=new SBIAccount(name,balance,password);
        System.out.println("Your Account has been created with account number:"+rajuAcc.getAccountNo());

        //getBalance
        System.out.println("your current balance:"+rajuAcc.getBalance());

        //deposite money
        System.out.println(rajuAcc.depositeMoney(500));
        System.out.println("New balacnceis: " +rajuAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn:");
        int amount= sc.nextInt();
        System.out.println("Enter your password:");
        String enterPassword=sc.next();
        System.out.println(rajuAcc.withdraw(amount,enterPassword));
        System.out.println("your current balance: "+rajuAcc.getBalance());

        //calculate interest
        System.out.println("Interest current balance: "+rajuAcc.getBalance()+" is "+rajuAcc.calculateInterest(4));
    }
}