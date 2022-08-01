import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
    Account account;

    AmountPanel(Account account) {
        this.account = account;

        this.setLayout(new GridLayout(3,1));

        this.add(new JLabel(accountNumber()));

        this.add(new JLabel(amount()));
    }

    private String accountNumber() {
        String number = account.getNumber();

        return number;
    }

    private String amount() {
        long amount = account.getAmount();

        return "잔액: " + amount + "원";
    }
}
