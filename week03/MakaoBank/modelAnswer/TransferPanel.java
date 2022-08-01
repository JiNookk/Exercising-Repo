import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {
    Account account;
    private int transfer;
    private long transferAmount;

    TransferPanel(Account account) {
        this.account = account;
        this.setLayout(new GridLayout(10, 1));

        this.add(new JLabel("송금하기"));


        JTextField textField = new JTextField(10);
        this.add(textField);


        JButton button = new JButton("송금");
        button.addActionListener(event -> {
            account.transfer(textField.getText());
//            showTransferAmount(account);
        });
        this.add(button);

    }

//    public void showTransferAmount(Account account) {
//        for (String transferAmount : account.getTransferAmount()) {
//            JLabel label = new JLabel(transferAmount);
//            this.add(label);
//        }
//    }
}
