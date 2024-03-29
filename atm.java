import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1000;
        int select;
        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("ardil") && password.equals("ardil")) {
                System.out.println("Hello, welcome to Bank!");
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please select the operation you want to perform: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Amount to deposit: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Amount to withdraw: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Your balance: " + balance);
                    }
                } while (select != 4);
                System.out.println("Goodbye.");
                break;
            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }
    }
}

