import javax.swing.*;

public class AmountPanel extends JPanel {
    AmountPanel() {
        long amount = 1000;

        JLabel label = new JLabel("잔액: " + amount + "원");

        this.add(label);
    }
}
