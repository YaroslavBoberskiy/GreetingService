/**
 * Created by YB on 23.10.2015.
 */
public class GreetingService {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("\"args\" array has no data. Plese, fill it with data");
        } else {
            System.out.println("Hello" + args[0]);
        }
    }
}