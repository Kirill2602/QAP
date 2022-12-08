package guru.qa.io;

import javax.swing.*;

public interface View {
    ClassLoader cl = View.class.getClassLoader();

    String APP_NAME = "QAP";
    Icon USER_ICON = new ImageIcon(cl.getResource("user.png"));
    Icon SANTA_ICON = new ImageIcon(cl.getResource("santa.png"));
}
