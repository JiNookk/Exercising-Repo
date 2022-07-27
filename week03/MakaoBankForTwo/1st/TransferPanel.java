import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    Account account;

    TransferPanel(Account account) {
        this.account = account;
        this.setLayout(new GridLayout(10, 1));

        this.add(new JLabel("송금하기"));

        JTextField textField = new JTextField(10);
        this.add(textField);

        JButton button = new JButton("송금");

        button.addActionListener(event -> {
            account.transfer(textField.getText());
        });

        this.add(button);
    }
}
