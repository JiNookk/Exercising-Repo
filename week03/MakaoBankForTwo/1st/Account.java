import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount ;
    private String number ;
    private List<String> transactions = new ArrayList<>();
    private List<String> transferAmount = new ArrayList<>();

    Account(long amount, String number){
        this.amount = amount;
        this.number = number;
    }


    public long getAmount() {
        return amount;
    }


    public void transfer(String transferAmount) {
        this.transferAmount.add(transferAmount);

        this.amount -= Long.parseLong(transferAmount);

        this.transactions.add("송금 : " + transferAmount + "원");
    }

    public String getNumber() {
        return number;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public int transactionsSize() {
        return transactions.size();
    }

//    public List<String> getTransferAmount() {
//        return transferAmount;
//    }
}
