package OOPS;

public class Bank {
    private String customerName;
    private long accountNum;
    private long balance;
    private long phone;
    private String email;

    public Bank(){
        this("defaultName", 78578, 1, 890685678, "gg@ww.com");
    }

    public Bank(String customerName, long accountNum, long balance, long phone, String email) {
        this.customerName = customerName;
        this.accountNum = accountNum;
        this.balance = balance;
        this.phone = phone;
        this.email = email;
    }

    public void deposit(long amount){
        setBalance(balance+amount);
    }

    public void withdraw(long amount){
        if(amount>balance){
            throw new RuntimeException("not enough balance");
        }else{
            setBalance(balance-amount);
        }

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customerName='" + customerName + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
