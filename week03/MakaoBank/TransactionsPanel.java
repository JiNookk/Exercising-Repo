import javax.swing.*;
import java.awt.*;

public class TransactionsPanel extends JPanel {
    Account account;
    TransactionsPanel(Account account) {
        this.account = account;

        this.setLayout(new GridLayout((1+ account.transactionsSize()),1));

        JLabel titleLabel = new JLabel("거래내역");
        this.add(titleLabel);

        for (String transaction: account.getTransactions()){
            JLabel label = new JLabel(transaction);
            this.add(label);
        }
    }
}
