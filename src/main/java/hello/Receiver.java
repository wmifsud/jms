package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author waylon on 30/01/2017.
 */
@Component
public class Receiver
{
    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email)
    {
        System.out.println("Received <" + email + ">");
    }
}
