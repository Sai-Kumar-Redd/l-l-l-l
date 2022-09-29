import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class Email{
    Header header;
    String body;
    String greetings;
    public Email(Header header, String body, String greetings) {
        super();
        this.header = header;
        this.body = body;
        this.greetings = greetings;
    }


}
class Header{

    String from;
    String to;
    public Header(String from, String to) {
        super();
        this.from = from;
        this.to = to;
    }
}


class EmailOperations{

    public int emailVerify(Email e) {
        String emailRegex = "^[a-zA-Z_]+" + "@" +"[a-zA-Z]+\\.[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher1 = pattern.matcher(e.header.from);
        Matcher matcher2 = pattern.matcher(e.header.to);
        boolean b1 = matcher1.matches();
        boolean b2 = matcher2.matches();
        if((b1&b2)==true) {
            return 2;
        }
        return 1;
    }
    public String greetingMessage(Email e) {
        String split[] = e.header.from.split("@");
        String name = split[0];
        String greet = e.greetings +" " + name;
        return greet;
    }
    public String bodyEncryption(Email e) {
        char messageBody[] = e.body.toCharArray();
        final int SHIFT_BY = 3;

        for(int i = 0; i < messageBody.length; i++) {
            if(Character.isAlphabetic(messageBody[i])) {
                if(Character.isUpperCase(messageBody[i])) {

                    messageBody[i] = (char)(messageBody[i] + SHIFT_BY);
                    if(messageBody[i] > 90) {

                        messageBody[i] = (char)(65 + (messageBody[i] % 90));
                    }
                }else {

                    messageBody[i] = (char)(messageBody[i] + SHIFT_BY);
                    if(messageBody[i] > 122) {

                        messageBody[i] = (char)(96 + (messageBody[i] % 122));
                    }
                }
            }
