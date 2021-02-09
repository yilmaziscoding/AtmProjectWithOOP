
package atmprojectwithoop;

import java.util.Scanner;


public class ATM {
    public void work(Account account){
        Login login= new Login();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the Bank");
        System.out.println("********************");
        System.out.println("User Login");
        System.out.println("********************");
        int loginRight=3;
        while (true)
        {
            if(login.login(account))
            {
                System.out.println("Login successful!");
                break;
            }
            else{
                System.out.println("Login unsuccessful!");
                loginRight-=1;
                System.out.println("Login Right: "+loginRight);
            }
            if(loginRight==0){
                System.out.println("Run out of login right!");
                return;
            }
        }
        System.out.println("*************************************");
        String transactions="1. Balance Display\n"
                +"2. Deposit Money\n"
                +"3. Withdraw Money\n"
                +"Press Q for Quit";
        System.out.println(transactions);
        System.out.println("*************************************");
        
        while(true){
            System.out.println("Choose the action: ");
            String action= scanner.nextLine();
            
            if(action.equals("Q")){
                break;
            }
            else if(action.equals("1")){
                System.out.println("Your Balance: "+account.getBalance());
            }
            else if (action.equals("2")){
                System.out.println("Enter the amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.depositMoney(amount);
                
            }
            else if(action.equals("3")){
                System.out.println("Enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawMoney(amount);
                
            }
            else{
                System.out.println("Invalid action! ");
            }
        }
    }
}
