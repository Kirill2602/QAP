package guru.qa.data;

import guru.qa.domain.Message;
import guru.qa.domain.User;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MockMessageRepository implements MessageRepository {
    @Override
    public void sendMessage(User user, Message message) {

    }

    @Override
    public List<Message> getAllMessages(User user) {
        Message msgFromStanislav0 = new Message("Привет от Стаса!", 5002, 5001, yesterdayDate());
        Message msgFromStanislav1 = new Message("Как дела?", 5002, 5001, yesterdayDate());
        return List.of(msgFromStanislav0, msgFromStanislav1);
    }

    private Date yesterdayDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_WEEK, -1);
        return cal.getTime();
    }
}
