package Complex_Tasks.Task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatSystem {
    private Map<User, List<Message>> messageForUserContainer = new HashMap<>();

    public void newMessage(User user, Message message){
        messageForUserContainer.computeIfAbsent(user, m -> new ArrayList<>())
                .add(message);
    }

    public List<Message> historyMessageForUser(User user){
        return messageForUserContainer.get(user);
    }
}
