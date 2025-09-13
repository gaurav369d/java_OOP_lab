// 3. BankAccount Class
class BankAccount {
    String owner;
    double balance;
    double overdraftLimit;

    BankAccount(String owner, double balance, double overdraftLimit) {
        this.owner = owner;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        System.out.println("Deposited " + amount + ", Balance: " + balance);
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (balance - amount < -overdraftLimit) {
            System.out.println("Transaction failed! Insufficient funds.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", Balance: " + balance);
        return true;
    }

    public String toString() {
        return "Owner: " + owner + ", Balance: " + balance + ", Overdraft: " + overdraftLimit;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Bob", 100, 50);
        acc.deposit(50);
        acc.withdraw(120);
        acc.withdraw(50);
        System.out.println(acc);
    }
}
