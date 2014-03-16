package SpringLesson;

import java.util.List;

/**
 * Created by Алена on 15.03.14.
 */
public class AdvancedChatBot implements GreetingService {
    private List<String> messages;

    @Override
    public void sendGreetings() {
        if(!messages.isEmpty()) {
            System.out.println(messages.remove(0));
        }
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
