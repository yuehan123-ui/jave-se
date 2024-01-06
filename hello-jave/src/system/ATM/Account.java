package system.ATM;

public class Account {
    private String cardnumber;//卡号
    private String name;//用户名
    private String accountpassward;//密码
    private double balance;//余额

    public Account() {
    }

    public Account(String cardnumber, String name, String accountpassward, double balance) {
        this.cardnumber = cardnumber;
        this.name = name;
        this.accountpassward = accountpassward;
        this.balance = balance;
    }

    public String getCardnumber(){
        return cardnumber;
    }
    public void setCardnumber(String cardnumber){
        this.cardnumber = cardnumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAccountpassward(){
        return accountpassward;
    }

    public void setAccountpassward(String accountpassward) {
        this.accountpassward = accountpassward;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
