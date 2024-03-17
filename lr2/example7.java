package lr2;

public class example7 {
    public static void main(String[] args) {
        // Создание объекта банковского счета
        BankAccount account = new BankAccount(1000);

        // Депозит и снятие денег
        account.deposit(500);
        account.withdraw(200);

        // Получение текущего баланса
        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
    } 
}

interface BankAccountInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class BankAccount implements BankAccountInterface {
    private double balance;

    // Конструктор инициализации счета
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Метод пополнения счета
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Метод снятия денег
    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Метод получения текущего баланса
    @Override
    public double getBalance() {
        return this.balance;
    }
}