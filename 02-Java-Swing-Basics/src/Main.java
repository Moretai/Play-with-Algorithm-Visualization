import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // 把后面放到事件分发线程
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
