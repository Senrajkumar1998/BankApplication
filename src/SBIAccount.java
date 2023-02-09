import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
   private String accountNo;
    private int balance;
    private String password;
    private double rateofInterest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateofInterest=6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofInterest() {
        return rateofInterest;
    }

    public void setRateofInterest(double rateofInterest) {
        this.rateofInterest = rateofInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int amount) {
        this.balance+=amount;
        return "paisa hi paisa"+ amount;
    }

    @Override
    public String withdraw(int amount,String enterPassword) {
        if(enterPassword.equals(this.password)){
            if(balance<amount){
                return "insufficient money";
            }else{
                balance-=amount;
                return "Money deducted";
            }
        }else{
            return "Password is not correct";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateofInterest*time)/100.0;
    }
}
