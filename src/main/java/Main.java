import guru.qa.data.MockMessageRepository;
import guru.qa.data.MockUserRepository;
import guru.qa.io.SwingLoginView;
import guru.qa.io.SwingMainView;
import guru.qa.servise.Application;
import guru.qa.servise.MainUserService;
import guru.qa.servise.SecurityService;

public class Main {
    public static void main(String[] args) {
        new Application(
                new SwingLoginView(
                        new MainUserService(
                                new SecurityService(),
                                new MockUserRepository()
                        )
                ),
                new SwingMainView(
                        new MockMessageRepository()
                )
        ).run();
    }
}
