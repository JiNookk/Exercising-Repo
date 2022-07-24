import java.util.ArrayList;
import java.util.List;

public class Account {
    private long amount = 1000;
    private String accountNumber = "302-1066-0044-51";
    List<String> transactions = new ArrayList<>();

    public String getNumber() {
        return accountNumber;
    }

    public long getAmount() {
        return amount;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public long transfer(long transferAmount) {
        amount -= transferAmount;

        transactions.add("돈 보냈다~");
        return amount;
    }

    public int transactionsSize() {

        return transactions.size();
    }
}
