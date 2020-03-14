package _03objects.P8_16;



public class Message {
    private String sender;
    private String recipient;
    private String text = "";

    public Message(String senName, String recName){
        sender = senName;
        recipient = recName;
    }

    public void append(String input){
        text += input;
    }


    @Override
    public String toString(){
        return "From: "+sender+"\nTo: "+recipient+"\nMessage: "+text;
    }

}
