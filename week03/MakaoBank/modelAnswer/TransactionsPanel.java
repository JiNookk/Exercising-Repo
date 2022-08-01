import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TransactionsPanel extends JPanel {
    Account account;

    TransactionsPanel(Account account) {
        this.account = account;
        this.setLayout(new GridLayout(1 + account.transactionsSize(), 1));

        this.add(new JLabel("거래 내역"));

        showTransactions(account);
    }

    public void showTransactions(Account account) {
        for (String transaction : account.getTransactions()) {
            JLabel label = new JLabel(transaction);
            this.add(label);
        }
    }
}
