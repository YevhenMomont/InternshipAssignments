import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Encoder {

    public static  ArrayList<String> stringToASCIIAndBytes(String message) {
        byte[] b = message.getBytes(StandardCharsets.US_ASCII);
        ArrayList<String> builder = new ArrayList<>();
        for (byte bite: b) {
            builder.add(String.format("%8s", Integer.toBinaryString(bite & 0xFF)).replace(" ", ""));
        }
        return builder;
    }

    public static String encoder( ArrayList<String> message) {
        StringBuilder encodedMessage = new StringBuilder();
        StringBuilder gettingMessage = new StringBuilder();
        gettingMessage.append("0");
        for (int i = 0; i < message.toArray().length; i++) {
            gettingMessage.append(message.get(i));
        }
        String[] str = gettingMessage.toString().split("(?<=([0,1]))(?!\\1)");
        for (String s : str) {
            if (s.contains("0"))
                encodedMessage.append("00 ");
            else
                encodedMessage.append("0 ");
            for (int i = 0; i < s.length(); i++) {
                encodedMessage.append("0");
            }
            encodedMessage.append(" ");
        }
        encodedMessage.setLength(encodedMessage.length() - 1);
        return encodedMessage.toString();
    }
}
