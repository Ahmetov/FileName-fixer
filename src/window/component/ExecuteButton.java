package window.component;

import javax.swing.*;

public class ExecuteButton extends JButton {
    private ExecuteButton () {
        super();
        init();
    }

    private void init() {
        setText("Execute");
        setSize(80,50);
        setLocation(330, 30);
    }

    public static JButton getExecuteButton() {
        return new ExecuteButton();
    }
}
