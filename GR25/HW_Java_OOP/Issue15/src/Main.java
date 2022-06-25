import java.util.Scanner;

public class Main {
/* • Create interface MailDeliveryService with one method void sendMail ()
• Create class DHL that should implement the interface MailDeliveryService. Its way to send mail
is print something like: “Put a letter in an envelope, put a stamp, send”
• Create class Email that should implement the interface MailDeliveryService. Its way to send mail
is print something like: “Send by internet”
• Create class Pigeon that should implement the interface MailDeliveryService. Its way to send mail
is print something like: “ Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away ”
• Create class Sender with the method send in it. As argument this method takes the
 MailDeliveryService and send the mail using given service.
• Your program should ask user (use Scanner) how to send mail and send it using Sender */

    public static void main(String[] args) {

        MailDeliveryService mds = byWhichService(userInput());
        if (mds == null) {
            System.out.print("Please choose mail sending method by entering the digit: 1. by DHL; 2. by EMAIL; 3. by PIGEON");
            return;
        }

        Sender sender = new Sender();
        sender.send(mds);
    }

    public static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the method for sending your mail");
        return input.nextInt();
    }

    public static MailDeliveryService byWhichService(int num) {
        return switch (num) {
            case 1 -> new DHL();
            case 2 -> new Email();
            case 3 -> new Pigeon();
            default -> null;
        };
    }

}