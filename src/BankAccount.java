public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositAmount(double amount) {
        accountBalance += amount;
        System.out.println("The Amount deposited = $" + amount + " and balance = $" + accountBalance);
    }

    public void withDrawAmount(double amount) {

        if ((accountBalance - amount) < 0) {
            System.out.println("Insufficient balance, earn money dude!!, you only have $" + accountBalance +
                    " in your account");

        } else {
            accountBalance -= amount;
            System.out.println("The Amount withdraw = $" + amount + " and final balance = $" + accountBalance);
        }
    }
}
