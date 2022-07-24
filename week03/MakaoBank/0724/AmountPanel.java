import javax.swing.*;
import java.awt.*;

public class AmountPanel extends JPanel {
    private final Account account;

    AmountPanel(Account account) {
        this.setLayout(new GridLayout(3, 1));

        this.account = account;

        this.add(new JLabel(getNumber()));

        this.add(new JLabel(amount()));
    }

    private String getNumber() {
        return "계좌번호 : " + account.getNumber() + "원";
    }

    private String amount() {
        return "잔액 : " + account.getAmount() + "원";
    }
}
