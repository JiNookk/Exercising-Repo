import javax.swing.*;
import java.awt.*;

public class AmountPanel  extends JPanel {
    Account account;
    AmountPanel(Account account) {
        this.account = account;

        this.setLayout(new GridLayout(2,1));

        number();

        amount();
    }

    private void amount() {
        long amount = account.getAmount();
        this.add(new JLabel("잔고 : " + amount + "원"));
    }

    private void number() {
        String number = account.getNumber();
        this.add(new JLabel("계좌번호: " + number));
    }
}
