import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MakaoBank {
    private JFrame frame;
    private JPanel contentPanel;

    private JPanel upperContentPanel;
    private JPanel lowerContentPanel;
    private ArrayList<Account> accounts;

    public static void main(String[] args){
        MakaoBank application = new MakaoBank();

        application.run();
    }

    public void run() {
        accounts = new ArrayList<>();
        Account accountWook = new Account(500000, "302-1066-0044-51 농협 오진욱");
        accounts.add(accountWook);

        Account accountSung = new Account(30000, "302-1043-9642-31 농협 오진성");
        accounts.add(accountSung);

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
        upperContentPanel.setBackground(Color.green);
        contentPanel.add(upperContentPanel);

        lowerContentPanel = new JPanel();
        lowerContentPanel.setBackground(Color.RED);
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
            AmountPanel amountPanel1 = new AmountPanel(accounts.get(0));
            amountPanel1.setBackground(Color.gray);
            updatePanel(amountPanel1, upperContentPanel);

            AmountPanel amountPanel2 = new AmountPanel(accounts.get(1));
            amountPanel2.setBackground(Color.BLUE);
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
        container.removeAll();
        container.add(panel);
    }
}