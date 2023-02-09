public interface BankInterface {
    int getBalance();
    String depositeMoney(int amount);
    String withdraw(int amount, String enterPassword);
    double calculateInterest(int time);
}
