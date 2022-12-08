package guru.qa.io;

import guru.qa.domain.User;

public interface MainView {
    void showMainFrame(User user);

    void startMessaging(User user);

    void showError(Throwable e);
}
