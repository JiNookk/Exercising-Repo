import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount = 100000;
    private String number = "302-1066-0044-51";
    private long transferAmount;
    private List<String> transactions = new ArrayList<>();

    public static void main(String[] args){
        Account account = new Account();

        System.out.println(account.amount);
        account.transfer("1000");
        System.out.println(account.amount);
        account.transfer("500");
        System.out.println(account.amount);

        for (String transaction: account.transactions){
            System.out.println(transaction);
        }
    }


    public String getNumber() {
        return number;
    }

    public long getAmount() {
        return amount;
    }

    public void transfer(String transferAmount) {
        this.transferAmount = Long.parseLong(transferAmount);

        amount -= this.transferAmount;

        transactions.add("송금 : " + this.transferAmount + "원");
    }

    public List<String> getTransactions() {
        ArrayList<String> copy = new ArrayList<>(transactions);
        return copy;
    }
}
