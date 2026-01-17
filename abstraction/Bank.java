package abstraction;

abstract class BankInterest {
    public abstract void getInterestRate();
}

class SBI extends BankInterest {
    public void getInterestRate() {
        System.out.println("SBI Interest rate is 8%");
    }
}

class HDFC extends BankInterest {
    public void getInterestRate() {
        System.out.println("HDFC bank interest rate is 10%");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankInterest bank;

        bank = new SBI();
        bank.getInterestRate();

        bank = new HDFC();
        bank.getInterestRate();
    }
}
