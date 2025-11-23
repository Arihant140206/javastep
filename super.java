class Bank {
    double interestRate = 5.0;

    void displayRate() {
    System.out.println("ARIHANT JAIN - RA2411026010366");
        System.out.println("Bank Interest Rate: " + interestRate + "%");
    }
}

class SBI extends Bank {
    double interestRate = 6.5;

    @Override
    void displayRate() {
        super.displayRate();  // calling parent method
        System.out.println("SBI Interest Rate: " + interestRate + "%");
    }
}

public class super{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.displayRate();
    }
}
