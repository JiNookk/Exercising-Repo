import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
                //TODO : 왜 안쓰지?
    private JPanel panel;
    private JTextField textField;
    private CoreCalculator coreCalculator;


    public static void main(String[] args) {
        SimpleCalculator application = new SimpleCalculator();
        application.run();
    }

    private void run() {
        coreCalculator = new CoreCalculator();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        textField = new JTextField(10);
        textField.setEditable(false);
        updateNumber(coreCalculator.getCurrentNumber());
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.PAGE_START);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4, 3));

        initNumber();
        initOperator();

        frame.pack();
        frame.setVisible(true);
    }

    private void initNumber() {
        for (int i = 1; i <= 10; i += 1) {
            int number = i % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                coreCalculator.currentNumber(number);
                updateNumber(coreCalculator.getCurrentNumber());
            });
            panel.add(button);
        }
    }

    private void initOperator() {
        for (String operator : coreCalculator.OPERATORS) {
            JButton button = new JButton(operator);
            button.addActionListener(e -> {
                coreCalculator.calculate(operator);
                updateNumber(coreCalculator.getAccumulator());
            });
            panel.add(button);
        }
    }

    public void updateNumber(long number) {
        textField.setText(Long.toString(number));
    }
}
