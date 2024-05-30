public class Main {
    public static void main(String[] args) {

        //BankAccount bankAccount = new BankAccount("12345", 500, "Bob", "bob@gmail.com", "15145155");
        BankAccount bankAccount = new BankAccount();

//        bankAccount.setAccountNumber("12345");
//        bankAccount.setAccountBalance(1000);
//        bankAccount.setCustomerName("Bob");
//        bankAccount.setEmail("bob@bob.com");
//        bankAccount.setPhoneNumber("6566484515");

        bankAccount.depositAmount(500);
        bankAccount.withDrawAmount(700);

        bankAccount.withDrawAmount(500);

        bankAccount.depositAmount(100);
    }
}
