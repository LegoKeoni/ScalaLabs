// Modified bank account example
// Original author: Robert Keller

class BankAccountJava {
    int balance;
    private int number;
    String owner;
    static int last_acct = 0; // account number counter

    public BankAccountJava(String owner,
                           int initial_balance) {
        this.owner = owner;
        balance = initial_balance;
        number = ++last_acct;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void statement() {
        System.out.println("Balance in account number " +
                number + " is " + balance);
    }

    public static void main(String[] args) {
        PreBankAccountJava a, b, c;

        a = new PreBankAccountJava("Jens", 15000);
        b = new PreBankAccountJava("Yens", 200000);
        c = new PreBankAccountJava("Yenz", 100000);

        b.deposit(5000);
        c.deposit(50000);

        a.statement();
        b.statement();
        c.statement();
    }
}