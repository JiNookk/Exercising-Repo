import javax.swing.*;
import java.awt.*;

//추가 버튼 -> foreach -> checkBox, title, delete를 titleSize만큼
// ListPanel에 넣는다!
//삭제 버튼 -> foreach돌게 만들 수 있나?

public class ListPanel extends JPanel {
    ListPanel(Task task, JFrame frame) {


        this.setLayout(new GridLayout(task.listSize(),1));


        for (String title:task.getTitles()){
            JPanel panel = new JPanel();


            JCheckBox checkBox = new JCheckBox();

            initCheckbox(task, title, checkBox);

            checkBox.addActionListener(e -> {
                toggle(task, title, checkBox);
            });

            panel.add(checkBox);

            JButton listTitle = new JButton(title);
            listTitle.setBorderPainted(false);
            listTitle.addActionListener(e -> {
                toggle(task, title, checkBox);
            });
            panel.add(listTitle);

            JButton deleteButton = new JButton("   X   ");
            deleteButton.addActionListener( e -> {
                task.updateIndex(title);
                task.removeList();

                this.remove(panel);
                updateDisplay(frame);
            });
            panel.add(deleteButton);

            this.add(panel);
        }
    }

    private void updateDisplay(JFrame frame) {
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
