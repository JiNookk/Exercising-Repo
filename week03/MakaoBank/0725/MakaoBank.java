import javax.swing.*;

public class MakaoBank {
    private JFrame frame;

    public static void main(String[] args){
        MakaoBank application = new MakaoBank();
        application.run();
    }

    public void run() {
        frame = new JFrame("MakaoBank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        initMenu();
        showContentPanel()


        frame.setVisible(true);
    }

    private void showContentPanel() {
    }

    public void initMenu() {
        JPanel panel = new JPanel();
        frame.add(panel);




   }
}
