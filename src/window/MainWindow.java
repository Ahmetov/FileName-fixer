package window;

import window.component.MainPanel;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class MainWindow extends JFrame {
    private JPanel panel;

    private MainWindow() {
        super("FileName fixer");
        initFrame();
        initPanel();
        setVisible(true);
    }

    private void initFrame() {
        setSize(500,600);
        setResizable(false);
        setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initPanel() {
        panel = MainPanel.getPanel();
        getContentPane().add(panel);
    }

    private void setComponentAtPosition(JComponent component, int x, int y) {
        component.setLocation(x, y);
    }

    public static void startApplication() {
        new MainWindow();
    }
}
