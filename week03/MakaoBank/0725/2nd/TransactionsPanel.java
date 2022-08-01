import javax.swing.*;
import java.awt.*;
import java.util.List;


public class TransactionsPanel extends JPanel {
    private List<String> transactions;
    private Account account;

    TransactionsPanel(Account account) {
        this.account = account;

        this.setLayout(new GridLayout(1 + account.getTransactions().size(), 1));

        account.getTransactions().add("해킹");

        sendTransaction();
    }

    private void sendTransaction() {
        for (String transaction : account.getTransactions()) {
            this.add(new JLabel(transaction));
        }
    }
}
