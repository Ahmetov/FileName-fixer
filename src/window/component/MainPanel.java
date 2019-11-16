package window.component;

import javax.swing.*;

public class MainPanel extends JPanel {
    private JTextField textField;
    private JButton button;

    private MainPanel() {
        super();
        init();
        initializeInnerComponent();
    }


    private void init() {
        setLayout(null);
    }

    private void initializeInnerComponent() {
        this.textField = FileNameInputField.getTextField();
        this.button = ExecuteButton.getExecuteButton();

        add(textField);
        add(button);
    }

    public static JPanel getPanel() {
        return new MainPanel();
    }
}
