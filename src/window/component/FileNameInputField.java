package window.component;

import javax.swing.*;
import java.awt.*;

public class FileNameInputField extends JTextField {
    private FileNameInputField() {
        super();
        initTextInput();
    }

    private void initTextInput() {
        //setFont(new Font());
        setSize(305, 50);
        setLocation(20, 30);
    }

    public static JTextField getTextField() {
        return new FileNameInputField();
    }
}
