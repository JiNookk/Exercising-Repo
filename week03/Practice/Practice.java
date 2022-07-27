import javax.swing.*;
import java.awt.*;

public class Practice {
    public static void main(String[] args){
        Practice application = new Practice();

        application.run();
    }

    private void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(590, 599);

        Container contentPane = frame.getContentPane();
        contentPane.add(frame);
        contentPane.add(new JLabel("Hi"));

        frame.setVisible(true);
    }
}
