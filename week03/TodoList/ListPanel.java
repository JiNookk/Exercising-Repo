import javax.swing.*;
import java.awt.*;

public class ListPanel extends JPanel {
    ListPanel(Task task, JFrame frame) {
        this.setLayout(new GridLayout(task.listSize(),1));

        for (String title:task.getTitles()){
            JPanel listPanel = new JPanel();

            JCheckBox checkBox = new JCheckBox();

            initCheckbox(task, title, checkBox);

            checkBox.addActionListener(e -> {
                toggle(task, title, checkBox);
            });

            listPanel.add(checkBox);

            JButton listTitle = new JButton(title);

            listTitle.setBorderPainted(false);

            listTitle.addActionListener(e -> {
                toggle(task, title, checkBox);
            });
            listPanel.add(listTitle);

            JButton deleteButton = new JButton("   X   ");
            deleteButton.addActionListener( e -> {
                task.updateIndex(title);

                task.removeList();

                updateDisplay(frame, listPanel);
            });
            listPanel.add(deleteButton);

            this.add(listPanel);
        }
    }

    private void updateDisplay(JFrame frame, JPanel listPanel) {
        this.remove(listPanel);
        this.setVisible(false);
        this.setVisible(true);
        frame.setVisible(true);
    }

    private void toggle(Task task, String title, JCheckBox checkBox) {
        task.updateIndex(title);
        task.toggleChecksList();
        task.updateCheckBox(checkBox);
    }

    private void initCheckbox(Task task, String title, JCheckBox checkBox) {
        task.updateIndex(title);
        task.updateCheckBox(checkBox);
    }
}
