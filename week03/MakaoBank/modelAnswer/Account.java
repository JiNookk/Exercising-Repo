import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount = 100000;
    private final String number = "302-1066-0044-51";
    private List<String> transactions = new ArrayList<>();
    private List<String> transferAmount = new ArrayList<>();

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
