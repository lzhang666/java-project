package _03objects.P8_16;

public class Driver {
    public static void main(String[] args) {

        Message m1 = new Message("John","Jen");
        m1.append("Hello 1");
        //System.out.println(m1.toString());

        Message m2 = new Message("Dave","Jen");
        m2.append("Hello 2");
        //System.out.println(m2.toString());

        Message m3 = new Message("Alice","Jen");
        m3.append("Hello 3");
        //System.out.println(m2.toString());


        MailBox box = new MailBox();

        box.addMessage(m1);
        box.addMessage(m2);
        box.addMessage(m3);

        System.out.println(box.getMessage(0));
        box.removeMessage(0);
        System.out.println();
        System.out.println(box.getMessage(0));

    }
}
