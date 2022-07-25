import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    private JFrame frame;
    private long currentNumber = 0;
    private JTextField textField;
    private JPanel panel;
    private long accumulator = 0;
    private String currentOperator = "";

    public static void main(String[] args) {
        SimpleCalculator application = new SimpleCalculator();
        application.run();
    }

    private void run() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        initMenu();
        initNumber();
        initOperator();


        frame.pack();
        frame.setVisible(true);
    }

    private void initMenu() {
        textField = new JTextField(10);
        frame.add(textField, BorderLayout.PAGE_START);
        textField.setEditable(false);
        showCurrentNumber();
        textField.setHorizontalAlignment(JTextField.RIGHT);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4, 3));


    }

    private void initNumber() {
        for (int i = 1; i <= 10; i += 1) {
            int number = i % 10;
            JButton button = new JButton(Integer.toString(number));
            button.addActionListener(event -> {
                currentNumber *= 10;
                currentNumber += number;
                showCurrentNumber();
            });
            panel.add(button);
        }
    }

    private void initOperator() {
        String[] operators = new String[]{"+", "-", "/", "*", "="};

        for (String operator : operators) {
            JButton button = new JButton(operator);
            button.addActionListener(e -> {
                switch (currentOperator) {
                    case "" -> accumulator = currentNumber;
                    case "+" -> accumulator += currentNumber;
                    case "-" -> accumulator -= currentNumber;
                    case "*" -> accumulator *= currentNumber;
                    case "/" -> accumulator /= currentNumber;
                    case "=" -> accumulator = accumulator;
                }

                currentOperator = operator;
                textField.setText(Long.toString(accumulator));
                currentNumber = 0;

            });
            panel.add(button);
        }
    }

    private void showCurrentNumber() {
        textField.setText(Long.toString(currentNumber));
    }
}
