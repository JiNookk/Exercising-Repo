import javax.swing.*;
import java.awt.*;

public class MakaoBank {
    private JFrame frame;
    private JPanel contentPanel;
    private Account accountWook;
    private Account accountSung;
    private JPanel upperContentPanel;
    private JPanel lowerContentPanel;

    public static void main(String[] args){
        MakaoBank application = new MakaoBank();

        application.run();
    }

    public void run() {
        accountWook = new Account(500000, "302-1066-0044-51 농협 오진욱");
        accountSung = new Account(30000, "302-1043-9642-31 농협 오진성");

        frame = new JFrame("MakaoBank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        initMenu();
        initContentPanel();

        frame.setVisible(true);
    }

    private void initContentPanel() {
        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2,1));

        upperContentPanel = new JPanel();
//        upperContentPanel.add(new JLabel("HI"));
        contentPanel.add(upperContentPanel);

        lowerContentPanel = new JPanel();
//        lowerContentPanel.add(new JLabel("HI"));
        contentPanel.add(lowerContentPanel);

        frame.add(contentPanel);
    }

    public void initMenu() {
        JPanel panel = new JPanel();

        frame.add(panel, BorderLayout.PAGE_START);

        panel.add(createAmountButton());

        panel.add(createTransferButton());

        panel.add(createTransactionsButton());
    }

    private JButton createAmountButton() {
        JButton button = new JButton("잔액 내역");
        button.addActionListener(event -> {
            AmountPanel amountPanel1 = new AmountPanel(accountWook);

            updatePanel(amountPanel1, upperContentPanel);

//            showContentPanel(upperContentPanel);

            AmountPanel amountPanel2 = new AmountPanel(accountSung);

            updatePanel(amountPanel2, lowerContentPanel);

            showContentPanel(contentPanel);
        });
        return button;
    }

    private JButton createTransferButton() {
        JButton button = new JButton("송금");
        button.addActionListener(event -> {
//            TransferPanel transferPanel = new TransferPanel(accountWook);
//            showContentPanel(transferPanel);
        });
        return button;
    }

    private JButton createTransactionsButton() {
        JButton button = new JButton("거래 내역");
        button.addActionListener(event -> {
//            TransactionsPanel transactionsPanel = new TransactionsPanel(accountWook, accountSung);
//            showContentPanel(transactionsPanel);
        });
        return button;
    }

    private void showContentPanel(JPanel container) {
        container.setVisible(false);
        container.setVisible(true);
        frame.setVisible(true);
    }

    private void updatePanel(JPanel panel, JPanel container) {
        contentPanel.removeAll();
        contentPanel.add(panel);
    }
}