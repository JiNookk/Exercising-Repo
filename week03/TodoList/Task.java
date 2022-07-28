import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<String> titles = new ArrayList<>();
    private List<Boolean> checks = new ArrayList<>();
    private int index;

    public static void main(String[] args){
        Task task = new Task();

        System.out.println(task.index);

        task.index = 1;

        task.addCheck();
        task.addCheck();
        task.addCheck();
        task.addCheck();



        System.out.println(task.checks);
    }


    public List<String> getTitles() {
        return titles;
    }

    public void addTitle(String title) {
        titles.add(title);
    }

    public int listSize() {
        return titles.size();
    }

    public void addCheck() {
        checks.add(false);
    }

    public void updateIndex(String title) {
        index = titles.indexOf(title);
    }

    public void toggleChecksList() {
        boolean check = checks.get(index);
        checks.set(index, !check);
    }

    public void updateCheckBox(JCheckBox checkBox) {
        checkBox.setSelected(checks.get(index));
    }

    public void removeList() {
        titles.remove(checks.get(index));
        checks.remove(checks.get(index));
    }
}
