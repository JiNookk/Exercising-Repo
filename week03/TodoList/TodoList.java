import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TodoList {

    private JFrame frame;
    private JPanel contentPanel;
    private Task task;
    private JTextField textField;

    public static void main(String[] args) {
        TodoList application = new TodoList();

        application.run();
    }

    private void run() {
        task = new Task();

        frame = new JFrame("Todo List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        initAddPanel();

        initContentPanel();

        frame.setVisible(true);
    }

    private void initAddPanel() {
        JPanel addPanel = new JPanel();
        addPanel.setLayout(new GridLayout(2, 1));

        JButton button = new JButton("할 일 목록");
        button.setBorderPainted(false);
        addPanel.add(button);

        JPanel appendPanel = new JPanel();
        appendPanel.add(new JLabel("할 일: "));

        textField = new JTextField(10);
        appendPanel.add(textField);

        appendPanel.add(createAddButton());

        addPanel.add(appendPanel);

        frame.add(addPanel, BorderLayout.PAGE_START);
    }

    private JButton createAddButton() {
        JButton button = new JButton("추가");
        button.addActionListener(e -> {
            String title = textField.getText();

            boolean noTitle = title.equals("");
            boolean sameTitle = false;

            for (String listTitle : task.getTitles()) {
                sameTitle = title.equals(listTitle);
            }

            if (!noTitle && !sameTitle) {
                task.addTitle(title);
                task.addCheck();
            }

            ListPanel listPanel = new ListPanel(task, frame);

            showContentPanel(listPanel);
        });
        return button;
    }

    private void showContentPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);

        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
        frame.setVisible(true);
    }

    private void initContentPanel() {
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.green);
        frame.add(contentPanel);
    }
}
