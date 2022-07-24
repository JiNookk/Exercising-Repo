import javax.swing.*;

public class AmountPanel extends JPanel {
    AmountPanel(Account account){

        long amount = account.getamount();

        JLabel label = new JLabel(""+amount);
        this.add(label);

    }
}
