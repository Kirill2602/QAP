package guru.qa.io;

import guru.qa.domain.User;
import guru.qa.exception.AuthenticateException;
import guru.qa.servise.UserService;

import javax.swing.*;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class SwingLoginView implements LoginView {
    private final UserService userService;

    public SwingLoginView(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User doLogin() throws AuthenticateException {
        return null;
    }

    private String showInputPopup(String message) {
        return (String) JOptionPane.showInputDialog(
                null,
                message,
                APP_NAME,
                QUESTION_MESSAGE,
                USER_ICON,
                null,
                null
        );
    }
}
