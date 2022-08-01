import javax.swing.*;
import java.awt.*;

public class MakaoBank {

    private JFrame frame;
    private JPanel contentPanel;
    private Account account;

    public static void main(String[] args) {
        MakaoBank application = new MakaoBank();

        application.run();
    }

    public void run() {
        account = new Account();

        frame = new JFrame("마카오 뺑쿠");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);

        initmenu();
        initcontentPanel();

    }

    private void initcontentPanel() {
        contentPanel = new JPanel();
        frame.add(contentPanel);
    }

    private void initmenu() {
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountPanel());
        panel.add(createTranferPanel());
        panel.add(createTransactionsPanel());

        frame.setVisible(true);

    }

    private JButton createAmountPanel() {
        JButton button = new JButton("잔액");
        button.addActionListener(event -> {
            JPanel amountPanel = new AmountPanel(account);
            showContentPanel(amountPanel);
        });
        return button;
    }

    private JButton createTranferPanel() {
        JButton button = new JButton("송금 할기");
        button.addActionListener(event -> {
            JPanel transferPanel = new TransferPanel(account);
            showContentPanel(transferPanel);
        });
        return button;
    }

    private JButton createTransactionsPanel() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event -> {
            JPanel transactionsPanel = new TransactionsPanel();
            showContentPanel(transactionsPanel);
        });
        return button;
    }

    private void showContentPanel(JPanel Panel) {
        contentPanel.removeAll();
        contentPanel.add(Panel);
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }
}
