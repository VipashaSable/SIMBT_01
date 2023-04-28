import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ATMOperationInterface op = new ATMOperationImplementation();
        int ATM_Number = 12345;
        int ATM_Pin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine :) ");
        System.out.print("Enter ATM number : ");
        int ATM_number = sc.nextInt();
        System.out.print("Enter Pin : ");
        int PIN = sc.nextInt();
        if ((ATM_Number == ATM_number) && (ATM_Pin == PIN)) {
            while (true) {
                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3.Deposit Amount\n4. View the Mini Statement\n5. Exit");
                System.out.println("Enter the choice : ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    op.ViewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter the amount to withdraw : ");
                    double WithdrawAmt = sc.nextDouble();
                    op.WithdrawAmt(WithdrawAmt);

                } else if (ch == 3) {
                    System.out.println("Enter the amount to be deposited : ");
                    double DepositAmt = sc.nextDouble();
                    op.DepositAmt(DepositAmt);

                } else if (ch == 4) {
                    op.ViewMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect your card!!!\nThank You for using ATM Services :) ");
                    System.exit(0);
                } else {
                    System.out.println("Select correct option..");
                }
            }

        } else {
            System.out.println("Incorrect Entries!!!");
            System.exit(0);
        }
    }
}
