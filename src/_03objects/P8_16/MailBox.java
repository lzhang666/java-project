package _03objects.P8_16;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<Message> mails = new ArrayList<>();
    public void addMessage(Message m){
        mails.add(m);
    }

    public Message getMessage(int i){
        return mails.get(i);
    }

    public void removeMessage(int i){
        mails.remove(i);
    }

}
