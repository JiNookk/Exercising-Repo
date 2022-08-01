import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TransactionsPanel extends JPanel {
    Account account;

    TransactionsPanel(Account account1, Account account2) {
        this.account = account1;
        this.setLayout(new GridLayout(1 + account1.transactionsSize(), 1));

        this.add(new JLabel("거래 내역"));

        showTransactions(account1);
    }

    public void showTransactions(Account account) {
        for (String transaction : account.getTransactions()) {
            JLabel label = new JLabel(transaction);
            this.add(label);
        }
    }
}
