
package atmprojectwithoop;

public class AtmProjectWithOOP {

    public static void main(String[] args) {
       ATM atm = new ATM();
       Account account = new Account("Yilmaz", "12345", 2000);
       atm.work(account);
        System.out.println("Goodbye..");
    }
    
}
