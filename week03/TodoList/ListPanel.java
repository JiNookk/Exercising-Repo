import javax.swing.*;
import java.awt.*;

public class ListPanel extends JPanel {
    ListPanel(Task task, JFrame frame) {
        this.setLayout(new GridLayout(task.listSize(),1));

        for (String title:task.getTitles()){
            JCheckBox checkBox = new JCheckBox();

            initCheckbox(task, title, checkBox);

            checkBox.addActionListener(e -> {
                toggle(task, title, checkBox);
            });

            this.add(checkBox);

            JButton listTitle = new JButton(title);
            listTitle.setBorderPainted(false);
            listTitle.addActionListener(e -> {
                toggle(task, title, checkBox);
            });
            this.add(listTitle);

            JButton deleteButton = new JButton("   X   ");
            deleteButton.addActionListener( e -> {

            });
            this.add(deleteButton);
        }
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
